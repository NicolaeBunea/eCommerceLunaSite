package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

public class TestBase {

    private WebDriver driver;
    private Properties prop;
    public void initiateDriver(){
        String browserName = prop.getProperty("browser");
        if (browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
            driver= new ChromeDriver();
        }
    }








}
