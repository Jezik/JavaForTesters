package com.tech.dmitry_baev;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactCreationTests {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://localhost/addressbook/");
        login("admin", "secret");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void createContact() {
        gotoContactCreation();
        fillContactForm(new ContactData("Ivan", "Ivanov", "+79991112233", "somemail@some.com"));
        submitContactCreation();
    }

    private void submitContactCreation() {
        driver.findElement(By.cssSelector("input:nth-child(87)")).click();
    }

    private void fillContactForm(ContactData contactData) {
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).sendKeys(contactData.getName());
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).sendKeys(contactData.getLastName());
        driver.findElement(By.name("mobile")).click();
        driver.findElement(By.name("mobile")).sendKeys(contactData.getPhoneNumber());
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys(contactData.getEmail());
    }

    private void gotoContactCreation() {
        driver.findElement(By.linkText("add new")).click();
    }

    private void login(String username, String password) {
        driver.findElement(By.name("user")).sendKeys(username);
        driver.findElement(By.name("pass")).click();
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.cssSelector("input:nth-child(7)")).click();
    }
}
