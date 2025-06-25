package testClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import baseClass.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageClass.ItemCart;
import pageClass.Login;
import pageClass.Logout;
import pageClass.PlaceOrder;
import pageClass.PlantCareSecondItemcart;
import pageClass.ProfileDetailChange;
import pageClass.Register;

public class Test_class {
	
	
	WebDriver driver;
	SoftAssert s = new SoftAssert();
	
	
	@BeforeTest
	public void set() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://succulentgallery.com/");
	
	
	}

		
	@Test(priority=0)
	public void test1() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		Register RS = new Register(driver);
		
		RS.signupSection();
		Thread.sleep(2000);	
		RS.registerSection();
		Thread.sleep(2000);	
		RS.userdetailsInput("Aisu","Aiswaryammotmmil90@gamil.com","aisumkkkkkmmm@11456527");
		Thread.sleep(2000);	
		RS.registerButton();
		
		String expectedurl = "https://succulentgallery.com/my-account/";
		String actualurl = RS.geturl();
		s.assertEquals(expectedurl,actualurl, "urls are not matching");
		s.assertAll();
		
		

}
	@Test(priority=1)
	public void test2() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		ProfileDetailChange PD = new ProfileDetailChange(driver);
		
		PD.detailsEdit();
		Thread.sleep(2000);		
		PD.namedetail("Aishwarya","M S");
		Thread.sleep(2000);
		PD.passworddetail("aisumkkkkkmmm@11456527","aisummmmmmkkkkkkkkk@19","aisummmmmmkkkkkkkkk@19");
		Thread.sleep(2000);
		PD.savechanges();
		Thread.sleep(2000);
		PD.logout();
		
		String expectedtitle = "My account - Succulent Gallery";
		String actualtitle = PD.titleverification();
		s.assertEquals(expectedtitle,actualtitle,"Titles are not matching");
		
		s.assertAll();
	
}
	
	
	@Test(priority=2)
	public void test3() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		Login LN = new Login(driver);
		Thread.sleep(2000);	
		LN.logindetail("Aiswaryammotmmil90@gamil.com","aisummmmmmkkkkkkkkk@19");
		Thread.sleep(2000);	
		
		boolean pass = LN.logincheck();
		s.assertTrue(pass, "Login button is not displayed");
		s.assertAll();
		
		LN.loginbutton();
		
		
		
}
	
	
	
	@Test(priority=3)
	public void test4() throws InterruptedException {
		ItemCart AC = new ItemCart(driver);
		
		AC.productcategory();
		Thread.sleep(2000);	
		AC.productsorting();
		Thread.sleep(2000);	
		AC.productcart();
		Thread.sleep(2000);	
		
		boolean itemimage = AC.itemdisplay();
		s.assertTrue(itemimage, "item image is not displayed");
		s.assertAll();
		
		
	}
	@Test(priority=4)
	public void test5() throws InterruptedException {
		PlantCareSecondItemcart PC = new PlantCareSecondItemcart(driver);
		
		PC.plantcareitem();
		Thread.sleep(2000);
		PC.secondproductsorting();
		Thread.sleep(2000);
		PC.itemcart();
		
		String expectedtext = "Add to cart";
		String actualtext = PC.getaddtocart();
		s.assertEquals(expectedtext,actualtext, "visible text not matching");
		s.assertAll();
		
		driver.navigate().back();
	
		
	}

	@Test(priority=5)
	public void test6() throws InterruptedException {
		PlaceOrder PO = new PlaceOrder(driver);
		PO.ordersection();
		PO.inputaddress("222","kannur");
		Thread.sleep(2000);	
		PO.inuptcityandcode("kannur","670142");
		Thread.sleep(2000);	
		PO.contactdetail("9207671596");
		Thread.sleep(2000);	
		PO.specialnote("This is a surprise gift. Kindly wrap it nicely!");
		PO.checkboxselect();
		Thread.sleep(2000);	
		
		 boolean checkbox = PO.termsselected();	 
		 s.assertTrue(checkbox,"check box is not selected");
		 s.assertAll();
		 
		PO.placeorder();
			
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
	}
		
		@Test(priority=6)
		public void test7() throws InterruptedException {
			
			Logout LO = new Logout(driver);
		
		LO.finallogout();
		boolean button = LO.buttondisplay();
		s.assertTrue(button, "confirm button is not displayed");
		s.assertAll();
		 
		LO.confirm();
		
	
		 
	}
		
		@AfterTest
		public void exit() {
			driver.close();
			
		}
}
		
	
