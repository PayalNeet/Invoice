package com.utilities;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

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


	
	
	}
