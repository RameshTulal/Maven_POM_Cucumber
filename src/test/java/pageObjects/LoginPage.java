package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver rDriver){
        driver = rDriver;
        PageFactory.initElements(rDriver, this);
    }

    @FindBy(id = "name")
    @CacheLookup
    public WebElement txtEmail;

    @FindBy(id = "password")
    @CacheLookup
    public WebElement txtPassword;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    @CacheLookup
    public WebElement btnLogin;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    @CacheLookup
    public WebElement btnSave;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    @CacheLookup
    public WebElement btnLogout;

    @FindBy(xpath = "//p[@id='greetings']")
    @CacheLookup
    public WebElement lblGreetings;
    
    
//    public void enterEmailID(String email){
//    	 txtEmail.clear();
//       txtEmail.sendKeys(email);
//    }
    
   





}
