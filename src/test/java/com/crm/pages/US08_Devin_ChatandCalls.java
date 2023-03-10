package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US08_Devin_ChatandCalls {


    public WebElement ChatAndCalls;

    public US08_Devin_ChatandCalls(){
        PageFactory.initElements (Driver.getDriver (),this);
    }

@FindBy(xpath = "//span[@class = 'Chat and Calls']")
    public WebElement chatAndCalls;



}
