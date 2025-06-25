package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrder {

	
WebDriver driver;
	
	@FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']") WebElement checkoutfield;
	@FindBy(xpath = "//input[@id='billing_first_name']") WebElement firstnamefield;
	@FindBy(xpath = "//input[@id='billing_address_1']") WebElement addressfield;
	@FindBy(xpath = "//input[@id='billing_address_2']") WebElement secondaddressfield;
	@FindBy(xpath = "//input[@id='billing_city']") WebElement cityfield;
	@FindBy(xpath = "//input[@id='billing_postcode']") WebElement postcodefield;
	@FindBy(xpath = "//input[@id='billing_phone']") WebElement phonenumfield;
	@FindBy(xpath = "//input[@id='billing_email']") WebElement emailfield;
	@FindBy(xpath = "//textarea[@id='order_comments']") WebElement specialnotefield;
	@FindBy(xpath = "//button[text()='Place order']") WebElement placeorderfield;
	@FindBy(xpath = "//input[@id='terms']") WebElement termscheckboxfield;
	@FindBy(xpath = "//i[@class=' icon-basket']") WebElement carticonfield;
	@FindBy(xpath = "//span[text()='My account']") WebElement accountfield;
	@FindBy(xpath = "//span[text()='Logout']") WebElement finallogoutfield;
	

	
	
	
	
	public PlaceOrder(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ordersection() {
		carticonfield.click();
		checkoutfield.click();
		
	}
	
	
   public void inputaddress(String firstaddress, String secondaddress) {
    	addressfield.sendKeys(firstaddress);
    	secondaddressfield.sendKeys(secondaddress);
    	
    }
    public void inuptcityandcode(String cityname,String postcode) {
    	cityfield.sendKeys(cityname);
    	postcodefield.sendKeys(postcode);
    	
    }
    public void contactdetail(String phonenum) {
    	phonenumfield.sendKeys(phonenum);
    	
    	
    	
    }
    
    public void specialnote(String note) {
    	specialnotefield.sendKeys(note);
    	
    }
    public void checkboxselect() throws InterruptedException {
    termscheckboxfield.click();
    Thread.sleep(1000);
    }
    public void placeorder() throws InterruptedException {
    	
    
    	placeorderfield.click();
    	
    	 Thread.sleep(2000);       
    	
    }
 
        
public boolean termsselected() {
		
		return termscheckboxfield.isSelected();
	}
    
}


