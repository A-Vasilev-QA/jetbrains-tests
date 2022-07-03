package qa.avasilev.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selectors.*;

public class IdeaDownloadPage extends AbstractDownloadPage {

    public String getUltimateDownloadUrl() {
        SelenideElement ultimateDownloadButton =
                $$("div.wt-h3").filterBy(visible).findBy(text("Ultimate"))
                        .parent().parent().$(byText("Download"));
        return ultimateDownloadButton.getAttribute("href");
    }

    public String getCommunityDownloadUrl() {
        SelenideElement communityDownloadButton =
                $$("div.wt-h3").filterBy(visible).findBy(text("Community"))
                        .parent().parent().$(byText("Download"));
        return communityDownloadButton.getAttribute("href");
    }
}
