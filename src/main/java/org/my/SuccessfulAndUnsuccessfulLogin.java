package org.my;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuccessfulAndUnsuccessfulLogin extends BasePage{

	public SuccessfulAndUnsuccessfulLogin(WebDriver driver) {
		super(driver);
	}

	public boolean loggedInShowTimer() {
		return driver.findElement(Locators.loggedIn).isDisplayed();
	}
	public boolean showErrorInvalidLogin() {
		return driver.findElement(Locators.invalidLogin).isDisplayed();
	}
	public boolean showPasswordRecovery() {
		return driver.findElement(Locators.passwordRecovery).isDisplayed();
	}
	public boolean showInvalidPasswordRecovery() {
		return driver.findElement(Locators.invalidPasswordRecovery).isDisplayed();
	}
	public MainPage clickLoginButtonAfterRecoveryPassword() {
		driver.findElement(Locators.loginButtonAfterRecoveryPassword).click();
		return new MainPage(driver);
	}
	public MainPage clickMenuButton() {
		driver.findElement(Locators.menuButton).click();
		return new MainPage(driver);
	}
	public boolean showMainPageAfterPasswordRecovery() {
		return driver.findElement(Locators.mainPage).isDisplayed();
	}
	public SuccessfulAndUnsuccessfulLogin waitForElement(WebDriverWait wait, By locator) {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return this;
	}
	public MainPage clickPlayButton() {
		driver.findElement(Locators.playButton).click();
		return new MainPage(driver);
	}


}
