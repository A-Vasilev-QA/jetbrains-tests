package qa.avasilev.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;

public class ProductsPage {

/*     private SelenideElement languageSearch = $("._wt-input__inner_hb0cay_78");
     private SelenideElement languageCheckbox = $(".filter_list div label");*/

     private String searchSelector = "._wt-input__inner_hb0cay_78";
     private String languageSelector = "label[data-test='list-item']";
     private String cardSelector = "div[data-test='cardSection']";


     public void searchLanguage(String query) {
         $(searchSelector).setValue(query);
     }

     public void clearSearch() {
         $(searchSelector).sibling(0).click();
     }

     public void selectOptionByIndex(int index) {
         $(languageSelector, index).click();
     }

     public void selectOptionByHeader(String text) {
         $$(languageSelector).findBy(text(text)).click();
     }

     public String getCardHeaderByIndex(int index) {
         return $(cardSelector, index).$("h3 a").text();
     }

     public void downloadProductByIndex(int index) {
         $(cardSelector, index).$(byText("Download")).click();
     }
}
