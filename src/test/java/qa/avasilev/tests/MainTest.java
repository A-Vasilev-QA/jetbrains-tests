package qa.avasilev.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import qa.avasilev.config.Project;
import qa.avasilev.helpers.DriverUtils;
import qa.avasilev.pages.LoginPage;
import qa.avasilev.pages.MainPage;
import qa.avasilev.pages.ProductsPage;
import qa.avasilev.pages.ProfilePage;
import qa.avasilev.pages.idea.IdeaDownloadPage;
import qa.avasilev.pages.idea.IdeaPage;
import qa.avasilev.pages.pyCharm.PyCharmDownloadPage;
import qa.avasilev.pages.pyCharm.PyCharmPage;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MainTest extends TestBase {

    @Test
    @DisplayName("IntelliJ IDEA page can be reached from upper menu and contains correct links")
    void ideaPageCanBeOpenedFromUpperMenuTest() {

        step("Open https://www.jetbrains.com/", () -> {
            open("/");
        });

        MainPage mainPage = new MainPage();

        step("Open Dev tools upper menu", () -> {
            mainPage.mainMenu.openSubmenu("Developer Tools");
            assertEquals("IDEs", mainPage.mainMenu.getMainSubmenuFirstHeader());
        });

        step("Click IDEA menu item", () -> {
            mainPage.mainMenu.clickMainSubmenuItem("IntelliJ IDEA");
        });

        IdeaPage ideaPage = new IdeaPage();

        step("Verify IDEA page's URL and Product header", () -> {
            webdriver().shouldHave(urlContaining("idea"));
            assertEquals("IntelliJ IDEA", ideaPage.secondMenu.getProductHeader());
        });

        step("Open download page", () -> {
            ideaPage.clickDownloadButton();
        });

        IdeaDownloadPage ideaDownloadPage = new IdeaDownloadPage();

        step("Verify Windows download link", () -> {
            ideaDownloadPage.selectWindows();
            assertTrue(ideaDownloadPage.getUltimateDownloadUrl().contains("platform=windows"));
        });

        step("Verify macOS download link", () -> {
            ideaDownloadPage.selectMacOs();
            assertTrue(ideaDownloadPage.getUltimateDownloadUrl().contains("platform=mac"));
        });

        step("Verify Linux download link", () -> {
            ideaDownloadPage.selectLinux();
            assertTrue(ideaDownloadPage.getUltimateDownloadUrl().contains("platform=linux"));
        });
    }

    @Test
    @DisplayName("IntelliJ IDEA download page can be reached from search field and second menu")
    public void ideaPageCanBeSearchedTest() {

        step("Open https://www.jetbrains.com/", () -> {
            open("/");
        });

        MainPage mainPage = new MainPage();

        step("Search IntelliJ IDEA and click most relevant result", () -> {
            mainPage.mainMenu.quickSearch("IntelliJ IDEA", 0);
        });

        IdeaPage ideaPage = new IdeaPage();

        step("Click download button button in the upper menu", () -> {
            ideaPage.secondMenu.secondMenuDownload();
        });

        IdeaDownloadPage ideaDownloadPage = new IdeaDownloadPage();

        step("Verify IDEA Download page's URL and Product header", () -> {
            webdriver().shouldHave(urlContaining("idea"));
            assertEquals("IntelliJ IDEA", ideaDownloadPage.secondMenu.getProductHeader());
        });
    }

    @Test
    @DisplayName("IntelliJ IDEA can be found on products page using filters")
    public void ideaCanBeFoundInProducts() {

        step("Open https://www.jetbrains.com/", () -> {
            open("/");
        });

        MainPage mainPage = new MainPage();

        step("Click 'All products' link ", () -> {
            mainPage.openAllProducts();
        });

        ProductsPage productsPage = new ProductsPage();

        step("Search Java in input field, add it into language list and verify tag", () -> {
            productsPage.searchLanguage("Java");
            productsPage.selectOptionByIndex(0);
        });

        step("Add Kotlin to language list without search and verify tag", () -> {
            productsPage.clearSearch();
            productsPage.selectOptionByHeader("Kotlin");
        });

        step("Verify, that IDEA is the first product", () -> {
            assertEquals("IntelliJ IDEA", productsPage.getCardHeaderByIndex(0));
        });
    }

    @Test
    @DisplayName("PyCharm download page can be reached from upper menu and contains correct links")
    void pyCharmPageCanBeOpenedFromUpperMenuTest() {

        step("Open https://www.jetbrains.com/", () -> {
            open("/");
        });

        MainPage mainPage = new MainPage();

        step("Open Dev tools upper menu", () -> {
            mainPage.mainMenu.openSubmenu("Developer Tools");
            assertEquals("IDEs", mainPage.mainMenu.getMainSubmenuFirstHeader());
        });

        step("Click PyCharm menu item", () -> {
            mainPage.mainMenu.clickMainSubmenuItem("PyCharm");
        });

        PyCharmPage pyCharmPage = new PyCharmPage();

        step("Verify PyCharm page's URL and Product header", () -> {
            webdriver().shouldHave(urlContaining("pycharm"));
            assertEquals("PyCharm", pyCharmPage.secondMenu.getProductHeader());
        });

        step("Open download page", () -> {
            pyCharmPage.clickDownloadButton();
        });

        PyCharmDownloadPage pyCharmDownloadPage = new PyCharmDownloadPage();

        step("Verify Windows download link", () -> {
            pyCharmDownloadPage.selectWindows();
            assertTrue(pyCharmDownloadPage.getProfessionalDownloadUrl().contains("platform=windows"));
        });

        step("Verify macOS download link", () -> {
            pyCharmDownloadPage.selectMacOs();
            assertTrue(pyCharmDownloadPage.getProfessionalDownloadUrl().contains("platform=mac"));
        });

        step("Verify Linux download link", () -> {
            pyCharmDownloadPage.selectLinux();
            assertTrue(pyCharmDownloadPage.getProfessionalDownloadUrl().contains("platform=linux"));
        });
    }

    @Test
    @DisplayName("PyCharm page can be reached from search field and second menu")
    public void pyCharmPageCanBeSearchedTest() {

        step("Open https://www.jetbrains.com/", () -> {
            open("/");
        });

        MainPage mainPage = new MainPage();

        step("Search PyCharm and click most relevant result", () -> {
            mainPage.mainMenu.quickSearch("PyCharm", 0);
        });

        PyCharmPage pyCharmPage = new PyCharmPage();

        step("Click download button button in the upper menu", () -> {
            pyCharmPage.secondMenu.secondMenuDownload();
        });

        PyCharmDownloadPage pyCharmDownloadPage = new PyCharmDownloadPage();

        step("Verify PyCharm Download page's URL and Product header", () -> {
            webdriver().shouldHave(urlContaining("pycharm"));
            assertEquals("PyCharm", pyCharmDownloadPage.secondMenu.getProductHeader());
        });
    }

    @Test
    @DisplayName("PyCharm can be found on products page using filters")
    public void pyCharmCanBeFoundInProducts() {

        step("Open https://www.jetbrains.com/", () -> {
            open("/");
        });

        MainPage mainPage = new MainPage();

        step("Click 'All products' link ", () -> {
            mainPage.openAllProducts();
        });

        ProductsPage productsPage = new ProductsPage();

        step("Search Python in input field, add it into language list and verify the tag", () -> {
            productsPage.searchLanguage("Python");
            productsPage.selectOptionByIndex(0);
        });

        step("Verify, that PyCharm is the second product", () -> {
            assertEquals("PyCharm", productsPage.getCardHeaderByIndex(1));
        });
    }

    @Test
    @DisplayName("User can sign into profile with correct credentials")
    public void loginTest() {
        step("Open https://www.jetbrains.com/", () -> {
            open("/");
        });

        MainPage mainPage = new MainPage();

        step("Click the profile button", () -> {
            mainPage.mainMenu.navigateToProfile();
        });

        LoginPage loginPage = new LoginPage();

        step("Enter the credentials", () -> {
            loginPage.login(Project.config.login(), Project.config.password());
        });

        ProfilePage profilePage = new ProfilePage();

        step("Verify profile name after logged in", () -> {
            assertEquals(Project.config.profileName(), profilePage.getProfileName());
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open https://www.jetbrains.com/", () -> {
            open("/");
        });

        step("Page title should have text 'JetBrains: Essential tools for software developers and teams'", () -> {
            String expectedTitle = "JetBrains: Essential tools for software developers and teams";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open https://www.jetbrains.com/", () -> {
            open("/");
        });

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}