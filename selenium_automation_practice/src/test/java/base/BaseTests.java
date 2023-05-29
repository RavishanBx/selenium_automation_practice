package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.List;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);

        System.out.println(driver.getTitle());

        driver.quit();
    }

    public static void main(String args[]){
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
