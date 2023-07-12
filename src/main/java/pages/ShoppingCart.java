package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ShoppingCart {
    private WebDriver _driver;
    public ShoppingCart(WebDriver driver)
    {
        this._driver = driver;
        PageFactory.initElements(_driver,this);
    }

    @FindBy(partialLinkText = "shopping cart")
    private WebElement shoppingcart;
    @FindBy(partialLinkText = "Build your own cheap computer")
    private WebElement cheapComputer;
    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    private WebElement removingItem;
    @FindBy(xpath = "(//input[@type='submit'])[2]")
    private WebElement updateShoppingCart;
    @FindBy(css = "div[class='order-summary-content']")
    private WebElement summaryContent;
    @FindBy(xpath = "(//input[@type='button'])[3]")
    private WebElement addToCart;

    public void goShoppingCart()
    {
        cheapComputer.click();
        addToCart.click();

        shoppingcart.click();
    }

    public void veryTypeComputer()
    {
        String computerType = cheapComputer.getText();
        String actualComputerType = "Build your own cheap computer";




        if(computerType.equalsIgnoreCase(actualComputerType))
        {
          System.out.println("Correct type of computer added to cart");
        }
        else
        {
            System.out.println(actualComputerType + ", Was added to cart");
        }
    }

    public void removingItem()
    {

       removingItem.click();
       updateShoppingCart.click();
    }

    public void isCartEmpty()
    {
        String actualSummary = summaryContent.getText();
        String expectedSummary = "Your Shopping Cart is empty!";

        if (expectedSummary.equalsIgnoreCase(actualSummary))
        {
           System.out.println(actualSummary);
        }
        else
        {
            System.out.println("Your sammary cart isn't empty");
        }


    }


}
