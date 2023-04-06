package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BridgePage extends BasePage{
    public BridgePage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath ="//a[contains(text(),'Sign In')]")
    private WebElement signInButton;
    @FindBy(xpath = "(//a[normalize-space()='Create an Account'])[1]")
    private WebElement createAccButton;

    public void clickSignIn(){
        elementMethods.clickElement(signInButton);
    }

    public void clickCreateAccount(){
        elementMethods.clickElement(createAccButton);
    }
}
