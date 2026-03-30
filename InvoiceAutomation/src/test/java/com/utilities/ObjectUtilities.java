package com.utilities;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DataFiles.XpathProgramesToGetData;
import Exceptions.ElementNotLocatedOnUIException;
import Tests.Setup;

public class ObjectUtilities {

    WebDriver driver = Setup.driver;
    static XpathProgramesToGetData prop = new XpathProgramesToGetData();
    
    public void typeInElement(String xpath, String value) {
        driver.findElement(By.xpath(xpath)).sendKeys(value);
    }
    
    public void clickElement(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

  

    public void login(String username, String password) throws IOException, Exception {

        typeInElement(prop.getDataFromFileNavigation("login_username"), username);
        typeInElement(prop.getDataFromFileNavigation("login_password"), password);
        clickElement(prop.getDataFromFileNavigation("login.button"));

       
    }
    
    public void openMasterMenu() throws IOException, Exception {

        clickElement1(prop.getDataFromFileNavigation("client.master "));

    }
    
    
    public void clickElement1(String xpath) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))
        );

        try {
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        } 
        catch (ElementClickInterceptedException e) {

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", element);
        }
    }
    public void openAccountMaster() throws IOException, Exception {

        clickElement(prop.getDataFromFileNavigation("account_master"));

    }
    
    public void openClientMaster() throws IOException, Exception {

        clickElement(prop.getDataFromFileNavigation("client_master"));

    }

    public void clickAddClient() throws IOException, Exception {

        clickElement(prop.getDataFromFileNavigation("add_client"));

    }
    public void enterClientName(String name) throws IOException, Exception {

        typeInElement(prop.getDataFromFileNavigation("client_name"), name);

    }
    
    public void selectRandomOption(By optionsLocator) {

        List<WebElement> options = driver.findElements(optionsLocator);

        Random rand = new Random();
        int index = rand.nextInt(options.size());

        options.get(index).click();
    }
    
    public void selectRandomOption(String optionsXpath) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        By optionsBy = By.xpath(optionsXpath);

        List<WebElement> options = wait.until(
            ExpectedConditions.visibilityOfAllElementsLocatedBy(optionsBy)
        );

        if (options.size() == 0) {
            throw new RuntimeException("No dropdown options found");
        }

        Random rand = new Random();
        int index = rand.nextInt(options.size());

        options.get(index).click();
    }
    
    public void clickElementByJS(WebElement element) throws ElementNotLocatedOnUIException {

    	System.out.println("Attempting to click element using JavaScript...");

        try {
            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(element));

            
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", element);

           
            js.executeScript("arguments[0].click();", element);

           
            try {
            	System.out.println("Clicked successfully via JS: " + element.getAttribute("outerHTML"));
            } catch (Exception e) {
            	System.out.println ("Clicked successfully via JS (outerHTML not available)");
            }

        } catch (Exception e) {
        	System.out.println    ("Failed to click element using JS: " + e.getMessage());
            throw new ElementNotLocatedOnUIException();
        }
    }
    }


	
	
	
