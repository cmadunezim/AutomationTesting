package SeleniumTest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {

	public static WebDriver browserStart(String webApp, WebDriver driver,  String driverType) {
		if(driverType.equals("Chrome")){
			//System.out.println("Chrome");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		else if(driverType.equals("Firefox")){
			//System.out.println("Chrome");
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Administrator\\Desktop\\Drivers\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		
		else if(driverType.equals("IE")){
			//System.out.println("Chrome");
			System.setProperty("webdriver.ie.driver","C:\\Users\\Administrator\\Desktop\\Drivers\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}
		else {
			System.out.println("We do not support this browser!");
		}
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(webApp);
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		return driver;
	}//end browserStart
	
	public static void closeBroswer(WebDriver driver) {
		driver.quit();
	}//end closeBrowser
}
