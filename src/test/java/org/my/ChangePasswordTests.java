package org.my;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ChangePasswordTests extends BaseUITest {

	@Test
	public void test_1successfulChangePassword() {
		MainPage mainPage = new MainPage(driver);
		SuccessfulAndUnsuccessfulLogin successfulChangePassword = mainPage
				.open()
				.enterEmail(mainPage.getEmail())
				.enterPassword(mainPage.getOldPassword())
				.clickLoginButton();

		WebDriverWait wait = new WebDriverWait(driver, 10);

		boolean isChangePasswordSuccessful = successfulChangePassword
				.waitForElement(wait, MainPageLocators.loggedIn)
				.clickMenuButton()
				.clickChangePasswordButton()
				.enterCurrentPasswordInput(mainPage.getOldPassword())
				.enterNewPassword(mainPage.getNewPassword())
				.enterConfirmNewPasswordInput(mainPage.getNewPassword())
				.clickConfirmChangePasswordButton()
				.clickLoginButtonAfterRecoveryPassword()
				.showMainPageAfterPasswordRecovery();

		assertTrue("Failed to recovery password", isChangePasswordSuccessful);
	}

	@Test
	public void test_2checkingIfThePasswordWasChangedSuccessfully() {
		MainPage mainPage = new MainPage(driver);
		SuccessfulAndUnsuccessfulLogin checkingIfThePasswordWasChangedSuccessfully = mainPage
				.open()
				.enterEmail(mainPage.getEmail())
				.enterPassword(mainPage.getNewPassword())
				.clickLoginButton();

		WebDriverWait wait = new WebDriverWait(driver, 10);

		boolean ischeckingIfThePasswordWasChangedSuccessfully = checkingIfThePasswordWasChangedSuccessfully
				.waitForElement(wait, MainPageLocators.loggedIn)
				.clickMenuButton()
				.clickChangePasswordButton()
				.enterCurrentPasswordInput(mainPage.getNewPassword())
				.enterNewPassword(mainPage.getOldPassword())
				.enterConfirmNewPasswordInput(mainPage.getOldPassword())
				.clickConfirmChangePasswordButton()
				.clickLoginButtonAfterRecoveryPassword()
				.showMainPageAfterPasswordRecovery();

		assertTrue("Failed to recovery password", ischeckingIfThePasswordWasChangedSuccessfully);
	}
}

