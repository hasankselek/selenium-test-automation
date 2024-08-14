package Pages;

import Base.Data;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Data {

    public HomePage loginController(){

        String value =  driver.findElement(By.cssSelector("[data-uia='nmhp-card-hero-text-welcome']")).getText();
        Assert.assertEquals("Tekrar hoş geldiniz!", value);
        return this;
    }
}
