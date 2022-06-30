package qa.avasilev.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private SelenideElement mainMenu = $(".main-menu"),
            devToolsMenuButton = $("[data-test-marker='Developer Tools']"),
            mainSubmenu = $("div[data-test='main-submenu']"),
            devToolsIdeaMenuItem = $$("a span span").findBy(text("IntelliJ IDEA"));

    public void openDevTools() {
        mainMenu.shouldBe(visible);
        devToolsMenuButton.click();
        mainSubmenu.shouldHave(text("IDEs"));
    }

    public void clickIdeaMenuItem() {
        mainSubmenu.shouldHave(text("IDEs"));
        devToolsIdeaMenuItem.click();
    }

}
