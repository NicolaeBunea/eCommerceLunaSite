package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseTest {

    //Page factory- object reposytory

    @FindBy(name = "login[username]")
    private WebElement username;
    @FindBy(name = "login[password]")
    private WebElement password;
    @FindBy(xpath = "//span[text()='submit']")
    private WebElement signInButton;




}
