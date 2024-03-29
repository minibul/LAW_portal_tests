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
		return driver.findElement(MainPageLocators.loggedIn).isDisplayed();
	}
	public boolean showErrorInvalidLogin() {
		return driver.findElement(MainPageLocators.invalidLogin).isDisplayed();
	}
	public boolean showPasswordRecovery() {
		return driver.findElement(MainPageLocators.passwordRecovery).isDisplayed();
	}
	public boolean showInvalidPasswordRecovery() {
		return driver.findElement(MainPageLocators.invalidPasswordRecovery).isDisplayed();
	}
	public MainPage clickLoginButtonAfterRecoveryPassword() {
		driver.findElement(MainPageLocators.loginButtonAfterRecoveryPassword).click();
		return new MainPage(driver);
	}
	public MainPage clickMenuButton() {
		driver.findElement(MainPageLocators.menuButton).click();
		return new MainPage(driver);
	}
	public boolean showMainPageAfterPasswordRecovery() {
		return driver.findElement(MainPageLocators.mainPage).isDisplayed();
	}
	public SuccessfulAndUnsuccessfulLogin waitForElement(WebDriverWait wait, By locator) {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return this;
	}
	public MainPage clickPlayButton() {
		driver.findElement(MainPageLocators.playButton).click();
		return new MainPage(driver);
	}


}
