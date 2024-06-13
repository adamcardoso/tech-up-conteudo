package org.dbc.test.geral;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import org.dbc.page.geral.GeralPage;
import org.testng.annotations.Test;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;

public class MultiplosElementosTest {
    GeralPage geralPage = new GeralPage();

    @Test
    public void testMultipleElements() {
        open("https://selenide.org/quick-start.html");

        List<String> expectedLinks = List.of("Quick start", "Docs", "FAQ", "Blog", "Javadoc", "Users", "Quotes");

        ElementsCollection linkLists = geralPage.linksList();

        linkLists.shouldHave(CollectionCondition.texts(expectedLinks));
    }
}
