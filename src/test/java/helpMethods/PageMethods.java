package helpMethods;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PageMethods {
    public WebDriver driver;
    public PageMethods(WebDriver driver) {
        this.driver=driver;
    }

    public void validateTitlePage(String value){
        String actualPage= driver.getTitle();
        Assert.assertTrue("The expected page was not Displayed", value.equals(actualPage));
    }
}
