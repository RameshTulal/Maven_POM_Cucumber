package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.LoginPage;
import pageObjects.RegistrationPage;

public class BaseClass {
    public WebDriver driver = null;
    public LoginPage objLoginPage;
    public RegistrationPage objRegdPage;
    
    

    // common methods
    
    public void clickElement(WebElement elementName) {    	
    	elementName.click();     	
	}
       
    public void setText(WebElement textBoxName, String text){    	
    	textBoxName.clear();
    	textBoxName.sendKeys(text);     	
	}
    
    public String getText(WebElement textBoxName) {   
    	return textBoxName.getText();
	}
    
    public void selectDropdownValue(WebElement selectElement, String opt){
        Select country = new Select(selectElement);
        country.selectByVisibleText(opt);
     }

    public void closeBrowser(WebDriver driver) {    
    	driver.close();    
	}
    
    public WebElement explicitWait(WebElement elementTarget) {
	    WebDriverWait expWait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    elementTarget = expWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("")));
	    return elementTarget;
    }    
   

}
