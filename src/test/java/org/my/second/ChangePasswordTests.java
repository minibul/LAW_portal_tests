/*package org.my.second;

import org.junit.Test;
import org.my.MainPage;
import static org.junit.Assert.assertTrue;

public class ChangePasswordTests extends BaseUITest {

	@Test
	public void checkSuccessfulChangePassword() {
		boolean isChangePasswordSuccessful = new MainPage(driver)
				.open()
				.enterEmail("anton.bondarev@sabregames.com")
				.enterPassword("222222222")
				.clickLoginButton()
				.clickMenuButton()
				.clickChangePasswordButton()
				.enterCurrentPasswordInput("222222222")
				.enterNewPassword("111111111")
				.enterConfirmNewPasswordInput("111111111")
				.clickLoginButtonAfterRecoveryPassword()
				.showMainPageAfterPasswordRecovery();

		assertTrue("Failed to recovery password", isChangePasswordSuccessful);
	}
}*/
package org.my.second;

import org.junit.Test;
import org.my.MainPage;
import org.my.SuccessfulAndUnsuccessfulLogin;
import static org.junit.Assert.assertTrue;
import java.util.concurrent.TimeUnit;

public class ChangePasswordTests extends BaseUITest {

	@Test
	public void checkSuccessfulChangePassword() throws InterruptedException {
		SuccessfulAndUnsuccessfulLogin successfulLogin = new MainPage(driver)
				.open()
				.enterEmail("anton.bondarev@sabregames.com")
				.enterPassword("222222222")
				.clickLoginButton();

		TimeUnit.SECONDS.sleep(5);

		boolean isChangePasswordSuccessful = successfulLogin
				.clickMenuButton()
				.clickChangePasswordButton()
				.enterCurrentPasswordInput("222222222")
				.enterNewPassword("111111111")
				.enterConfirmNewPasswordInput("111111111")
				.clickConfirmChangePasswordButton()
				.clickLoginButtonAfterRecoveryPassword()
				.showMainPageAfterPasswordRecovery();

		assertTrue("Failed to recovery password", isChangePasswordSuccessful);
	}

	@Test
	public void CheckingIfThePasswordWasChangedSuccessfully() throws InterruptedException {
		SuccessfulAndUnsuccessfulLogin successfulLogin = new MainPage(driver)
				.open()
				.enterEmail("anton.bondarev@sabregames.com")
				.enterPassword("111111111")
				.clickLoginButton();

		TimeUnit.SECONDS.sleep(5);

		boolean isChangePasswordSuccessful = successfulLogin
				.clickMenuButton()
				.clickChangePasswordButton()
				.enterCurrentPasswordInput("111111111")
				.enterNewPassword("222222222")
				.enterConfirmNewPasswordInput("222222222")
				.clickConfirmChangePasswordButton()
				.clickLoginButtonAfterRecoveryPassword()
				.showMainPageAfterPasswordRecovery();

		assertTrue("Failed to recovery password", isChangePasswordSuccessful);
	}
}

