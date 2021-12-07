package com.justPark.pages;

import com.justPark.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage()  { PageFactory.initElements(Driver.get(),this);}


    @FindBy(id ="search-box")
    public WebElement enterLocation;

    @FindBy(css = ".c-booking-date__date-display")
    public WebElement parkingFrom;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(css = ".c-booking-date__date-display")
    public WebElement parkingUntil;


    @FindBy(className ="cls-1")
    public WebElement logo;

    @FindBy(className ="c-header__menu--login-link")
    public WebElement loginLink;




    }



