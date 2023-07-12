package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class Computers {
    private WebDriver _driver;
    public Computers(WebDriver driver)
    {
        this._driver = driver;
        PageFactory.initElements(_driver,this);
    }

    @FindBy(partialLinkText = "Computers")
    private WebElement computers;
    @FindBy(partialLinkText = "Desktops")
    private WebElement desktops;
    @FindBy(partialLinkText = "Build your own cheap computer")
    private WebElement cheapComputer;
    @FindBy(xpath = "(//input[@type='radio'])[3]")
    private WebElement processorType;
    @FindBy(xpath = "(//input[@type='radio'])[4]")
    private WebElement ramType;
    @FindBy(xpath = "(//input[@type='radio'])[8]")
    private WebElement hddType;
    @FindBy(xpath = "(//input[@type='button'])[3]")
    private WebElement addToCart;
    public void selectComputer()
    {
        computers.click();
        desktops.click();

        if(cheapComputer.isEnabled())
        {
            cheapComputer.click();
        }
        else
        {
           System.out.println("Failed to check");
        }

        processorType.click();
        ramType.click();
        hddType.click();
        addToCart.click();
    }
}
