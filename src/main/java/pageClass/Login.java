package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	
	
WebDriver driver;
	
	@FindBy(xpath = "//input[@id='username']") WebElement loginusernamefield;
	@FindBy(xpath = "//input[@id='password']") WebElement loginpasswordfield;
	@FindBy(xpath = "//button[text()='Log in']") WebElement loginfield;
	
	
	
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void logindetail(String loginusername,String loginpassword ) {
		loginusernamefield.sendKeys(loginusername);
		loginpasswordfield.sendKeys(loginpassword);
		
	}
	public void loginbutton() {
		loginfield.click();
		
	}
	public boolean logincheck() {
		return loginfield.isDisplayed();

}
}


