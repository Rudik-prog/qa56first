package com.ilcarro.pages;

import com.google.common.collect.Table;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;

import static java.awt.SystemColor.text;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "email")
    WebElement emailInput;
    @FindBy(id = "password")
    WebElement passwordInput;

    public LoginPage enterCorrectData(String email, String password) {
        type(emailInput, email);
        type(passwordInput, password);
        return this;
    }
    @FindBy(css ="[type='submit']")
    WebElement yallaButton;

    public LoginPage clickOnYallaButton() {
        click(yallaButton);
        return this;
    }
    @FindBy(css = "h2.message")
    WebElement message;

    public LoginPage verifyMessage(String text) {
        pause(1000);
        assert isContainsText(text, message);
        return this;
    }

    public LoginPage enterWrongData(DataTable table) {
        List<Map<String,String>> dataTable =table.asMaps();
        String email = dataTable.get(0).get("email");
        String password = dataTable.get(0).get("password");
        enterCorrectData(email,password);
        return this;
    }
}
