package SeleniumTest;
//import com.maven-demo.pages.HomePage;
//package maven-demo.resources.pages;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class GetQuoteTest {

	//  @BeforeTest
	//  public void beforeTest() {
	//  
	//  }
	WebDriver driver;
	//HomePage hPage= new HomePage;

//	@BeforeClass
//	public void beforeClass() {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Drivers\\chromedriver.exe");
//		driver= new ChromeDriver();
//		driver.get("https://www.statefarm.com/");
//		driver.manage().window().maximize();
//	}

	@Test
	public void test() {
		driver= TestBase.browserStart("https://www.statefarm.com/", driver, "Chrome");
		HomePage hPage= PageFactory.initElements(driver, HomePage.class);
		System.out.println("Do test!");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(driver.getTitle());
		hPage.getAQuote("Life","Tx");
//		driver.findElement(By.xpath("//*[@id=\"user-message\"]")).sendKeys("QA assessment trial #1");
//		driver.findElement(By.xpath("//*[@id=\"get-input\"]/button")).click();
//		WebElement showM= driver.findElement(By.xpath("//*[@id=\"display\"]"));
		//assert(showM.getText().equalsIgnoreCase("QA assessment trial #1"));
		
	}
	  
	  @AfterClass 
	  public void afterTest() {
		  driver.quit();
	  }

}
