package org.my.second;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.my.MainPage;
import org.my.SuccessfulAndUnsuccessfulLogin;
import static org.junit.Assert.assertTrue;
import java.util.concurrent.TimeUnit;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ChangePasswordTests extends BaseUITest {

	@Test
	public void test_1successfulChangePassword() throws InterruptedException {
		MainPage mainPage = new MainPage(driver);
		SuccessfulAndUnsuccessfulLogin successfulLogin = mainPage
				.open()
				.enterEmail(mainPage.getEmail())
				.enterPassword(mainPage.getOldPassword())
				.clickLoginButton();

		TimeUnit.SECONDS.sleep(5);

		boolean isChangePasswordSuccessful = successfulLogin
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
	public void test_2checkingIfThePasswordWasChangedSuccessfully() throws InterruptedException {
		MainPage mainPage = new MainPage(driver);
		SuccessfulAndUnsuccessfulLogin successfulLogin = mainPage
				.open()
				.enterEmail(mainPage.getEmail())
				.enterPassword(mainPage.getNewPassword())
				.clickLoginButton();

		TimeUnit.SECONDS.sleep(5);

		boolean isChangePasswordSuccessful = successfulLogin
				.clickMenuButton()
				.clickChangePasswordButton()
				.enterCurrentPasswordInput(mainPage.getNewPassword())
				.enterNewPassword(mainPage.getOldPassword())
				.enterConfirmNewPasswordInput(mainPage.getOldPassword())
				.clickConfirmChangePasswordButton()
				.clickLoginButtonAfterRecoveryPassword()
				.showMainPageAfterPasswordRecovery();

		assertTrue("Failed to recovery password", isChangePasswordSuccessful);
	}
}

