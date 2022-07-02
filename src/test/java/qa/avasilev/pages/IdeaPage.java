package qa.avasilev.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;

public class IdeaPage extends AbstractProductPage {

    private SelenideElement downloadButton = $("a[data-test='button']").find(byText("Download"));

}
