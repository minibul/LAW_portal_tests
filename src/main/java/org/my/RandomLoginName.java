package org.my;

import org.openqa.selenium.WebDriver;

import java.util.Random;

public class RandomLoginName extends BasePage {

	public RandomLoginName(WebDriver driver) {
		super(driver);
	}

	public String generateRandomLogin(int minLength, int maxLength) {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_ ";
		Random random = new Random();
		int length = random.nextInt(maxLength - minLength + 1 - 4) + minLength + 4;
		StringBuilder sb = new StringBuilder(length);
		sb.append("test");
		for (int i = 0; i < length - 4; i++) {
			int index = random.nextInt(chars.length());
			sb.append(chars.charAt(index));
		}
		return sb.toString();

	}


}
