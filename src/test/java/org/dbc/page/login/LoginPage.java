package org.dbc.page.login;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public String msgNaPaginaDeLogin() {
        return $("#main > header > h1").getText();
    }

    public SelenideElement msgNaPaginaDeLoginComShouldHave() {
        return $("#main > header > h1").shouldHave(text("Log in to your account"));
    }

    public void clicarNoBtnLogin(){
        $("div#_desktop_user_info .hidden-sm-down").click();
    }

    public void fazerLogin(){
        $("section input[name='email']").val("testetechup@gmail.com");
        $("input[name='password']").val("Jo@o222");
        $("button#submit-login").click();
    }
}
