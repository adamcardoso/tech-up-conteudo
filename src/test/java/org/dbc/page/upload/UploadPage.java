package org.dbc.page.upload;

import com.codeborne.selenide.WebDriverRunner;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertTrue;

public class UploadPage {
    public void fazerUploadDaImagem(){
        // upload file
        $("input#file-upload").uploadFile(new File("src/test/java/org/dbc/page/upload/data/cosmonaut.jpg"));

        // click the upload button
        $("#upload-btn").click();
    }

    public void assertUrlMatches(String expectedUrl){
        String url = WebDriverRunner.url();
        assertTrue(url.contains(expectedUrl));
    }
}
