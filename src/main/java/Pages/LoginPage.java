package Pages;

import Base.Data;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends Data {

    public LoginPage fillEmail(String email){

        driver.findElement(By.name("userLoginId")).sendKeys(email);
        return this;
    }

    public LoginPage fillPassword(String password){

        driver.findElement(By.name("password")).sendKeys(password);
        return this;
    }

    public LoginPage clickLogin(){

        driver.findElement(By.xpath("//*[@data-uia='login-submit-button']")).click();
        return this;
    }

    public LoginPage passwordMessageController(){
        String value = driver.findElement(By.cssSelector("[data-uia='password-field+validationMessage']")).getText();
        Assert.assertEquals(value, message);
        return this;
    }

    public LoginPage unsuccessfulMessageController(){
        String value = driver.findElement(By.cssSelector("[data-uia='error-message-container+header']")).getText();
        Assert.assertEquals(value, unsuccessfulErrorMessage);
        return this;
    }

    public LoginPage maxCharMessageController(){
        String value = driver.findElement(By.id(":r1:")).getText();
        Assert.assertEquals(value,maxCharErrorMessage);
        return this;
    }
}
