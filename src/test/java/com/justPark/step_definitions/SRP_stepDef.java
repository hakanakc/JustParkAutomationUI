package com.justPark.step_definitions;

import com.justPark.pages.SRP;
import com.justPark.utilities.BrowserUtils;
import com.justPark.utilities.ConfigurationReader;
import com.justPark.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class SRP_stepDef {
    String url= ConfigurationReader.get("url");
    String location = ConfigurationReader.get("location");
    SRP srp= new SRP();
    Actions action = new Actions(Driver.get());
    @Given("The user is on SRP page")
    public void theUserIsOnSRPPage() throws InterruptedException {
        Driver.get().get(url);

    }

    @When("The user chooses a location and click submit button")
    public void theUserChoosesALocationAndClickSubmitButton() {

        srp.enterLocation.sendKeys(location);
        BrowserUtils.waitFor(2);
        srp.enterLocation.sendKeys(Keys.ENTER);
    }


    @And("The user enters 27 days duration")
    public void theUserEntersDaysDuration() throws InterruptedException {
        srp.parkingFrom.click();
     //   srp.parkingUntil.click();
   //     srp.parkingFrom.sendKeys(Keys.ENTER);
//
//
//        wait.until(ExpectedConditions.elementToBeClickable(srp.submitButton));

        BrowserUtils.clickWithJS(srp.submitButton);

        srp.submitButton.click();

       BrowserUtils.waitFor(3);

        srp.parkingFrom2.click();
        srp.rightArrow.click();
        BrowserUtils.waitFor(2);

        srp.parkingFromDate.click();

        srp.parkingUntil2.click();

        BrowserUtils.waitFor(2);

        srp.parkingUntilDate.click();

            }

    @And("the user clicks Search button")
    public void theUserClicksSearchButton() {

        BrowserUtils.clickWithJS(srp.submitButton2);
    }

    @Then("the user should not see modal up-selling monthly Saver but sees it")
    public void theUserShouldNotSeeModalUpSellingMonthlySaverButSeesIt() {

        Assert.assertTrue(srp.modalUpSellingMonthly.isDisplayed());
    }
}
