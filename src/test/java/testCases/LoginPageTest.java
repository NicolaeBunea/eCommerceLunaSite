package testCases;

import base.BaseTest;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {

    @Test
    public void metodaLogin(){
        HomePage homePage= new HomePage(getDriver());
        homePage.clickSignIn();


    LoginPage loginPage=new LoginPage(getDriver());
    loginPage.loginValidProcess("Customer Login", "nicu.bunea@yahoo.com","Test@1234","Home Page");

    }
}
