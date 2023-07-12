package pages;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;

public class DemoWebShop {
    public LoginPage loginPage;
    public HomePage homePage;
    public Computers computers;
    public ShoppingCart shoppingCart;
    public DemoWebShop(WebDriver driver)
    {
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        computers = new Computers(driver);
        shoppingCart = new ShoppingCart(driver);
    }
}
