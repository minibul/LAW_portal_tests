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
		driver.findElement(MainPageLocators.loginButton).click();
		return new SuccessfulAndUnsuccessfulLogin(driver);
	}

	public MainPage clickRegistrationTab() {
		driver.findElement(MainPageLocators.registrationTab).click();
		return this;
	}
	public MainPage clickConfirmChangePasswordButton() {
		driver.findElement(MainPageLocators.confirmChangePasswordButton).click();
		return new MainPage(driver);
	}

	public MainPage clickChangePasswordButton() {
		driver.findElement(MainPageLocators.changePasswordButton).click();
		return new MainPage(driver);
	}

	public MainPage clickForgotPassword() {
		driver.findElement(MainPageLocators.forgotPassword).click();
		return this;
	}

	public SuccessfulAndUnsuccessfulLogin clickRegisterButton() {
		driver.findElement(MainPageLocators.registerButton).click();
		return new SuccessfulAndUnsuccessfulLogin(driver);
	}

	public MainPage enterLogin(String enterLogin) {
		driver.findElement(MainPageLocators.loginInput).sendKeys(enterLogin);
		return this;
	}

	public MainPage enterNewPassword(String enterNewPassword) {
		driver.findElement(MainPageLocators.newPasswordInput).sendKeys(enterNewPassword);
		return this;
	}

	public MainPage enterConfirmNewPasswordInput(String enterConfirmNewPasswordInput) {
		driver.findElement(MainPageLocators.confirmNewPasswordInput).sendKeys(enterConfirmNewPasswordInput);
		return this;
	}

	public MainPage enterCurrentPasswordInput(String enterCurrentPasswordInput) {
		driver.findElement(MainPageLocators.currentPasswordInput).sendKeys(enterCurrentPasswordInput);
		return this;
	}

	public MainPage enterEmailForResetPassword(String enterEmail) {
		driver.findElement(MainPageLocators.emailResetPasswordInput).sendKeys(enterEmail);
		return this;
	}

	public MainPage enterEmail(String enterEmail) {
		driver.findElement(MainPageLocators.emailInput).sendKeys(enterEmail);
		return this;
	}

	public MainPage enterRandomLogin(int minLength, int maxLength) {
		String login = RandomDataGenerator.generateRandomLogin(minLength, maxLength);
		driver.findElement(MainPageLocators.loginInput).sendKeys(login);
		return this;
	}

	public MainPage enterRandomEmail(String domain, int localPartLength) {
		String email = RandomDataGenerator.generateRandomEmail(domain, localPartLength);
		driver.findElement(MainPageLocators.emailInput).sendKeys(email);
		return this;
	}

	public MainPage enterRandomPassword(int minLength) {
		String password = RandomDataGenerator.generateRandomPassword(minLength);
		driver.findElement(MainPageLocators.passwordInput).sendKeys(password);
		return this;
	}

	public MainPage enterPassword(String enterPassword) {
		driver.findElement(MainPageLocators.passwordInput).sendKeys(enterPassword);
		return this;
	}

	public SuccessfulAndUnsuccessfulLogin clickLoginButtonAfterRecoveryPassword() {
		driver.findElement(MainPageLocators.loginButtonAfterRecoveryPassword).click();
		return new SuccessfulAndUnsuccessfulLogin(driver);
	}

	public SuccessfulAndUnsuccessfulLogin clickResetPasswordSendButton() {
		driver.findElement(MainPageLocators.resetPasswordSendButton).click();
		return new SuccessfulAndUnsuccessfulLogin(driver);
	}

	public boolean showMainPageAfterPasswordRecovery() {
		return driver.findElement(MainPageLocators.mainPage).isDisplayed();
	}

	public boolean showGamepediaHomePage() {
		return driver.findElement(MainPageLocators.gamepediaOpeningConfirmation).isDisplayed();
	}

	public boolean showLeaderboardsHomePage() {
		return driver.findElement(MainPageLocators.leaderboardsOpeningConfirmation).isDisplayed();
	}

	public MainPage clickMenuGamepediaButton() {
		driver.findElement(MainPageLocators.menuGamepediaButton).click();
		return new MainPage(driver);
	}

	public MainPage clickMenuLeaderboardsButton() {
		driver.findElement(MainPageLocators.menuLeaderboardsButton).click();
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
		return driver.findElement(MainPageLocators.downloadWindowsButton).isDisplayed();
	}
	public boolean showDownloadMacOSButton() {
		return driver.findElement(MainPageLocators.downloadMacOSButton).isDisplayed();
	}
	public boolean showPlayLAWPopUp() {
		return driver.findElement(MainPageLocators.playLAWPopUp).isDisplayed();
	}
	public boolean showDownloadAppStoreButton() {
		return driver.findElement(MainPageLocators.downloadAppStoreButton).isDisplayed();
	}
	public boolean showDownloadGoogleButton() {
		return driver.findElement(MainPageLocators.downloadGoogleButton).isDisplayed();
	}
	public boolean showPlayOnlineButton() {
		return driver.findElement(MainPageLocators.playOnlineButton).isDisplayed();
	}
}