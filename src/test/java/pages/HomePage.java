package pages;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath ="//a[contains(text(),'Sign In')]")
    private WebElement signInButton;
    @FindBy(xpath = "(//a[normalize-space()='Create an Account'])[1]")
    private WebElement createAccButton;

    @FindBy(xpath = "(//span[@class='logged-in'][normalize-space()='Welcome, nicu bunea!'])[1]")

    public void clickSignIn(){
        elementMethods.clickElement(signInButton);
    }
    public void clickCreateAcc(){
        elementMethods.clickElement(createAccButton);
    }
}
