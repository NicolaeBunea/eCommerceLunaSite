package base;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.TestUtil;

import java.time.Duration;
import java.util.Properties;

public class BaseTest {

    private WebDriver driver;
    private Properties prop;

    @Before
    public  void initiateDriver(){
        String browserName = prop.getProperty("browser");

        if (browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
            driver= new ChromeDriver();
        }
        TestUtil util = new TestUtil();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(util.Page_Time_Out));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(util.Implicit_Wait));

        driver.get(prop.getProperty("url"));
    }








}
