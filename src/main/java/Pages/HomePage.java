package Pages;

import Base.Data;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Data {

    public HomePage welcomeText(){

        String welcomeText = driver.findElement(By.xpath("//*[text()='Tekrar hoş geldiniz!']")).getText();
        Assert.assertEquals("Tekrar hoş geldiniz!", welcomeText);
        return this;
    }
}
