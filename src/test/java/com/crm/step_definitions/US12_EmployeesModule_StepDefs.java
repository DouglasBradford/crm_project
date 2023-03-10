package com.crm.step_definitions;

import com.crm.pages.EmployeesPage_Yana;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class US12_EmployeesModule_StepDefs {

    EmployeesPage_Yana employeesPage = new EmployeesPage_Yana();
    @When("the user is on the homepage and clicks the Employees module")
    public void the_user_is_on_the_homepage_and_clicks_the_employees_module() {

        employeesPage. employeesModule.click();

    }

    @Then("the user sees the horizontal menu bar")
    public void the_user_sees_the_horizontal_menu_bar(List<String> expectedOptions) {

        List <String> actualOptions = new ArrayList<>();
        actualOptions.add(employeesPage.companyStructure.getText());
        actualOptions.add(employeesPage.findEmployee.getText());
        actualOptions.add(employeesPage.phoneDirectory.getText());
        actualOptions.add(employeesPage.staffChanges.getText());
        actualOptions.add(employeesPage.efficiencyReport.getText());
        actualOptions.add(employeesPage.honoredEmployee.getText());
        actualOptions.add(employeesPage.birthdays.getText());
        actualOptions.add(employeesPage.newPage.getText());


        Assert.assertEquals(actualOptions, expectedOptions);
    }




}
