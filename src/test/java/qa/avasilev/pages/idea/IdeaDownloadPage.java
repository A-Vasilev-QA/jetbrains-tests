package qa.avasilev.pages.idea;

import com.codeborne.selenide.SelenideElement;
import qa.avasilev.pages.AbstractDownloadPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$$;

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
