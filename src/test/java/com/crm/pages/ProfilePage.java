package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ProfilePage {


    // Introduce this page to the driver
    public ProfilePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='General']")
    public WebElement menuItem_General;

    @FindBy(xpath = "//a[.='Drive\t\t\t\t\t\t']")
    public WebElement menuItem_Drive;

    @FindBy(xpath = "//a[.='Tasks\t\t\t\t\t\t']")
    public WebElement menuItem_Tasks;

    @FindBy(xpath = "//a[.='Calendar\t\t\t\t\t\t']")
    public WebElement menuItem_Calendar;

    @FindBy(xpath = "//a[.='Conversations\t\t\t\t\t\t']")
    public WebElement menuItem_Conversations;





}
