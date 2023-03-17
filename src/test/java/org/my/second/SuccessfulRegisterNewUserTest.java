package org.my.second;

import org.junit.Test;
import org.my.MainPage;

import static org.junit.Assert.assertTrue;

public class SuccessfulRegisterNewUserTest extends BaseUITest {

    @Test
    public void checkSuccessfulRegistration() {
        boolean isRegistrationSuccessful = new MainPage(driver)
                .open()
                .clickRegistrationTab()
                .enterRandomLogin(3, 12)
                .enterRandomEmail("test.com", 10)
                .enterRandomPassword(8)
                .clickRegisterButton()
                .loggedInShowTimer();

        assertTrue("Failed to register", isRegistrationSuccessful);
    }
}