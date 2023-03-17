package org.my.second;

import org.junit.Test;
import org.my.MainPage;
import static org.junit.Assert.assertTrue;

public class ForgottenPasswordRecoveryTests extends BaseUITest {

	@Test
	public void SuccessfulSendRecoveryPassword() {
		boolean isSendRecoveryPasswordSuccessful = new MainPage(driver)
				.open()
				.clickForgotPassword()
				.enterEmailForResetPassword("avbondarev04@gmail.com")
				.clickResetPasswordSendButton()
				.showPasswordRecovery();

		assertTrue("Failed to recovery password", isSendRecoveryPasswordSuccessful);


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


}
