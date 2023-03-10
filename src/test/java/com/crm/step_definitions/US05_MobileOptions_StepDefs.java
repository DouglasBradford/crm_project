package com.crm.step_definitions;

import com.crm.pages.DesktopOptionsPage;
import com.crm.pages.LoginPage;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US05_MobileOptions_StepDefs {
    LoginPage loginPage = new LoginPage();
    DesktopOptionsPage desktopOptionsPage = new DesktopOptionsPage();
    @Given("the user logged in with hr credentials username as {string} and password as {string}")
    public void theUserLoggedInWithHrCredentialsUsernameAsAndPasswordAs(String username, String password) {
        loginPage.userName.sendKeys(username);
        loginPage.password.sendKeys(password);
        loginPage.submit.click();

    }

    @Given("the user is on the landing page")
    public void the_user_is_on_the_landing_page() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Portal";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
    @Then("verify the following mobile app options are displayed")
    public void verify_the_following_mobile_app_options_are_displayed(List<String> expectedOptions) {
        List<String> actualOptions = new ArrayList<>();

        for(WebElement optionItem : desktopOptionsPage.desktopOptions) {
            actualOptions.add(optionItem.getText());
        }
        Assert.assertTrue(actualOptions.containsAll(expectedOptions));
    }

}
