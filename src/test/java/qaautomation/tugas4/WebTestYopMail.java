package qaautomation.tugas4;

import org.davidmoten.text.utils.WordWrap;
import org.testng.Assert;
import org.testng.annotations.Test;

import qaautomation.tugas4.pages.InboxPageFactory;
import qaautomation.tugas4.pages.LoginPageFactory;

public class WebTestYopMail extends BaseWebTest {

	@Test
	public void testLogin() {

		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
		InboxPageFactory inboxPage = new InboxPageFactory(driver, explicitWait);
		String username = "automationtest";
		
		loginPage.inputName(username);
		loginPage.clickCheckEmailButton();
		String actualText = inboxPage.getInboxBNameText();
		String expectedText = "automationtest@yopmail.com";
		Assert.assertTrue(actualText.contains(expectedText));
		System.out.println(actualText);
		inboxPage.switchEmailIFrame();
		System.out.println("");
		System.out.println("Email Inbox 1:");
		String emailText11 = inboxPage.getEmailSubjectText();
		System.out.println("Subject: " + emailText11);
		String emailText12 = inboxPage.getEmailSenderText();
		System.out.println("Sender: " + emailText12);
		String emailText13 = inboxPage.getEmailTimeText();
		System.out.println("Date/Time: " + emailText13);
		System.out.println("");
		String emailText14 = inboxPage.getTextInEmailIFrame();
		String wrapped1 = WordWrap.from(emailText14).maxWidth(80).insertHyphens(true).wrap();
		System.out.println(wrapped1);
		inboxPage.switchParentFrame();
		inboxPage.switchInboxIFrame();
		inboxPage.clickChooseEmail2Button();
		inboxPage.switchParentFrame();
		inboxPage.switchEmailIFrame();
		System.out.println("");
		System.out.println("Email Inbox 2:");
		String emailText21 = inboxPage.getEmailSubjectText();
		System.out.println("Subject: " + emailText21);
		String emailText22 = inboxPage.getEmailSenderText();
		System.out.println("Sender: " + emailText22);
		String emailText23 = inboxPage.getEmailTimeText();
		System.out.println("Date/Time: " + emailText23);
		System.out.println("");
		String emailText24 = inboxPage.getTextInEmailIFrame();
		String wrapped2 = WordWrap.from(emailText24).maxWidth(80).insertHyphens(true).wrap();
		System.out.println(wrapped2);
		inboxPage.switchParentFrame();
		inboxPage.switchInboxIFrame();
		inboxPage.clickChooseEmail3Button();
		inboxPage.switchParentFrame();
		inboxPage.switchEmailIFrame();
		System.out.println("");
		System.out.println("Email Inbox 3:");
		String emailText31 = inboxPage.getEmailSubjectText();
		System.out.println("Subject: " + emailText31);
		String emailText32 = inboxPage.getEmailSenderText();
		System.out.println("Sender: " + emailText32);
		String emailText33 = inboxPage.getEmailTimeText();
		System.out.println("Date/Time: " + emailText33);
		System.out.println("");
		String emailText34 = inboxPage.getTextInEmailIFrame();
		String wrapped3 = WordWrap.from(emailText34).maxWidth(80).insertHyphens(true).wrap();
		System.out.println(wrapped3);
	}
}