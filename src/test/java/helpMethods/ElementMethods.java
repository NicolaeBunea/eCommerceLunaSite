package helpMethods;

import org.junit.Assert;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementMethods {

    public WebDriver driver;

    public ElementMethods(WebDriver driver){
        this.driver=driver;
    }

    public void clickElement(WebElement element){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",element);
        element.click();
    }

    public void fillElement(WebElement element, String value){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",element);
        element.sendKeys(value);
    }
    public void validateElementText(WebElement element, String value){
        String actualValue=element.getText();
        Assert.assertEquals("Text message is not correct!",value,actualValue);
    }

    /*public void resolveCaptcha(WebElement element, String atr){
        String captchaCode= resolveCaptcha(driver.findElement(element).getAttribute(atr);
    }*/
}
