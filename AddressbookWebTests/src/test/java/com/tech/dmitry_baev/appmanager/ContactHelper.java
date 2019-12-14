package com.tech.dmitry_baev.appmanager;

import com.tech.dmitry_baev.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase{

    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void submitContactCreation() {
        click(By.cssSelector("input:nth-child(87)"));
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("mobile"), contactData.getPhoneNumber());
        type(By.name("email"), contactData.getEmail());
    }
}
