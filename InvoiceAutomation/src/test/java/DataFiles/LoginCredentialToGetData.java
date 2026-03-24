package DataFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoginCredentialToGetData {


	public String GetdataFromPropFile(String key) throws IOException {
		 Properties prop = new Properties();
		    prop.load(new FileInputStream("src/test/java/Xpath/LoginCredential.prop"));
		    
		    return prop.getProperty(key);
		}

public String getDataFromFileNavigation(String Keyentry) throws Exception, IOException {
	Properties prop = new Properties();
	prop.load(new FileInputStream("src/test/resources/LoginCredential.prop"));
	
	return prop.getProperty(Keyentry);
	
}
}
	

