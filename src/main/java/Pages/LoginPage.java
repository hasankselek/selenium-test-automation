package Pages;

import Base.Data;
import org.openqa.selenium.By;

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
}
