package base;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utility.TestUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {

    public WebDriver driver;
    public Properties prop;

    @Before
    public  void initiateDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");

        ChromeOptions  chromeOptions=new ChromeOptions();
        driver= new ChromeDriver(chromeOptions);
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    public WebDriver getDriver(){
        return driver;
    }








}
