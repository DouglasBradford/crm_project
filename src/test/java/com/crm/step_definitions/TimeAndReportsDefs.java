package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.pages.TimeAndReportPage_ALI;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TimeAndReportsDefs {

    TimeAndReportPage_ALI timeAndReportPage = new TimeAndReportPage_ALI();
    @Given("user logged in with username as {string} and password as {string}")
    public void user_logged_in_with_username_as_and_password_as(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);

    }
    @When("user clicks the Time and Reports page")
    public void user_clicks_the_time_and_reports_page() {
        Driver MyDriverManager = null;
        WebDriver driver = MyDriverManager.getDriver();
        WebElement reportsLink = driver.findElement(By.linkText("Time and Reports"));
        ((WebElement) reportsLink).click();

    }


    @Then("user should be on worktime page")
    public void user_should_be_on_worktime_page() {
       TimeAndReportPage_ALI worktime=null;
       assert timeAndReportPage.worktime.isDisplayed();


    }
    }










