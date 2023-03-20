package org.my;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SuccessfulRegisterNewUserTests extends BaseUITest {

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