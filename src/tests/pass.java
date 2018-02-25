

package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import base.Config;
import locators.locators1;
import utils.Xls_Reader;

public class pass extends Config {

	// In this class we use- how to read data from excel file
	Xls_Reader xl = new Xls_Reader (System.getProperty("user.dir")+"/info.xlsx");
	locators1 loc  = new locators1();


	@Test
	public void readFromXl (){

		// getCellData(String sheetName,String colName,int rowNum)
		// sheetName = "testData"
		// colName = "firstName"
		// rowNum =  2

		typeByXpath (loc.emailLoc, xl.getCellData("Info", "email", 2));

	};

	@Test
	public void writeIntoXl(){
		String actText = driver.findElement(By.xpath(loc.signUpTextLoc)).getText();
		xl.setCellData("Info", "textTest", 2, actText);
	}

}


/*
//public class SkipDisable extends Config {
// Aim for this class
// =============================
// skipping the test
// Disable the test


	

@Test ()
public void goingToSkip(){
	
	System.out.println("This test has been skipped");
	throw new SkipException ("Skipping because this test is no longer needed!!");
	// selenium code

}

@Test (enabled=false)
public void goingToDisable(){

	System.out.println("This test has been disabled");
}
*/