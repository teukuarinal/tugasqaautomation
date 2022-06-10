package qaautomation.tugas3.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageFactory extends BasePageFactory {

	@FindBy(xpath = "//input[@id='user-name']")
		private WebElement username;

	@FindBy(xpath = "//input[@id='password']")
		private WebElement password;

	@FindBy(xpath = "//input[@id='login-button']")
		private WebElement loginBtn;
	
	public LoginPageFactory(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}
	
	public void inputUsername(String user) {
		username.sendKeys(user);
	}

	public void inputPassword(String pass) {
		password.sendKeys(pass);
	}

	public void clickLoginButton() {
		loginBtn.click();
	}
}
