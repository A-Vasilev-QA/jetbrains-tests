package qa.avasilev.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SecondMenu {

    private SelenideElement downloadItem = $(".menu-second__download-button");
    private SelenideElement secondMenuHeader = $(".menu-second-title-box__title");

    public void secondMenuDownload() {
        downloadItem.click();
    }

    public String getProductHeader() {
        return secondMenuHeader.text();
    }
}
