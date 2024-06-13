package org.dbc.test.login;

import org.dbc.page.login.LoginPage;
import org.dbc.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();


    @Test
    void testRealizarLoginDoUsuarioComSucesso(){
        loginPage.clicarNoBtnLogin();

        String msgTelaLogin = loginPage.msgNaPaginaDeLogin();
        Assert.assertEquals("Log in to your account", msgTelaLogin);

        loginPage.msgNaPaginaDeLoginComShouldHave();

        loginPage.fazerLogin();
    }
}
