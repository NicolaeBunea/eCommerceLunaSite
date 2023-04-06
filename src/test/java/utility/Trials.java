package utility;

import org.junit.Test;

import java.util.ResourceBundle;

public class Trials {
    @Test
    public void testBundle() {
        ResourceBundle messages = ResourceBundle.getBundle("inputData.loginTestData");
        String loginTitle = messages.getString("login.title");
        String validEmail = messages.getString("login.valid.email");
        String validPassword = messages.getString("login.valid.password");
        String validWelcomeMessage = messages.getString("login.valid.welcomeMessage");

        System.out.println(loginTitle+validEmail+validPassword+validWelcomeMessage);
    }
}
