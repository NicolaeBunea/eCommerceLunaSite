package testCases;

import base.BaseTest;
import org.junit.Test;
import pages.CreateAccountPage;
import pages.HomePage;

public class AccountPageTest extends BaseTest {

    @Test
    public void metodaCreateAccount(){
        HomePage homePage= new HomePage(getDriver());
        homePage.clickCreateAcc();

        CreateAccountPage createAccountPage=new CreateAccountPage(getDriver());
        createAccountPage.createAccountValid("Create New Customer Account","ana","oidrag","ana.h@yahoo.com",
                "Test@1234","Test@1234","My Account");
    }
}
