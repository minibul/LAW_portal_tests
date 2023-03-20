package org.my.second;


import org.junit.Test;
import org.my.MainPage;
import org.my.SuccessfulAndUnsuccessfulLogin;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertTrue;
public class UnsuccessfulNewRegistrationTests extends BaseUITest {

	@Test
	public void inputNicknameMore16Symbols() throws InterruptedException {
		SuccessfulAndUnsuccessfulLogin successfulAndUnsuccessfulLogin = new MainPage(driver)
				.open()
				.clickRegistrationTab()
				.enterRandomLogin(17,150)
				.enterRandomEmail("test.co", 10)
				.enterRandomPassword(8)
				.clickRegisterButton();


		TimeUnit.SECONDS.sleep(10);

		boolean isRegistrationUnsuccessful = successfulAndUnsuccessfulLogin.showErrorInvalidLogin();

		assertTrue("Register should be unsuccessful", isRegistrationUnsuccessful);
	}

	@Test // now there is a bug(16.03.2023), if username less 3 symbol we show an error "The username is taken!"
	public void inputNicknameLess3Symbols() throws InterruptedException {
		SuccessfulAndUnsuccessfulLogin successfulAndUnsuccessfulLogin = new MainPage(driver)
				.open()
				.clickRegistrationTab()
				.enterLogin("f")
				.enterRandomEmail("test.co", 10)
				.enterRandomPassword(8)
				.clickRegisterButton();


		TimeUnit.SECONDS.sleep(10);

		boolean isRegistrationUnsuccessful = successfulAndUnsuccessfulLogin.showErrorInvalidLogin();

		assertTrue("Register should be unsuccessful", isRegistrationUnsuccessful);
	}

	@Test
	public void inputNicknameInvalidCyrillicSymbols() throws InterruptedException {
		SuccessfulAndUnsuccessfulLogin successfulAndUnsuccessfulLogin = new MainPage(driver)
				.open()
				.clickRegistrationTab()
				.enterLogin("авпвпвп")
				.enterRandomEmail("test.co", 10)
				.enterRandomPassword(8)
				.clickRegisterButton();


		TimeUnit.SECONDS.sleep(10);

		boolean isRegistrationUnsuccessful = successfulAndUnsuccessfulLogin.showErrorInvalidLogin();

		assertTrue("Register should be unsuccessful", isRegistrationUnsuccessful);
	}

	@Test
	public void inputNicknameInvalidHieroglyphsSymbols() throws InterruptedException {
		SuccessfulAndUnsuccessfulLogin successfulAndUnsuccessfulLogin = new MainPage(driver)
				.open()
				.clickRegistrationTab()
				.enterLogin("象形文字xiàíng wénzì")
				.enterRandomEmail("test.co", 10)
				.enterRandomPassword(8)
				.clickRegisterButton();


		TimeUnit.SECONDS.sleep(10);

		boolean isRegistrationUnsuccessful = successfulAndUnsuccessfulLogin.showErrorInvalidLogin();

		assertTrue("Register should be unsuccessful", isRegistrationUnsuccessful);
	}

	@Test
	public void inputNicknameInvalidSpecialSymbols() throws InterruptedException {
		SuccessfulAndUnsuccessfulLogin successfulAndUnsuccessfulLogin = new MainPage(driver)
				.open()
				.clickRegistrationTab()
				.enterLogin("☯ ☭ ? $ £ ¢\ngfg")
				.enterRandomEmail("test.co", 10)
				.enterRandomPassword(8)
				.clickRegisterButton();


		TimeUnit.SECONDS.sleep(10);

		boolean isRegistrationUnsuccessful = successfulAndUnsuccessfulLogin.showErrorInvalidLogin();

		assertTrue("Register should be unsuccessful", isRegistrationUnsuccessful);
	}

	@Test
	public void inputNicknameInvalidTwoSpacesAtTheBeginning() throws InterruptedException {
		SuccessfulAndUnsuccessfulLogin successfulAndUnsuccessfulLogin = new MainPage(driver)
				.open()
				.clickRegistrationTab()
				.enterLogin("  fd435gds")
				.enterRandomEmail("test.co", 10)
				.enterRandomPassword(8)
				.clickRegisterButton();


		TimeUnit.SECONDS.sleep(10);

		boolean isRegistrationUnsuccessful = successfulAndUnsuccessfulLogin.showErrorInvalidLogin();

		assertTrue("Register should be unsuccessful", isRegistrationUnsuccessful);
	}

	@Test //here is a bug, we do not show an error that you cannot enter more than one space in nickname(16.03.2023)
	public void inputNicknameInvalidTwoSpacesAtTheEnd() throws InterruptedException {
		SuccessfulAndUnsuccessfulLogin successfulAndUnsuccessfulLogin = new MainPage(driver)
				.open()
				.clickRegistrationTab()
				.enterLogin("f435gds   ")
				.enterRandomEmail("test.co", 10)
				.enterRandomPassword(8)
				.clickRegisterButton();


		TimeUnit.SECONDS.sleep(10);

		boolean isRegistrationUnsuccessful = successfulAndUnsuccessfulLogin.showErrorInvalidLogin();

		assertTrue("Register should be unsuccessful", isRegistrationUnsuccessful);
	}

	@Test
	public void inputEmptyNickname() throws InterruptedException {
		SuccessfulAndUnsuccessfulLogin successfulAndUnsuccessfulLogin = new MainPage(driver)
				.open()
				.clickRegistrationTab()
				.enterLogin("")
				.enterRandomEmail("test.co", 10)
				.enterRandomPassword(8)
				.clickRegisterButton();


		TimeUnit.SECONDS.sleep(10);

		boolean isRegistrationUnsuccessful = successfulAndUnsuccessfulLogin.showErrorInvalidLogin();

		assertTrue("Register should be unsuccessful", isRegistrationUnsuccessful);
	}

	@Test
	public void enteringAnExistingNickname() throws InterruptedException {
		SuccessfulAndUnsuccessfulLogin successfulAndUnsuccessfulLogin = new MainPage(driver)
				.open()
				.clickRegistrationTab()
				.enterLogin("minibuls5")
				.enterRandomEmail("test.co", 10)
				.enterRandomPassword(8)
				.clickRegisterButton();


		TimeUnit.SECONDS.sleep(10);

		boolean isRegistrationUnsuccessful = successfulAndUnsuccessfulLogin.showErrorInvalidLogin();

		assertTrue("Register should be unsuccessful", isRegistrationUnsuccessful);
	}
}
