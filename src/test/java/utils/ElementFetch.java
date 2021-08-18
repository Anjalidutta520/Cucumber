package utils;

import StepDefinitions.AmazonSearchSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ElementFetch {

    public static WebElement getWebElement(String IdentifierType, String IdentifierValue){
        switch (IdentifierType){
            case "ID":
                return AmazonSearchSteps.driver.findElement(By.id(IdentifierValue));
            case "XPATH":
                return AmazonSearchSteps.driver.findElement(By.xpath(IdentifierValue));
            default:
                return null;
        }

    }
}
