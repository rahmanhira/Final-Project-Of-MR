package tests;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Test;
import base.Config;
import locators.locators1;
import utils.Xls_Reader;

public class skip extends Config {

	// In this class we use- how to read data from excel file
	Xls_Reader xl = new Xls_Reader (System.getProperty("user.dir")+"/info.xlsx");
	locators1 loc  = new locators1();


		// getCellData(String sheetName,String colName,int rowNum)
		// sheetName = "testData"
		// colName = "firstName"
		// rowNum =  2

		
@Test ()
public void goingToSkip(){
	
	System.out.println("This test has been skipped");
	throw new SkipException ("Skipping because this test is no longer needed!!");
	// selenium code
		
	}

}



	

