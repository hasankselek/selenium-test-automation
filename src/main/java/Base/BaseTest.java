package Base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest extends Data {

    @BeforeMethod
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }


    @AfterMethod
    public void tearDown(){
        if(driver != null){
            driver.close();
            driver.quit();
        }
    }


}
