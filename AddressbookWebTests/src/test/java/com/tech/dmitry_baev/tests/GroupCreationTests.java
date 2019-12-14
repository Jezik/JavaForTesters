package com.tech.dmitry_baev.tests;

import com.tech.dmitry_baev.model.GroupData;
import org.junit.Test;

public class GroupCreationTests extends TestBase{

    @Test
    public void createGroup() {
        app.getNavigationHelper().gotoGroupCreation();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }

}
