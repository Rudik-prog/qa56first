package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.ilcarro.pages.BasePage.driver;

public class HomePageSteps {
    HomePage home;
    @Given("User launches Chrome browser")
    public void launch_Chrome_browser() {
        home=new HomePage(driver);
        home.launchBrowser();
    }

    @When("User opens ilcarro  homepage")
    public void user_open_homepage() {
        home.openUrl();
    }
    @Then("User verify Homepage title is displayed")
    public void verify_homepage_title() {
        new HomePage(driver).isHomePageTitleDisplayed();
    }
    @And("User quits browser")
    public void quit_browser() {
        new HomePage(driver).quitBrowser();
    }


}
