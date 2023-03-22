package org.my;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
	protected WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		driver.manage().window().setSize(new Dimension(1200, 1200));
	}
}

