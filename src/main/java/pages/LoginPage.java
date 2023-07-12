package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver _driver;
    public LoginPage(WebDriver driver)
    {
        this._driver = driver;
        PageFactory.initElements(_driver,this);
    }

    @FindBy(css = "a[class='ico-login']")
    private WebElement loginBtn;
    @FindBy(id = "Email")
    private WebElement Email;
    @FindBy(id = "Password")
    private WebElement password;
    @FindBy(xpath = "(//input[@type='submit'])[2]")
    private WebElement submit;
    public void clickLogin()
    {
        loginBtn.click();
    }

    public void setLoginDetails(String Username, String Password)
    {
        Email.sendKeys(Username);
        password.sendKeys(Password);
        submit.click();
    }

}
