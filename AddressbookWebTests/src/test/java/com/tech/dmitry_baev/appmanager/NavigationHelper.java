package com.tech.dmitry_baev.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void gotoGroupCreation() {
       click(By.linkText("groups"));
    }

    public void gotoContactCreation() {
        click(By.linkText("add new"));
    }
}
