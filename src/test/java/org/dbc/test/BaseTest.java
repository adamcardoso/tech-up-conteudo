package org.dbc.test;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {
    @BeforeMethod
    public void setUp() {
        initializeConfig(); // Chama o método para configurar o ambiente de teste
        openInitialPage(); // Chama o método para abrir a página inicial no navegador
        maximizeBrowserWindow(); // Chama o método para maximizar a janela do navegador
    }

    @AfterMethod
    public void tearDown() {
        closeWindow(); // Chama o método para fechar a janela do navegador após o teste
    }

    private void initializeConfig() {
        // Configurações do Selenide
        Configuration.browser = "chrome"; // Define o navegador como Chrome
        Configuration.headless = false; // Define que o teste não será executado em modo headless
        Configuration.timeout = 30000; // Define o timeout em milissegundos (30 segundos)
    }

    private void openInitialPage() {
        open("https://teststore.automationtesting.co.uk/index.php"); // Abre a URL inicial no navegador
    }

    private void maximizeBrowserWindow() {
        getWebDriver().manage().window().maximize(); // Maximiza a janela do navegador
    }
}
