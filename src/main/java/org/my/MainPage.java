package org.my;

import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{

	public static final String URL = Configuration.getProperty("url");
	public String email = Configuration.getProperty("email");
	public String oldPassword = Configuration.getProperty("oldPassword");
	public String newPassword = Configuration.getProperty("newPassword");


	public MainPage(WebDriver driver) {
		super(driver);
	}

	public SuccessfulAndUnsuccessfulLogin clickLoginButton() {
		driver.findElement(Locators.loginButton).click();
		return new SuccessfulAndUnsuccessfulLogin(driver);
	}

	public MainPage clickRegistrationTab() {
		driver.findElement(Locators.registrationTab).click();
		return this;
	}
	public MainPage clickConfirmChangePasswordButton() {
		driver.findElement(Locators.confirmChangePasswordButton).click();
		return new MainPage(driver);
	}

	public MainPage clickChangePasswordButton() {
		driver.findElement(Locators.changePasswordButton).click();
		return new MainPage(driver);
	}

	public MainPage clickForgotPassword() {
		driver.findElement(Locators.forgotPassword).click();
		return this;
	}

	public SuccessfulAndUnsuccessfulLogin clickRegisterButton() {
		driver.findElement(Locators.registerButton).click();
		return new SuccessfulAndUnsuccessfulLogin(driver);
	}

	public MainPage enterLogin(String enterLogin) {
		driver.findElement(Locators.loginInput).sendKeys(enterLogin);
		return this;
	}

	public MainPage enterNewPassword(String enterNewPassword) {
		driver.findElement(Locators.newPasswordInput).sendKeys(enterNewPassword);
		return this;
	}

	public MainPage enterConfirmNewPasswordInput(String enterConfirmNewPasswordInput) {
		driver.findElement(Locators.confirmNewPasswordInput).sendKeys(enterConfirmNewPasswordInput);
		return this;
	}

	public MainPage enterCurrentPasswordInput(String enterCurrentPasswordInput) {
		driver.findElement(Locators.currentPasswordInput).sendKeys(enterCurrentPasswordInput);
		return this;
	}

	public MainPage enterEmailForResetPassword(String enterEmail) {
		driver.findElement(Locators.emailResetPasswordInput).sendKeys(enterEmail);
		return this;
	}

	public MainPage enterEmail(String enterEmail) {
		driver.findElement(Locators.emailInput).sendKeys(enterEmail);
		return this;
	}

	public MainPage enterRandomLogin(int minLength, int maxLength) {
		String login = RandomDataGenerator.generateRandomLogin(minLength, maxLength);
		driver.findElement(Locators.loginInput).sendKeys(login);
		return this;
	}

	public MainPage enterRandomEmail(String domain, int localPartLength) {
		String email = RandomDataGenerator.generateRandomEmail(domain, localPartLength);
		driver.findElement(Locators.emailInput).sendKeys(email);
		return this;
	}

	public MainPage enterRandomPassword(int minLength) {
		String password = RandomDataGenerator.generateRandomPassword(minLength);
		driver.findElement(Locators.passwordInput).sendKeys(password);
		return this;
	}

	public MainPage enterPassword(String enterPassword) {
		driver.findElement(Locators.passwordInput).sendKeys(enterPassword);
		return this;
	}

	public SuccessfulAndUnsuccessfulLogin clickLoginButtonAfterRecoveryPassword() {
		driver.findElement(Locators.loginButtonAfterRecoveryPassword).click();
		return new SuccessfulAndUnsuccessfulLogin(driver);
	}

	public SuccessfulAndUnsuccessfulLogin clickResetPasswordSendButton() {
		driver.findElement(Locators.resetPasswordSendButton).click();
		return new SuccessfulAndUnsuccessfulLogin(driver);
	}

	public boolean showMainPageAfterPasswordRecovery() {
		return driver.findElement(Locators.mainPage).isDisplayed();
	}

	public boolean showGamepediaHomePage() {
		return driver.findElement(Locators.gamepediaOpeningConfirmation).isDisplayed();
	}

	public boolean showLeaderboardsHomePage() {
		return driver.findElement(Locators.leaderboardsOpeningConfirmation).isDisplayed();
	}

	public MainPage clickMenuGamepediaButton() {
		driver.findElement(Locators.menuGamepediaButton).click();
		return new MainPage(driver);
	}

	public MainPage clickMenuLeaderboardsButton() {
		driver.findElement(Locators.menuLeaderboardsButton).click();
		return new MainPage(driver);
	}

	public MainPage open() {
		driver.get(URL);
		return this;
	}

	public String getEmail() {
		return email;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public boolean showDownloadWindowsButton() {
		return driver.findElement(Locators.downloadWindowsButton).isDisplayed();
	}
	public boolean showDownloadMacOSButton() {
		return driver.findElement(Locators.downloadMacOSButton).isDisplayed();
	}
	public boolean showPlayLAWPopUp() {
		return driver.findElement(Locators.playLAWPopUp).isDisplayed();
	}
	public boolean showDownloadAppStoreButton() {
		return driver.findElement(Locators.downloadAppStoreButton).isDisplayed();
	}
	public boolean showDownloadGoogleButton() {
		return driver.findElement(Locators.downloadGoogleButton).isDisplayed();
	}
	public boolean showPlayOnlineButton() {
		return driver.findElement(Locators.playOnlineButton).isDisplayed();
	}
}