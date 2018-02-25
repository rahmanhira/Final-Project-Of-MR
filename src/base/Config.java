package base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import utils.webDriverApi;
public class Config extends webDriverApi {

	//this it the configuration class 
	//initialize

	@Parameters ("browser")//It helps to test cross browser testing 
	@BeforeTest
	public void setUp(String browserName){
		APPLICATION_LOGS.debug("Test Suite S-T-A-R-T");
		if (browserName.equalsIgnoreCase("ch")){
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/driver/chromedriver");
			driver = new ChromeDriver();
			APPLICATION_LOGS.debug("Chrome Browser started");

		}
		else if (browserName.equalsIgnoreCase("ff")){
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/driver/geckodriver");
			driver = new FirefoxDriver() ;
			APPLICATION_LOGS.debug("Firefox Browser started");
		}

		driver.get("https://www.facebook.com");
		APPLICATION_LOGS.debug("Facebook opened");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterTest
	public void teardown(){
		driver.close();
		driver.quit();
		APPLICATION_LOGS.debug("Test Suite E-N-D");
		//Intialize the driver 
		//open browser
		//go to the url
		//close the browser
		
		
			
	
	
	}
}

