package org.my;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ForgottenPasswordRecoveryTests extends BaseUITest {

	@Test
	public void successfulSendRecoveryPassword() {
		boolean isMainPageDisplayed = new MainPage(driver)
				.open()
				.clickForgotPassword()
				.enterEmailForResetPassword("avbondarev04@gmail.com")
				.clickResetPasswordSendButton()
				.clickLoginButtonAfterRecoveryPassword()
				.showMainPageAfterPasswordRecovery();

		assertTrue("Failed to recovery password", isMainPageDisplayed);
	}

	@Test
	public void successfulSendRecoveryPasswordMailDoesNotExist() {
		boolean isSendRecoveryPasswordSuccessful = new MainPage(driver)
				.open()
				.clickForgotPassword()
				.enterEmailForResetPassword("avbo04@gmail.com")
				.clickResetPasswordSendButton()
				.showPasswordRecovery();

		assertTrue("Failed to recovery password", isSendRecoveryPasswordSuccessful);


	}

	@Test
	public void unsuccessfulSendRecoveryPasswordInvalidEmail() {
		boolean isSendRecoveryPasswordSuccessful = new MainPage(driver)
				.open()
				.clickForgotPassword()
				.enterEmailForResetPassword("avbo04@jcom")
				.clickResetPasswordSendButton()
				.showInvalidPasswordRecovery();

		assertTrue("Failed to recovery password", isSendRecoveryPasswordSuccessful);


	}

}
