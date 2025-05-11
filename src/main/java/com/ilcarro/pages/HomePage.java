package com.ilcarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//h1[1]")
    WebElement homePageTitle;

    public HomePage isHomePageTitleDisplayed() {
        assert isElementVisible(homePageTitle);
        return this;
    }
    @FindBy(css = ".navigation-link:nth-child(6)")
    WebElement loginLink;

    public LoginPage clickOnLoginLink() {
        click(loginLink);
        return new LoginPage(driver);
    }
}

