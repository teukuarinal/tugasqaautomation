package qaautomation.tugas3.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPageFactory extends BasePageFactory {
	
	@FindBy(xpath = "//span[@class='title']")
	private WebElement cartText;
	
	@FindBy(xpath = "//button[@id='checkout']")
	private WebElement checkoutBtn;
	
	public CartPageFactory(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}
	public String getCartText() {
		return cartText.getText();
	}
	public void clickCheckoutBtn() {
		checkoutBtn.click();
	}
}
