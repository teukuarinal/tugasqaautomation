package qaautomation.tugas3.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePageFactory extends BasePageFactory {

	@FindBy(xpath = "//span[@class='title']")
	private WebElement profileText;
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	private WebElement AddToCartFJBtn;
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement CartBtn;

	public ProfilePageFactory(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}
	public String getProfileText() {
		return profileText.getText();
	}
	public void clickAddToCartFJBtn() {
		AddToCartFJBtn.click();
	}
	public void clickCartBtn() {
		CartBtn.click();
	}
	
}
