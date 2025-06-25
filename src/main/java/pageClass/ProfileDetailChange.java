package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileDetailChange {
	
	
WebDriver driver;
	
	@FindBy(xpath = "//span[text()='My account']") WebElement myaccount;
	@FindBy(xpath = "//span[text()='Account details']") WebElement accountdetailfield;
	@FindBy(xpath = "//input[@id='account_first_name']") WebElement firstnamefield;
	@FindBy(xpath = "//input[@id='account_last_name']") WebElement lastnamefield;
	@FindBy(xpath = "//input[@id='password_current']") WebElement passwordfield;
	@FindBy(xpath = "//input[@id='password_1']") WebElement newpasswordfield;
	@FindBy(xpath = "//input[@id='password_2']") WebElement confirmnewpasswordfield;
	@FindBy(xpath = "//button[text()='Save changes']") WebElement changebuttonfield;
	@FindBy(xpath = "//a[@class='logout']") WebElement logoutfield;
	
	
	
	
	public ProfileDetailChange(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void detailsEdit() {
		Actions acts = new Actions(driver);
		acts.moveToElement(myaccount);
		acts.build().perform();
		accountdetailfield.click();
		
		}
		
		public void namedetail(String firstname,String lastname) {
			firstnamefield.sendKeys(firstname);
			lastnamefield.sendKeys(lastname);
			
		}
		
		public void passworddetail(String currentpass,String newpass,String confirmpass) {
			passwordfield.sendKeys(currentpass);
			newpasswordfield.sendKeys(newpass);
			confirmnewpasswordfield.sendKeys(confirmpass);
			
		}
		public void savechanges() {
			changebuttonfield.click();
			
		}
		public void logout() {
			logoutfield.click();
			
		}
		
		public String titleverification() {
			return driver.getTitle();
		}

}



