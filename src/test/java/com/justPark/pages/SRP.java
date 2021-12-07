package com.justPark.pages;

import com.justPark.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SRP extends BasePage {

    public SRP()  { PageFactory.initElements(Driver.get(),this);}

   @FindBy(id = "search-box")
    public WebElement enterLocation2;

   @FindBy(css= ".c-booking-date__date-display")
    public WebElement parkingFrom2;
// Select 1th Jan
    @FindBy(xpath= "//div/div[2]/div/table/tbody/tr[1]/td[7]")
    public WebElement parkingFromDate;

    @FindBy(xpath= "//div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[5]/td[5]")
    public WebElement parkingUntilDate;

  @FindBy(xpath = "(//span[@class='c-booking-date__date-display'])[2]")
    public WebElement parkingUntil2;

  @FindBy(className = "c-searchform__submit")
    public WebElement submitButton2;

    @FindBy(xpath = "/html/body/div[5]/div/div")
    public WebElement modalUpSellingMonthly;

  @FindBy(className = "c-datepicker__close-bt")
    public WebElement datepickerClose;

  @FindBy(className = "(//span[@class='c-price__total-price'])[1]")
  public WebElement monthlyPrice;

  @FindBy(css =".c-chevron-icon.c-chevron-icon--right")
  public WebElement rightArrow;

// asagiya mutlaka bak
  @FindBy(linkText = "//*[text()='Use my current dates']")
    public WebElement useMyCurrentDate;
    @FindBy(linkText = "//*[text()='Switch to monthly parking']")
    public WebElement switchToMonthlyParkings;





}
