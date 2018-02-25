package utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class webDriverApi {
	public WebDriver driver;
	public static Logger APPLICATION_LOGS = Logger.getLogger("myLogs");
	
	/// -------------------- to deal with editBox (TYPE)---------------------
	public void typeByXpath (String locator, String value){
		driver.findElement(By.xpath(locator)).clear();
		driver.findElement (By.xpath(locator)).sendKeys(value);
	}
	public void typeByCss (String locator, String value){
		driver.findElement (By.cssSelector(locator)).sendKeys(value);

	}
	public void typeById (String locator, String value){
		driver.findElement (By.id(locator)).sendKeys(value);

	}
	public void typeByName (String locator, String value){
		driver.findElement (By.name(locator)).sendKeys(value);

	}
	
	/// -------------------- to deal with CLICK---------------------
	public void clickByXpath (String locator){
		driver.findElement (By.xpath(locator)).click();

	}
	public void clickByCss (String locator){
		driver.findElement (By.cssSelector(locator)).click();

	}
	public void clickById (String locator){
		driver.findElement (By.id(locator)).click();

	}
	public void clickByName (String locator){
		driver.findElement (By.name(locator)).click();

	}
	
	
	// dropdown
	public  void dropDownByXpath (String locator, String text){
		WebElement dropDownListBox = driver.findElement(By.xpath(locator));
		Select clickThis = new Select(dropDownListBox);
		clickThis.selectByVisibleText(text);
			}
}