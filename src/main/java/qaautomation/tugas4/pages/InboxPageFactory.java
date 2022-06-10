package qaautomation.tugas4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InboxPageFactory extends BasePageFactory {

	@FindBy(xpath = "//div[@class='bname']")
		private WebElement inboxBNameText;
	
	@FindBy(xpath = "//iframe[@id='ifinbox']")
		private WebElement inboxIFrame;

	@FindBy(xpath = "//iframe[@id='ifmail']")
		private WebElement emailIFrame;
	
	@FindBy(xpath = "(//button[@class='lm'])[2]")
		private WebElement chooseEmail2Btn;
	
	@FindBy(xpath = "(//button[@class='lm'])[3]")
		private WebElement chooseEmail3Btn;
	
	@FindBy(xpath = "//div[@class='ellipsis nw b f18']")
		private WebElement emailSubjectText;
	
	@FindBy(xpath = "//span[@class='ellipsis b']")
		private WebElement emailSenderText;
	
	@FindBy(xpath = "//span[@class='ellipsis']")
		private WebElement emailTimeText;
	
	@FindBy(xpath = "//main[@class='yscrollbar']")
		private WebElement textInEmailIFrame;
	
	public InboxPageFactory(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}	
	
	public String getInboxBNameText() {
		return inboxBNameText.getText();
	}
	
	public void switchParentFrame() {
		driver.get().switchTo().parentFrame();
	}
	
	public void switchInboxIFrame() {
		driver.get().switchTo().frame(inboxIFrame);
	}
	
	public void clickChooseEmail2Button() {
		chooseEmail2Btn.click();
	}
	
	public void clickChooseEmail3Button() {
		chooseEmail3Btn.click();
	}
	
	public void switchEmailIFrame() {
		driver.get().switchTo().frame(emailIFrame);
	}
	
	public String getEmailSubjectText() {
		return emailSubjectText.getText();
	}
	
	public String getEmailSenderText() {
		return emailSenderText.getText();
	}
	
	public String getEmailTimeText() {
		return emailTimeText.getText();
	}
	
	public String getTextInEmailIFrame() {
		return textInEmailIFrame.getText();
	}
}
