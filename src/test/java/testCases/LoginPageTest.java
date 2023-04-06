package testCases;

import base.BaseTest;
import org.junit.Test;
import pages.BridgePage;
import pages.LoginPage;
import utility.TestUtil;

import java.util.ResourceBundle;

public class LoginPageTest extends BaseTest {

    @Test
    public void testLoginValid(){
        BridgePage bridgePage=new BridgePage(getDriver());
        bridgePage.clickSignIn();

        ResourceBundle validValues = ResourceBundle.getBundle("inputData.loginTestData");

        LoginPage loginPage=new LoginPage(getDriver());
        loginPage.loginValidProcess(
                validValues.getString("login.title"),
                validValues.getString("login.valid.email"),
                validValues.getString("login.valid.password"),
                validValues.getString("login.valid.welcomeMessage"),
                validValues.getString("login.valid.homePageTitle"));
    }

    @Test
    public void testLoginInvalid(){
        BridgePage bridgePage=new BridgePage(getDriver());
        bridgePage.clickSignIn();

        ResourceBundle invalidValues=ResourceBundle.getBundle("inputData.loginTestData");

        LoginPage loginPage=new LoginPage(getDriver());
        loginPage.loginInValidProcess(
                invalidValues.getString("login.title"),
                invalidValues.getString("login.invalid.email"),
                invalidValues.getString("login.invalid.password"),
                invalidValues.getString("login.invalid.errorMessage"));
    }

}
