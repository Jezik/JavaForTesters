package com.tech.dmitry_baev.tests;

import com.tech.dmitry_baev.model.GroupData;
import org.junit.Test;

public class GroupModificationTests extends TestBase {

    @Test
    public void modificateGroup() {
        app.getNavigationHelper().gotoGroupCreation();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("test4", "test5", "test6"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
    }
}
