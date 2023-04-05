package pages;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver){
        super(driver);
    }

    //Page factory- object reposytory

    @FindBy(name = "login[username]")
    private WebElement username;
    @FindBy(name = "login[password]")
    private WebElement password;
    @FindBy(xpath = "//span[contains(text(),'Sign In')]")
    private WebElement signInButton;
    @FindBy(xpath = "//span[text()='Customer Login']")
    private WebElement CustomerLogin;
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    private WebElement errorMsg;
    @FindBy(className ="captcha-img" )
    private WebElement captchaElement;


    //Initializing the page Objects
   public void loginValidProcess(String page1,String email,String pass, String page2){
       pageMethods.validateTitlePage(page1);
       elementMethods.fillElement(username,email);
       elementMethods.fillElement(password,pass);
       elementMethods.clickElement(signInButton);
       pageMethods.validateTitlePage(page2);
   }

}
