package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class LoginSteps {
   @And("User clicks on Login link")
    public void clicks_on_login_link() {
       new HomePage(driver).clickOnLoginLink();

    }
    @And("User enters correct data")
    public void enters_correct_data() {
       new LoginPage(driver).enterCorrectData("rudolfwagner1995@gmail.com","Rudi.1250!");

    }
    @And("User click on Yalla button")
    public void click_on_Yalla_button() {
       new LoginPage(driver).clickOnYallaButton();

    }
    @Then("User verifies Success message is displayed")
    public void verify_Success_message() {
       new LoginPage(driver).verifyMessage("Logged in success");

    }
    @And("User enters correct email and wrong password")
    public void enter_correct_email_wrong_password(DataTable table) {
       new LoginPage(driver).enterWrongData(table);

    }
    @Then("User verifies Error is displayed")
    public void verify_Error() {
       new LoginPage(driver).verifyMessage("Login or Password incorrect");

    }
}
