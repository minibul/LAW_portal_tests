package org.my.second;

import org.junit.Test;
import org.my.MainPage;
import static org.junit.Assert.assertTrue;

public class ForgottenPasswordRecoveryTests extends BaseUITest {

	@Test
	public void SuccessfulSendRecoveryPassword() {
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
	public void SuccessfulSendRecoveryPasswordMailDoesNotExist() {
		boolean isSendRecoveryPasswordSuccessful = new MainPage(driver)
				.open()
				.clickForgotPassword()
				.enterEmailForResetPassword("avbo04@gmail.com")
				.clickResetPasswordSendButton()
				.showPasswordRecovery();

		assertTrue("Failed to recovery password", isSendRecoveryPasswordSuccessful);


	}

	@Test
	public void UnsuccessfulSendRecoveryPasswordInvalidEmail() {
		boolean isSendRecoveryPasswordSuccessful = new MainPage(driver)
				.open()
				.clickForgotPassword()
				.enterEmailForResetPassword("avbo04@jcom")
				.clickResetPasswordSendButton()
				.showInvalidPasswordRecovery();

		assertTrue("Failed to recovery password", isSendRecoveryPasswordSuccessful);


	}

}
