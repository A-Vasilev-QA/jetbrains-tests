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

    private String mainMenuButtonSelector = ".main-menu-item[data-test-marker='%s']";
    private String submenuButtonSelector = "a span span";

    public void openSubmenu(String submenuName) {
        mainMenu.shouldBe(visible);
        $(format(mainMenuButtonSelector, submenuName)).click();
        mainSubmenu.shouldBe(visible);
    }

    public void clickMainSubmenuItem(String itemName) {
        $$(submenuButtonSelector).findBy(text(itemName)).click();
    }

    public String getMainSubmenuFirstHeader(){
        return mainSubmenu.$("h5").text();
    }
}
