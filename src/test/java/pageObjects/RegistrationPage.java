package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    public WebDriver driver;

    public RegistrationPage(WebDriver rDriver){
        driver = rDriver;
        PageFactory.initElements(rDriver, this);
    }

    @FindBy(xpath = "//select[@id='country']")
    @CacheLookup
    public WebElement selectCountry;

    @FindBy(xpath = "//input[@id='address']")
    @CacheLookup
    public WebElement txtAddress;

    @FindBy(xpath = "//input[@id='email']")
    @CacheLookup
    public WebElement txtEmail;

    @FindBy(xpath = "//input[@id='phone']")
    @CacheLookup
    public WebElement txtPhone;

    @FindBy(xpath = "//button[@id='save']")
    @CacheLookup
    public WebElement btnSave;

    @FindBy(xpath = "//span[contains(text(), 'Saved')]")
    @CacheLookup
    public WebElement lblSave;


//    public void setCountry(String opt){
//       Select country = new Select(selectCountry);
//       country.selectByVisibleText(opt);
//    }
//
//    public void setAddress(String address){
//        txtAddress.clear();
//        txtAddress.sendKeys(address);
//    }
//
//    public void setEmail(String email){
//        txtEmail.clear();
//        txtEmail.sendKeys(email);
//    }
//
//    public String getAcknowledgeText(){
//        return lblSave.getText();
//    }


}
