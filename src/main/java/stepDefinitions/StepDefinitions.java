package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DemoWebShop;

public class StepDefinitions {
    WebDriver driver;
    public DemoWebShop appliction;


    @Before @Given("The test will run on chrome")
    public void the_test_will_run_on_chrome() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demowebshop.tricentis.com/");
        appliction = new DemoWebShop(driver);
    }
    @Given("Demo web shop is open")
    public void demo_web_shop_is_open() {
        appliction.loginPage.clickLogin();
    }

    @And("^User enter (.*) and (.*) on login page")
    public void user_enter_Username_and_Password_on_login_page(String Username, String Password) {
       appliction.loginPage.setLoginDetails(Username,Password);
    }
    @Given("User logins successful")
    public void user_logins_successful()
    {
        appliction.homePage.verifyLoggedInSuccessfully();
    }
    @When("home page is open, user select computers")
    public void home_page_is_open_user_select_computers() {
        appliction.computers.selectComputer();
    }
    @Then("User select type of computer needed")
    public void user_select_type_of_computer_needed()
    {
        appliction.shoppingCart.goShoppingCart();
        appliction.shoppingCart.veryTypeComputer();
    }
    @And("User buy the computer")
    public void user_buy_the_computer()
    {
        appliction.shoppingCart.removingItem();
        appliction.shoppingCart.isCartEmpty();
    }


    @After
    public void closeChrome()
    {
        driver.close();
        driver.quit();
    }
}
