package testCases;

import base.BaseTest;
import org.junit.Test;
import pages.BridgePage;
import pages.CreateAccountPage;
import pages.HomePage;

public class CreateAccountPageTest extends BaseTest {

    @Test
    public void metodaCreateAccount(){
        BridgePage bridgePage= new BridgePage(getDriver());
        bridgePage.clickCreateAccount();

        CreateAccountPage createAccountPage=new CreateAccountPage(getDriver());
        createAccountPage.createAccountValid("Create New Customer Account","ana","oidrag","ana.h@yahoo.com",
                "Test@1234","Test@1234","My Account");
    }
}
