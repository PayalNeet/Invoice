package TestFiles;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.utilities.ObjectUtilities;
import DataFiles.LoginCredentialToGetData;
import DataFiles.XpathProgramesToGetData;
import Tests.Login;
import Tests.Setup;

@Test
public class TestSteps {

	public static WebDriver driver;

	XpathProgramesToGetData prop;
	LoginCredentialToGetData prop1;
	ObjectUtilities obj;

	Login login;
	
	
	@Parameters("url")
	@BeforeClass
	public void setup(String url) {

	    if (Setup.driver == null) {
	        Setup setup = new Setup();
	        setup.Initialize();
	    }

	    driver = Setup.driver;  

	    driver.get(url);        

	    login = new Login();

	    prop = new XpathProgramesToGetData();
	    prop1 = new LoginCredentialToGetData();
	    obj = new ObjectUtilities();
	}
	
	@Test(priority = 01)

	public void login() throws Exception {

		login.login();

		
	}

	
}
