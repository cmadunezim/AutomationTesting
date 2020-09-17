package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	// @FindBy(class="") WebElement ;

	WebDriver driver;

	public HomePage(WebDriver hDriver) {
		this.driver = hDriver;
	}

	@FindBy(xpath = "//*[@id=\'oneX-header\']/nav/section[3]/div[1]/div[1]/ul/li[4]/div/button")
	WebElement getQuoteTab;
	// @FindBy(id="getaquote-select-product")WebElement productDD;
	@FindBy(id = "getaquote-zip")
	WebElement zipCodeField;
	@FindBy(xpath = "//*[@id=\\'popDropdown\\']/option[1]")
	WebElement autoDD;
	@FindBy(xpath = "//*[@id=\\'popDropdown\\']/option[2]")
	WebElement homeOwnersDD;
	@FindBy(xpath = "//*[@id=\\'popDropdown\\']/option[3]")
	WebElement condoOwnersDD;
	@FindBy(xpath = "//*[@id=\\'popDropdown\\']/option[4]")
	WebElement rentersDD;
	@FindBy(xpath = "//*[@id=\\'popDropdown\\']/option[5]")
	WebElement smallBusinessDD;
	@FindBy(xpath = "//*[@id=\\'popDropdown\\']/option[6]")
	WebElement lifeDD;
	@FindBy(xpath = "//*[@id=\\'popDropdown\\']/option[7]")
	WebElement medicareSuppDD;
	@FindBy(xpath = "//*[@id=\\'popDropdown\\']/option[8]")
	WebElement hospitalIncomeDD;
	@FindBy(xpath = "//*[@id=\\'popDropdown\\']/option[9]")
	WebElement petInsuranceDD;
	// @FindBy(xpath="//*[@id=\\'quote-main-state-select\']") WebElement stateField;
	@FindBy(xpath = "	//*[@id=\'getaQuoteButton\']")
	WebElement startQuoteBtn;

	public void getAQuote(String productName, String requiredField) {
		// getQuote.click();
		// System.out.println(driver.getTitle());
		// driver.findElement(By.xpath("//*[@id=\"oneX-header\"]/nav/section[3]/div[1]/div[1]/ul/li[4]/div/button")).click();
		// try {
		// Thread.sleep(10000);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		WebElement product;
		WebElement zipCode;
		WebElement state;
		
		getQuoteTab.click();
		
		
		Select productDD = new Select(driver.findElement(By.id("getaquote-select-product")));
		Select stateDD = new Select(driver.findElement(By.xpath("//*[@id=\\\\'quote-main-state-select\\']")));

		
		// productDD.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// autoDD.click();
		//zipCodeField.sendKeys(requiredField);
		//startQuoteBtn.click();

		if (productName == "Auto") {
			// @FindBy(xpath="//*[@id=\\'popDropdown\\']/option[1]")WebElement Auto;

			// autoDD.click();
			productDD.selectByVisibleText("Auto");
			zipCodeField.sendKeys(requiredField);

		}

		else if (productName == "Homeowners") {

			productDD.selectByVisibleText("Homeowners");
			zipCodeField.sendKeys(requiredField);

		} else if (productName == "Condo") {
			productDD.selectByVisibleText("Condo");
			zipCodeField.sendKeys(requiredField);

		} else if (productName == "Renters") {
			productDD.selectByVisibleText("Renters");
			zipCodeField.sendKeys(requiredField);

		} else if (productName == "Small Business") {
			productDD.selectByVisibleText("Auto");
			zipCodeField.sendKeys(requiredField);

		} else if (productName == "Life") {
			productDD.selectByVisibleText("Life");
			stateDD.selectByVisibleText(requiredField);

		} else if (productName == "Medicare Supplement") {
			productDD.selectByVisibleText("Medicare Supplement");
			stateDD.selectByVisibleText(requiredField);

		} else if (productName == "Hospital Income") {
			productDD.selectByVisibleText("Hospital Income");
			stateDD.selectByVisibleText(requiredField);
			
		} else if (productName == "Pet Insurance") {
			productDD.selectByVisibleText("Pet Insurance");
			stateDD.selectByVisibleText(requiredField);

		} else {
			System.out.println("Please enter a proper product name.");
		}

		startQuoteBtn.click();

	}// end getAQuote method

}// end HomePage class
