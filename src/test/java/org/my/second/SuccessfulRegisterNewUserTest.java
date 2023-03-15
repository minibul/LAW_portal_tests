package org.my.second;

import org.junit.Test;
import org.my.MainPage;

import static org.junit.Assert.assertTrue;

public class SuccessfulRegisterNewUserTest extends BaseUITest {

    @Test
    public void checkSuccessfulLoggedIn() {
        boolean isRegistrationSuccessful = new MainPage(driver)
                .open()
                .clickRegistrationTab()
                .enterLogin(3, 12)
                .enterRandomEmail("d.d.com", 20)
                .enterRandomPassword(8)
                .clickRegisterButton()
                .loggedInShowTimer();

        assertTrue("Failed to register", isRegistrationSuccessful);
    }
}
