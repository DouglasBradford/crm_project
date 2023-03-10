package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EmployeesPage_Yana {

    public EmployeesPage_Yana(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//span[@class='menu-item-link-text'][normalize-space() = 'Employees']")
    public WebElement employeesModule;

    @FindBy (linkText = "Company Structure")
    public WebElement companyStructure;

    @FindBy (linkText = "Find Employee")
    public WebElement findEmployee;

    @FindBy (linkText = "Telephone Directory")
    public WebElement phoneDirectory;

    @FindBy (linkText = "Staff Changes")
    public WebElement staffChanges;

    @FindBy (linkText = "Efficiency Report")
    public WebElement efficiencyReport;

    @FindBy (linkText = "Honored Employees")
    public WebElement honoredEmployee;

    @FindBy (linkText = "Birthdays")
    public WebElement birthdays;

    @FindBy (linkText = "New page")
    public WebElement newPage;



}

