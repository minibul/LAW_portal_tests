package org.my;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{

	public static final String URL = "https://web-dev.legendsatwar.io/login/";

	private final By loginButton = By.className("Login_Button");
	private final By emailInput = By.xpath(".//input[@class='chakra-input css-b9m908']");
	private final By passwordInput = By.xpath(".//input[@class='chakra-input css-1gx523m']");

	//private final By searchOrderButton = By.xpath(".//button[@class='Button_Button__ra12g Header_Button__28dPO']");



	public MainPage(WebDriver driver) {
		super(driver);
	}

	public MainPage clickLoginButton() {
		driver.findElement(loginButton).click();
		return this;
	}

	public MainPage enterEmail(String orderNumber) {
		driver.findElement(emailInput).sendKeys(orderNumber);
		return this;
	}

	public MainPage enterPassword(String orderNumber) {
		driver.findElement(passwordInput).sendKeys(orderNumber);
		return this;
	}

	/* public OrderStatusPage clickSearchOrderButton() {
		driver.findElement(searchOrderButton).click();
		return new OrderStatusPage(driver);
	}
	*/
	public MainPage open() {
		driver.get(URL);
		return this;
	}
}