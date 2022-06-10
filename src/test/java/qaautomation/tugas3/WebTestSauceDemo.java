package qaautomation.tugas3;

import org.testng.Assert;
import org.testng.annotations.Test;

import qaautomation.tugas3.pages.CartPageFactory;
import qaautomation.tugas3.pages.CheckoutPageFactory;
import qaautomation.tugas3.pages.CompletePageFactory;
import qaautomation.tugas3.pages.LoginPageFactory;
import qaautomation.tugas3.pages.OverviewPageFactory;
import qaautomation.tugas3.pages.ProfilePageFactory;

public class WebTestSauceDemo extends BaseWebTest {

	@Test
	public void testLogin() {

		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
		ProfilePageFactory profilePage = new ProfilePageFactory(driver, explicitWait);
		CartPageFactory cartPage = new CartPageFactory(driver, explicitWait);
		CheckoutPageFactory checkoutPage = new CheckoutPageFactory(driver, explicitWait);
		OverviewPageFactory overviewPage = new OverviewPageFactory(driver, explicitWait);
		CompletePageFactory completePage = new CompletePageFactory(driver, explicitWait);
		String username = "standard_user";
		String password = "secret_sauce";
		String firstname = "Teuku";
		String lastname = "Arinal";
		String postalcode = "55918";

		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();
		String actualText = profilePage.getProfileText();
		String expectedText = "PRODUCTS";
		Assert.assertTrue(actualText.contains(expectedText));
		profilePage.clickAddToCartFJBtn();
		profilePage.clickCartBtn();
		String actualText1 = cartPage.getCartText();
		String expectedText1 = "YOUR CART";
		Assert.assertTrue(actualText1.contains(expectedText1));
		cartPage.clickCheckoutBtn();
		String actualText2 = checkoutPage.getCheckoutText();
		String expectedText2 = "CHECKOUT: YOUR INFORMATION";
		Assert.assertTrue(actualText2.contains(expectedText2));
		checkoutPage.inputFirstName(firstname);
		checkoutPage.inputLastName(lastname);
		checkoutPage.inputPostalCode(postalcode);
		checkoutPage.clickContinueBtn();
		String actualText3 = overviewPage.getOverviewText();
		String expectedText3 = "CHECKOUT: OVERVIEW";
		Assert.assertTrue(actualText3.contains(expectedText3));
		overviewPage.clickFinishButton();
		String actualText4 = completePage.completeText();
		String expectedText4 = "CHECKOUT: COMPLETE!";
		Assert.assertTrue(actualText4.contains(expectedText4));
	}
	
}
