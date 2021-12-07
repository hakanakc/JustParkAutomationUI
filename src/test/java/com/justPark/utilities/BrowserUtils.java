package com.justPark.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {

    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }

    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
        /* Clicks on an element using JavaScript
         *
         * @param element
         */
        public static void clickWithJS (WebElement element){
            ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", element);
            ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", element);
        }


    }






