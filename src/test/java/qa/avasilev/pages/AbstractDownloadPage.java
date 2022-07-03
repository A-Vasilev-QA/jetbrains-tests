package qa.avasilev.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import qa.avasilev.pages.components.SecondMenu;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;

public abstract class AbstractDownloadPage extends AbstractPage {

    private SelenideElement downloadHeader =
            $("#download-block").$(withTagAndText("h1", "Download"));
    private SelenideElement windowsTab = $$("[role='tab']").findBy(text("Windows"));
    private SelenideElement macOsTab = $$("[role='tab']").findBy(text("macOS"));
    private SelenideElement linuxTab = $$("[role='tab']").findBy(text("Linux"));

    public SecondMenu secondMenu = new SecondMenu();

    public void selectWindows() {
        windowsTab.click();
    }

    public void selectMacOs() {
        macOsTab.click();
    }

    public void selectLinux() {
        linuxTab.click();
    }

}
