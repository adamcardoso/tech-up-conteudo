package org.dbc.page.geral;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class GeralPage {

    public ElementsCollection linksList(){
        return $$("body > div.head > div > header > div > div.main-menu-pages > a");
    }
}
