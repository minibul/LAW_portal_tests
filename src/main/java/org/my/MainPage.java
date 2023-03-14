package org.my;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{

	public static final String URL = "https://stg-portal.legendsatwar.io/login";

	private final By loginButton = By.xpath(".//button[@class='chakra-button css-g8bpku']");
	private final By RegisterButton = By.xpath(".//button[@class='chakra-text css-1m4p5iy']");
	private final By registrationTab = By.xpath(".//h2[@class='chakra-heading css-1ytomps']");
	private final By emailInput = By.xpath(".//input[@class='chakra-input css-1kejibv']");
	private final By passwordInput = By.xpath(".//input[@class='chakra-input css-1mqp856']");
	private final By loginInput = By.xpath(".//input[@class='chakra-input css-dovvw3']");



	public MainPage(WebDriver driver) {
		super(driver);
	}

	public LoggedInTimerPage clickLoginButton() {
		driver.findElement(loginButton).click();
		return new LoggedInTimerPage(driver);
	}
	public MainPage clickRegistrationTab() {
		driver.findElement(registrationTab).click();
		return this;
	}

	public MainPage clickRegisterButton() {
		driver.findElement(RegisterButton).click();
		return this;
	}
	public MainPage enterEmail(String enterEmail) {
		driver.findElement(emailInput).sendKeys(enterEmail);
		return this;
	}

	public RandomLoginName entreLogin(int minLength, int maxLength) {
		RandomLoginName randomLoginName = new RandomLoginName(driver);
		String login = randomLoginName.generateRandomLogin(3, 12);
		driver.findElement(loginInput).sendKeys(login);
		return new RandomLoginName(driver);
	}

	/*public RandomLoginName entreLogin(String generateRandomLogin) {
		driver.findElement(loginInput).sendKeys(generateRandomLogin);
		return new RandomLoginName(driver);
	}*/

	public MainPage enterPassword(String enterPassword) {
		driver.findElement(passwordInput).sendKeys(enterPassword);
		return this;
	}

	public MainPage open() {
		driver.get(URL);
		return this;
	}
}