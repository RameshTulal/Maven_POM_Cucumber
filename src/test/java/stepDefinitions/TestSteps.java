package stepDefinitions;

import io.cucumber.java.en.*;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.LoginPage;
import pageObjects.RegistrationPage;



public class TestSteps extends BaseClass {
	

    @Given("Launch URL {string} in Chrome browser")
    public void launch_application(String url) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"//Drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        objLoginPage = new LoginPage(driver);
        objRegdPage = new RegistrationPage(driver);    
        
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Then("Validate login page displayed")
    public void validate_login_page_displayed() {

    }

    @Then("Validate login failure happened")
    public void validate_login_failure() {
        if(driver.getPageSource().contains("Password is invalid")){
            Assert.assertTrue("login failed as expected",true);
        }else{
            Assert.fail("incorrect navigation");
        }
    }

    @Then("^User enter email as \"(.*)\" and password as \"(.*)\"$")
    public void user_enter_credential(String emailId, String pwd)  {
        setText(objLoginPage.txtEmail, emailId);         
        setText(objLoginPage.txtPassword, pwd);       
    }
    

    @Then("Click on Login")
    public void click_on_login() {
    	clickElement(objLoginPage.btnLogin);
    }

    @When("User click Logout link")
    public void user_click_logout_link() {
        clickElement(objLoginPage.btnLogout);
    }

    @Then("Validate login success for the user {string}")
    public void Validate_login_success_for_the_user(String title){
    	String assertText= getText(objLoginPage.lblGreetings);
        Assert.assertTrue(assertText.contains(title));
    }

    @Then("User should be navigated with a text {string}")
    public void page_title_should_be(String title) {
    	String assertText= getText(objLoginPage.lblGreetings);    	
        Assert.assertTrue(assertText.contains(title));
    }

    @Then("Validate user logout success")
    public void Validate_logout_success() {

    }

    @Then("Close browser")
    public void close_browser(){
    	closeBrowser(driver);
    }


    //Registration page

    @And("^User select country as \"(.*)\"$")
    public void selectCountryDetail(String country) {   
    	selectDropdownValue(objRegdPage.selectCountry, country);
    }

    @And("^User enter address as \"(.*)\"$")
    public void enterAddressDetail(String address) {
    	setText(objRegdPage.txtAddress, address);
    }

    @And("^User enter email address as \"(.*)\"$")
    public void enterEmailDetail(String email) {
    	setText(objRegdPage.txtEmail, email);           
    }

    @And("^User enter contact as \"(.*)\"$")
    public void enterContactDetail(String contact) {
    	setText(objRegdPage.txtPhone, contact);           
    }

    @When("^User click Save button$")
    public void clickSaveButton() {
    	clickElement(objRegdPage.btnSave);
    }

    @When("^Validate data saved")
    public void validateDataSaved()  {
    	String ackText = getText(objRegdPage.lblSave);
        Assert.assertTrue(ackText.contains("Saved"));
    }

}
