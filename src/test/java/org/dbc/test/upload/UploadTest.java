package org.dbc.test.upload;

import com.codeborne.selenide.Configuration;
import org.dbc.page.upload.UploadPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class UploadTest {
    UploadPage uploadPage = new UploadPage();

    @BeforeMethod
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.headless = false;
        open("https://practice-automation.com/file-upload/");
        getWebDriver().manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        closeWindow();
    }

    @Test
    void testValidarUploadDeImagem(){
        uploadPage.assertUrlMatches("https://practice-automation.com/file-upload/");
        uploadPage.fazerUploadDaImagem();
    }
}
