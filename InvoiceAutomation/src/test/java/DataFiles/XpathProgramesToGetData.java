package DataFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class XpathProgramesToGetData {
	
	public String GetdataFromPropFileAM( String Keyentry) throws IOException {
		Properties 	prop= new Properties();
		prop.load(new FileInputStream("src\\test\\java\\Xpath\\LoginTests.prop"));
		
		return prop.getProperty(Keyentry);
}
public String getDataFromFileNavigation(String Keyentry) throws Exception, IOException {
	Properties prop = new Properties();
	prop.load(new FileInputStream("src/test/java/XpathsFiles/LoginTests.prop"));
	
	return prop.getProperty(Keyentry);
	
}
}
