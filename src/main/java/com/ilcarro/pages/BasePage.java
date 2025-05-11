package com.ilcarro.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class BasePage {
    public static WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void launchBrowser() {
        System.err.close();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public void openUrl(){
        driver.get("https://ilcarro.web.app");
    }
    public void click(WebElement element) {
        element.click();
    }

    public void type(WebElement element, String text) {
        if (text != null) {
            click(element);
            element.clear();
            element.sendKeys(text);
        }
    }
    public boolean isContainsText(String text, WebElement element) {
        return element.getText().contains(text);
    }
    public boolean isElementVisible(WebElement element) {
        try {
            element.isDisplayed();
            return true;
        }catch (NoSuchElementException exception) {
            exception.getMessage();
            return false;
        }
    }
    public void quitBrowser() {
        driver.quit();
    }

    public void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
