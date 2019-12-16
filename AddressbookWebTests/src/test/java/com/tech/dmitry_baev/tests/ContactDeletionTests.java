package com.tech.dmitry_baev.tests;

import org.junit.Test;

public class ContactDeletionTests extends TestBase {

    @Test
    public void deleteContact() {
        app.getContactHelper().initContactDeletion();
        app.getContactHelper().submitContactDeletion();
    }
}
