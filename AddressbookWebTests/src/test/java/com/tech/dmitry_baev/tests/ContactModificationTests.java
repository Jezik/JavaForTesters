package com.tech.dmitry_baev.tests;

import com.tech.dmitry_baev.model.ContactData;
import org.junit.Test;

public class ContactModificationTests extends TestBase {

    @Test
    public void modificateContact() {
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Peter", "Petrov", "+79991112233", "another@somemail.com"));
        app.getContactHelper().submitContactModification();
    }
}
