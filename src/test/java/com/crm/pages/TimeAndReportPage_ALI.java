package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeAndReportPage_ALI {

    public TimeAndReportPage_ALI(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "login-inp")
    public WebElement username;

    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(className = "login-btn")
    public WebElement loginbutton;

    @FindBy(linkText="Time and Reports")
    public WebElement TimeandReports;

    @FindBy(linkText ="Worktime" )
    public WebElement worktime;





}
