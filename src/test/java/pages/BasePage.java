package pages;

import helpMethods.ElementMethods;
import helpMethods.PageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver driver;
    public ElementMethods elementMethods;
    public PageMethods pageMethods;

    public BasePage(WebDriver driver){
        this.driver=driver;
        elementMethods=new ElementMethods(this.driver);
        pageMethods=new PageMethods(this.driver);
        PageFactory.initElements(driver,this);
    }

}
