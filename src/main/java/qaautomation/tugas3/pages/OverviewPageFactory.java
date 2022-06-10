package qaautomation.tugas3.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OverviewPageFactory extends BasePageFactory {

	@FindBy(xpath = "//span[@class='title']")
		private WebElement overviewText;
	
	@FindBy(xpath  = "//button[@id='finish']")
		private WebElement finishBtn;
	
	public OverviewPageFactory(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);	
	}
	
	public String getOverviewText() {
		return overviewText.getText();
	}
	
	public void clickFinishButton() {
		finishBtn.click();
	}
}
