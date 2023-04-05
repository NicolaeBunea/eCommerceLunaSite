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
        createAccountPage.createAccountValid("Create New Customer Account","oana","hoidrag","oana.h@yahoo.com",
                "Test@1234","Test@1234");
    }
}
