package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObjects.LoginPage;
import pageObjects.RegistrationPage;

public class BaseClass {
    public WebDriver driver = null;
    public LoginPage objLoginPage;
    public RegistrationPage objRegdPage;
    
    

    // common methods
    
    public void clickElement(WebElement elementName) throws InterruptedException {    	
    	elementName.click(); 
    	 Thread.sleep(1000);
	}
       
    public void setText(WebElement textBoxName, String text) throws InterruptedException {
    	Thread.sleep(1000);
    	textBoxName.clear();
    	textBoxName.sendKeys(text); 
    	Thread.sleep(1000);
	}
    
    public String getText(WebElement textBoxName) throws InterruptedException {   
    	Thread.sleep(1000);
    	return textBoxName.getText();
	}
    
    public void selectDropdownValue(WebElement selectElement, String opt){
        Select country = new Select(selectElement);
        country.selectByVisibleText(opt);
     }

    public void closeBrowser(WebDriver driver) throws InterruptedException {
    	Thread.sleep(1000);
    	driver.close();
    	Thread.sleep(1000);
	}


}
