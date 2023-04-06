package utility;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

import java.util.ResourceBundle;

public class TestUtil extends BasePage {

    public long Page_Time_Out = 20;
    public long Implicit_Wait  =10;

    public TestUtil(WebDriver driver) {
        super(driver);
    }

    public void getBundels(String baseName){
        ResourceBundle loginTestData= ResourceBundle.getBundle(baseName);

    }
}
