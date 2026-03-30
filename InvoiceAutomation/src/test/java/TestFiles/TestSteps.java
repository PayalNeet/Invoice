package TestFiles;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.utilities.ObjectUtilities;
import DataFiles.LoginCredentialToGetData;
import DataFiles.XpathProgramesToGetData;
import Tests.ClientMaster;
import Tests.Login;
import Tests.RandomGenerateData;
import Tests.Setup;

@Test
public class TestSteps {

	public static WebDriver driver;
	XpathProgramesToGetData prop;
	LoginCredentialToGetData prop1;
	ObjectUtilities obj;

	Login login;
	 ClientMaster client;
	
	
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
	   
	    client = new ClientMaster(driver);
	    

	    prop = new XpathProgramesToGetData();
	    prop1 = new LoginCredentialToGetData();
	    obj = new ObjectUtilities();
	}
	
	@Test(priority = 01)

	public void login() throws Exception {

		login.login();

		
	}
	
	@Test(priority = 02)
	public void addClientTest() throws Exception {

		client.clickonmaster();
		
		client.openClientMaster();

		client.clickAddClient();
		
		String clientName = RandomGenerateData.generateClientName();
	    client.enterClientName(clientName);
	
	    client.selectRandomCurrency();
	    client.selectRandomvertical();
	    client.selectClusterHead();
	    String PanNo = RandomGenerateData.generatePan();
	  client.enterPanNo(PanNo);
	  
	  String EmailId = RandomGenerateData.generateEmail();
	  client.enterEmailId(EmailId);
		
	  String address = RandomGenerateData.generateAddress();
	  client.enterAddress(address);
	  
	  String address1 = RandomGenerateData.generateAddress();
	  client.enterAddress1(address1);
	  
	 client.selectRandomCity();
	 
	  String zipcode = RandomGenerateData.generateZipCode();   
	client.enterZipcode(zipcode);
	    
	client.submitClient();
	
	}
	
}
