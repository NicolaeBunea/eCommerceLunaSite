package pages;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePage {
    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "firstname")
    WebElement firstName;
    @FindBy(id = "lastname")
    WebElement lastName;
    @FindBy(name = "is_subscribed")
    WebElement signUpNews;
    @FindBy(name = "email")
    WebElement emailAddress;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(name = "password_confirmation")
    WebElement passConf;
    @FindBy(id = "password-strength-meter")
    WebElement passMeter;
    @FindBy(xpath = "//button[@title='Create an Account']")
    WebElement createAccountButton;

    public void createAccountValid(String pagina,String fName, String lName,String email,String Pass, String confPass){
        pageMethods.validateTitlePage(pagina);
        elementMethods.fillElement(firstName,fName);
        elementMethods.fillElement(lastName,lName);
        elementMethods.clickElement(signUpNews);
        elementMethods.fillElement(emailAddress,email);
        elementMethods.fillElement(password,Pass);
        elementMethods.fillElement(passConf,confPass);
        elementMethods.clickElement(createAccountButton);


    }
}
