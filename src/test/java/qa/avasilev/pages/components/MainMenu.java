package qa.avasilev.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static java.lang.String.format;

public class MainMenu {

    private SelenideElement mainMenu = $(".main-menu");
    private SelenideElement mainSubmenu = $("div[data-test='main-submenu']");
    private SelenideElement searchButton = $("[data-test='site-header-search-action']");
    private SelenideElement searchInput = $("[data-test='search-input']");
    private SelenideElement searchResults = $("[data-test='search-results']");

    private String mainMenuButtonSelector = ".main-menu-item[data-test-marker='%s']";
    private String submenuButtonSelector = "a span span";
    private String seacrhPositionSelector = "a[position='%d']";

    public void openSubmenu(String submenuName) {
        mainMenu.shouldBe(visible);
        $(format(mainMenuButtonSelector, submenuName)).click();
        mainSubmenu.shouldBe(visible);
    }

    public void clickMainSubmenuItem(String itemName) {
        $$(submenuButtonSelector).findBy(text(itemName)).click();
    }

    public void quickSearch(String query, int position) {
        searchButton.click();
        searchInput.shouldBe(visible).sendKeys(query);
        searchResults.shouldBe(visible);
        searchResults.$(format(seacrhPositionSelector,position)).click();
    }

    public String getMainSubmenuFirstHeader(){
        return mainSubmenu.$("h5").text();
    }
}
