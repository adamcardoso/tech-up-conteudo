package org.dbc.page.form;

import static com.codeborne.selenide.Selenide.$;

public class FormPage{

    public void preencherForms(){
        // input name
        $("input#name").val("Luffy");

        // checkboxes
        $("#feedbackForm > label:nth-child(9)").click();
        $("#feedbackForm > label:nth-child(27)").click();

        // dropdown
        $("#siblings").selectOption("Maybe");

        // inputs
        $("input#email").val("teste@gmail.com");
        $("textarea#message").val("Hello world!");

        // button
        $("#submit-btn").click();
    }
}
