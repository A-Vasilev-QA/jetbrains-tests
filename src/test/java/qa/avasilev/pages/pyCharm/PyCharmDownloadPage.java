package qa.avasilev.pages.pyCharm;

import com.codeborne.selenide.SelenideElement;
import qa.avasilev.pages.AbstractDownloadPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$$;

public class PyCharmDownloadPage extends AbstractDownloadPage {

    public String getProfessionalDownloadUrl() {
        SelenideElement ultimateDownloadButton =
                $$("div.wt-h3").filterBy(visible).findBy(text("Professional"))
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
