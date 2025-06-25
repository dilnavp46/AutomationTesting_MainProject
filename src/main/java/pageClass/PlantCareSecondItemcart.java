package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PlantCareSecondItemcart {
	
	
WebDriver driver;
	
	@FindBy(xpath = "//img[@class='elementor-animation-pulse attachment-large size-large']") WebElement plantcareitemfield;
	@FindBy(xpath = "//select[@name='orderby']") WebElement itemsortfield;
	//@FindBy(xpath = "//a[text()='Syngenta Actara Insecticide – 5-Pack (5g Each)']") WebElement itemselectfield;
	@FindBy(xpath = "//a[text()='Add to cart']") WebElement itemcartfield;
	
	
	
	
	public PlantCareSecondItemcart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void plantcareitem() {
		plantcareitemfield.click();
		
	}
	
   public void secondproductsorting() {
		
		Select element1 = new Select(itemsortfield);
		element1.selectByValue("popularity");
	}
  
    public void itemcart() throws InterruptedException {
	itemcartfield.click();
	
}
    public String getaddtocart() {
		return itemcartfield.getText();
	}

}



