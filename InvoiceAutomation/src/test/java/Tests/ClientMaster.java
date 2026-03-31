
	package Tests;
	 
	import java.io.IOException;
import java.util.List;
	import java.util.Random;
	 
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.WebDriverWait;
	 
	import com.utilities.ObjectUtilities;
	 
	import DataFiles.XpathProgramesToGetData;
	 
	public class ClientMaster {
		
			
		  WebDriver driver;
	 
		    public ClientMaster(WebDriver driver) {
		        this.driver = driver;
		    }
	 
		    
		    static XpathProgramesToGetData prop = new XpathProgramesToGetData();
		    static ObjectUtilities obj = new ObjectUtilities();
	 
		
		    public void navigateToAccountMaster() throws Exception {

		        obj.clickElement1(prop.GetdataFromPropFileAM("client.master1"));
		        obj.clickElement1(prop.GetdataFromPropFileAM("client.accountMaster"));

		    }
		    
		    
		    
		    public void openClientMaster () throws IOException {
		    	
		    	 obj.clickElement1(prop.GetdataFromPropFileAM("client.clientMaster"));
		    	
		    }
		    		   
	 
		    public void clickAddClient() throws Exception {
	 
		        obj.clickElement1(prop.GetdataFromPropFileAM("client.addClient"));
	 
		    }
		    
		    public void enterClientName(String clientName) throws Exception {
	 
		        obj.typeInElement(prop.GetdataFromPropFileAM("client.name"), clientName);
		       
		           
		        }
		    
		  
		    public void selectRandomCurrency() throws Exception {
	 
		        obj.clickElement1(prop.GetdataFromPropFileAM("client.currency"));
	 
		        obj.selectRandomOption(
		            prop.GetdataFromPropFileAM("client.currencyOptions")
		        );
		    }
		    
	   public void selectRandomvertical() throws Exception {
	 
		        obj.clickElement1(prop.GetdataFromPropFileAM("client.verticalDropdown"));
	 
		    	        obj.selectRandomOption(prop.GetdataFromPropFileAM("client.verticalOption")		
		        		
		        		);
	 
		  
	   }
	   
	   public void selectClusterHead() throws Exception{
		   obj.clickElement1(prop.GetdataFromPropFileAM("client.clusterHead"));
		   obj.selectRandomOption(prop.GetdataFromPropFileAM("client.clusteroptions")	);	
	       		
		   
	   }
	   
	   public void enterPanNo(String panNo) throws Exception {
	 
		    obj.typeInElement(
		        prop.GetdataFromPropFileAM("client.pan"), panNo);
		        
		}
	   public void enterEmailId(String EmailId)throws Exception{
		   obj.typeInElement(
			        prop.GetdataFromPropFileAM("client.email"), EmailId);
	   }
	   
	   public void enterAddress(String Address)throws Exception{
		   
		   obj.typeInElement(
			        prop.GetdataFromPropFileAM("client.address"),Address );
	   }
	   
	public void enterAddress1(String Address1)throws Exception{
		   
		   obj.typeInElement(
			        prop.GetdataFromPropFileAM("client.address1"),Address1 );
	   }
	 
	 
	 
	public void selectRandomCity() throws Exception {
	 
	     obj.clickElement1(prop.GetdataFromPropFileAM("client.cityDropdown"));
	 
	 
		        obj.selectRandomOption(prop.GetdataFromPropFileAM("client.cityOption")	);	
	       		
	     		
	}
	 
	public void enterZipcode(String zipcode)throws Exception{
		   
		   obj.typeInElement(
			        prop.GetdataFromPropFileAM("client.zipcode"),zipcode );
	}
	   
	 
	public void submitClient() throws Exception {
	 
	     obj.clickElement(prop.GetdataFromPropFileAM("client.submit"));
	 
	}
	 
	}
	 
