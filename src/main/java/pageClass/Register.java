package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {

	
	
WebDriver driver;
	
	@FindBy(xpath = "//span[text()='My account']") WebElement myaccountfield;
	@FindBy(xpath = "//a[text()='Register']") WebElement registerfield;
	@FindBy(xpath = "//input[@id='reg_username']") WebElement registerusrnamefield;
	@FindBy(xpath = "//input[@id='reg_email']") WebElement registerusremailfield;
	@FindBy(xpath = "//input[@id='reg_password']") WebElement registerusrpasswordfield;
	@FindBy(xpath = "//button[text()='Register']") WebElement registerbuttonfield;
	
	
	
	
	public Register(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void signupSection() {
		
		myaccountfield.click();
	
		
	}
	public void registerSection() {
		registerfield.click();	
	}
	public void userdetailsInput(String regname,String regemail,String regpassword) {
		
		
		
		registerusrnamefield.sendKeys(regname);
		registerusremailfield.sendKeys( regemail);
		 registerusrpasswordfield.sendKeys(regpassword);
		
	}
	public void registerButton() {
		registerbuttonfield.click();
		
	}
	
	public String geturl() {
		return driver.getCurrentUrl();
	}
	
	

}

