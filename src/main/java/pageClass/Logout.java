package pageClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout {
	
	
WebDriver driver;
	
	
	@FindBy(xpath = "//span[text()='My account']") WebElement accountfield;
	@FindBy(xpath = "//span[text()='Logout']") WebElement finallogoutfield;
	@FindBy(xpath = "//div[@role='alert']//child::a") WebElement confirmogoutfield;
	@FindBy(xpath = "//div[@role='alert']//child::a") WebElement buttonfield;

	public Logout(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void finallogout() throws InterruptedException {
		
		
	
		Actions acts = new Actions(driver);
		acts.moveToElement(accountfield);
		acts.build().perform();
		Thread.sleep(2000);
		finallogoutfield.click();
	}
		public void confirm() {
		confirmogoutfield.click();
		
	}
	
	public boolean buttondisplay() {
		return buttonfield.isDisplayed();
		
		
	}
}



