package qaautomation.tugas4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageFactory extends BasePageFactory {

	@FindBy(xpath = "//input[@id='login']")
		private WebElement inputname;

	@FindBy(xpath = "//i[@class='material-icons-outlined f36']")
		private WebElement checkEmailBtn;

	public LoginPageFactory(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}
	
	public void inputName(String user) {
		inputname.sendKeys(user);
	}

	public void clickCheckEmailButton() {
		checkEmailBtn.click();
	}
}
