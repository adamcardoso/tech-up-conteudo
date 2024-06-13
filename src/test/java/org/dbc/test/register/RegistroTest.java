package org.dbc.test.register;

import org.dbc.page.login.LoginPage;
import org.dbc.page.registro.RegistroPage;
import org.dbc.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistroTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    RegistroPage registroPage = new RegistroPage();

    @Test
    void testRealizarRegistroDoUsuarioComSucesso(){
        loginPage.clicarNoBtnLogin();

        registroPage.clicarNoBtnDeCadastrar();

        String msgTelaDeCadastro = registroPage.msgPaginaDeCadastro();
        Assert.assertEquals("Create an account", msgTelaDeCadastro);

        registroPage.fazerCadastro();
    }
}
