package qa.avasilev.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.withTagAndText;
import static com.codeborne.selenide.Selenide.$;

public class MainPage extends AbstractPage {

    private SelenideElement allProductsLink = $(withTagAndText("a", "All products"));

    public void openAllProducts() {
        allProductsLink.click();
    }

}
