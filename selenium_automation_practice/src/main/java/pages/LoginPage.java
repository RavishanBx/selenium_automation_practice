package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By usernameField = By.id("username");
    private By pwdField = By.id("password");
    private By loginBtn = By.cssSelector("button[type='submit']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(pwdField).sendKeys(password);
    }

    public SecureAreaPage clickLoginBtn(){
        driver.findElement(loginBtn).click();
        return new SecureAreaPage(driver);
    }


}
