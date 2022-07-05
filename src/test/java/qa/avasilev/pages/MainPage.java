package qa.avasilev.pages;

import com.codeborne.selenide.SelenideElement;
import qa.avasilev.pages.components.MainMenu;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static java.lang.String.format;

public class MainPage extends AbstractPage {

    private SelenideElement allProductsLink = $(withTagAndText("a", "All products"));

    public void openAllProducts() {
        allProductsLink.click();
    }

}
