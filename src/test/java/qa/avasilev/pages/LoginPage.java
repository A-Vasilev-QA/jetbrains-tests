package qa.avasilev.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private SelenideElement usernameField = $("input#username");
    private SelenideElement passwordField = $("input[name='password']");
    private SelenideElement signInButton = $("div.pull-left").$(byText("Sign In"));

    public void login (String username, String password) {
        usernameField.setValue(username);
        passwordField.setValue(password);
        signInButton.click();
    }

}
