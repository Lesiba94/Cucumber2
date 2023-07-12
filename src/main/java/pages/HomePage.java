package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver _driver;
    public HomePage(WebDriver driver)
    {
        this._driver = driver;
        PageFactory.initElements(_driver,this);
    }

    @FindBy(css = "a[class='ico-logout']")
    private WebElement logoutBtn;


    public void verifyLoggedInSuccessfully()
    {

        String actual = "Log out";
        String Execpe =  _driver.findElement(By.cssSelector("a[class='ico-logout']")).getText();


        if(actual.equalsIgnoreCase(Execpe))
        {
           System.out.println("Logged in");
        }
        else
        {
           System.out.println("Didn't login");
        }

    }


}
