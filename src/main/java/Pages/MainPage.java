package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;

public class MainPage extends BaseTest {

    public MainPage clickOneTrustClose() {

        driver.findElement(By.xpath("(//*[@aria-label='Kapat'])[1]")).click();

        return this;
    }
}
