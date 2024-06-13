package org.dbc.page.registro;

import static com.codeborne.selenide.Selenide.$;

public class RegistroPage {
    public String msgPaginaDeCadastro(){
        return $("#main > header > h1").getText();
    }

    public void clicarNoBtnDeCadastrar() {
        $("[data-link-action='display-register-form']").click();
    }

    public void fazerCadastro() {
        $("#field-id_gender-1").click();
        $("input[name='firstname']").val("João");
        $("input[name='lastname']").val("Silva");
        $("section input[name='email']").val("testetechup2@gmail.com");
        $("input[name='password']").val("Jo@o222");
        $("input[name='birthday']").val("15/12/1992");
        $("input[name='psgdpr']").click();
        $("#customer-form footer button").click();
    }
}

