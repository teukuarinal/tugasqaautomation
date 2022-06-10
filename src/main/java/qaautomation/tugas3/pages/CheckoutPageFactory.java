package qaautomation.tugas3.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPageFactory extends BasePageFactory{

	@FindBy(xpath = "//span[@class='title']")
		private WebElement checkoutText;
	
	@FindBy(xpath = "//input[@id='first-name']")
		private WebElement firstname;
	
	@FindBy(xpath = "//input[@id='last-name']")
		private WebElement lastname;
	
	@FindBy(xpath = "//input[@id='postal-code']")
		private WebElement postalcode;
	
	@FindBy(xpath = "//input[@id='continue']")
		private WebElement continueBtn;
	
	public CheckoutPageFactory(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}
	
	public String getCheckoutText() {
		return checkoutText.getText();
	}
	
	public void inputFirstName(String name1) {
		firstname.sendKeys(name1);
	}
	
	public void inputLastName(String name2) {
		lastname.sendKeys(name2);
	}
	
	public void inputPostalCode(String zip) {
		postalcode.sendKeys(zip);
	}
	
	public void clickContinueBtn() {
		continueBtn.click();
	}
}
