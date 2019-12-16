package com.tech.dmitry_baev.tests;

import org.junit.Test;

public class GroupDeletionTests extends TestBase {

    @Test
    public void deleteGroup() {
        app.getNavigationHelper().gotoGroupCreation();
        app.getGroupHelper().initGroupDeletion();
        app.getGroupHelper().returnToGroupPage();
    }
}
