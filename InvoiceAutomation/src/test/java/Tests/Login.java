package Tests;


import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import DataFiles.LoginCredentialToGetData;
import DataFiles.XpathProgramesToGetData;
import com.utilities.ObjectUtilities;

public class Login {

	public static WebDriver driver ;
	public static WebDriverWait wait;
  

	LoginCredentialToGetData prop1 ;
	 XpathProgramesToGetData prop ;
    static ObjectUtilities obj ;

    
   public void login() throws Exception {
	   prop1 =new LoginCredentialToGetData();
	   prop = new XpathProgramesToGetData();
	   obj = new ObjectUtilities();
       wait = new WebDriverWait(driver, Duration.ofSeconds(20));
   
       
        
		obj.typeInElement(prop.GetdataFromPropFileAM("login.username"), prop1.GetdataFromPropFile("login_username2"));
  
        obj.typeInElement(prop.GetdataFromPropFileAM("login.password"), prop1.GetdataFromPropFile("login.password2"));
        
        obj.clickElement(prop.GetdataFromPropFileAM("login.button"));
       
        
        
    }

 
  }

	
	

