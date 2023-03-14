package org.my;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{

	public static final String URL = "https://stg-portal.legendsatwar.io/login";

	private final By loginButton = By.xpath(".//button[@class='chakra-button css-g8bpku']");
	private final By emailInput = By.xpath(".//input[@class='chakra-input css-1kejibv']");
	private final By passwordInput = By.xpath(".//input[@class='chakra-input css-1mqp856']");



	public MainPage(WebDriver driver) {
		super(driver);
	}

	public LoggedInTimerPage clickLoginButton() {
		driver.findElement(loginButton).click();
		return new LoggedInTimerPage(driver);
	}

	public MainPage enterEmail(String orderNumber) {
		driver.findElement(emailInput).sendKeys(orderNumber);
		return this;
	}

	public MainPage enterPassword(String orderNumber) {
		driver.findElement(passwordInput).sendKeys(orderNumber);
		return this;
	}

	public MainPage open() {
		driver.get(URL);
		return this;
	}
}