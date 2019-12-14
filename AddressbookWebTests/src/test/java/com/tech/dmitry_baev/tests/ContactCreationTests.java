package com.tech.dmitry_baev.tests;

import com.tech.dmitry_baev.model.ContactData;
import org.junit.Test;

public class ContactCreationTests extends TestBase{

    @Test
    public void createContact() {
        app.getNavigationHelper().gotoContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("Ivan", "Ivanov", "+79991112233", "somemail@some.com"));
        app.getContactHelper().submitContactCreation();
    }
}
