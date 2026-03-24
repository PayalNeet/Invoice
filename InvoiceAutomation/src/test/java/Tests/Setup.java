//package Tests;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.Test;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//
//@Test
//public class Setup {
//	public static int defaultTimeOutForObjectWait=120;
//	public static WebDriver driver;
//	
//	public void Initialize() {
//		
//		System.out.println("BeforeClassSetup");
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--remote-allow-origins=*");
//		 WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver(opt); 
//		driver.manage().window().maximize();
//		 driver.get("http://192.168.10.94:7011/#/dashboard");
//	
//	
//	}
//	
//}

package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Setup {

    public static WebDriver driver;
    public static int defaultTimeOutForObjectWait = 120;

   
    public void Initialize() {

        System.out.println("BeforeSuite Setup Started");

        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        System.out.println("Browser Launched Successfully!");
    }
}
