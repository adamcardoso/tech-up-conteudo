package org.dbc.test.form;

import com.codeborne.selenide.Configuration;
import org.dbc.page.form.FormPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class FormTest {
    FormPage formPage = new FormPage();

    @BeforeMethod
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.headless = false;
        open("https://practice-automation.com/form-fields/");
        getWebDriver().manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        closeWindow();
    }

    @Test
    void testPreencherForms(){
        formPage.preencherForms();
    }
}
