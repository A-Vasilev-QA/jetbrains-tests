package qa.avasilev.pages;

import com.codeborne.selenide.SelenideElement;
import qa.avasilev.pages.components.SecondMenu;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$$;

public abstract class AbstractProductPage extends AbstractPage {


    private SelenideElement downloadButton =
            $$("a[data-test='button']").findBy(text("Download"));

    public SecondMenu secondMenu = new SecondMenu();
    public void clickDownloadButton() {
        downloadButton.click();
    }
}
