package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ItemCart {
	
	
WebDriver driver;
	
	@FindBy(xpath = "//span[text()='Shop Now']") WebElement shopnowfield;
	@FindBy(xpath = "//span[text()='Premium & rare succulents']") WebElement productcategoryfield;
	@FindBy(xpath = "//select[@name='orderby']") WebElement productsortfield;
	@FindBy(xpath = "//button[@class='plus qib-button']") WebElement plantcountfield;
	@FindBy(xpath = "//a[text()='Add to cart']") WebElement productcartfield;
	@FindBy(xpath = "//img[@class='custom-logo']") WebElement imagefield;
	@FindBy(xpath = "//span[text()='Home']") WebElement backtohomefield;
	
	
	

	
	public ItemCart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void productcategory() {
		
		Actions act = new Actions(driver);
		act.moveToElement(shopnowfield);
		act.build().perform();
		productcategoryfield.click();
	}
	
	public void productsorting() {
		
		Select element = new Select(productsortfield);
		element.selectByValue("price-desc");
	}
	
	public void productcart() throws InterruptedException  {
		
		plantcountfield.click();
		Thread.sleep(2000);
		
		productcartfield.click();
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		backtohomefield.click();
		
	
		
	}
	public boolean itemdisplay() {
		return imagefield.isDisplayed();
		
		
	}
	        
	}	






