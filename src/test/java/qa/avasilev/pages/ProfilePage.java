package qa.avasilev.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {

    private SelenideElement profileName = $("a.dropdown-toggle");

    public String getProfileName() {
        profileName.shouldBe(visible);
        return profileName.text();
    }
}
