package ObjectsUtilities;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


	public class ExtentReportManager {

	    public static ExtentReports extent;

	    public static ExtentReports getReport() {

	        if (extent == null) {
	            String path = System.getProperty("user.dir") + "/ExtentReport.html";

	            ExtentSparkReporter spark = new ExtentSparkReporter(path);
	            spark.config().setDocumentTitle("Automation Report");
	            spark.config().setReportName("Test Execution Report");

	            extent = new ExtentReports();
	            extent.attachReporter(spark);

	            extent.setSystemInfo("Tester", "Payal");
	        }

	        return extent;
	    }
	}

