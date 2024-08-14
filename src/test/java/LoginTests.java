import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.MainPage;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Test
    public void loginSuccessful(){

        mainPage.clickOneTrustClose();

        loginPage.fillEmail("hasankucukselek7@gmail.com")
                 .fillPassword("Hasan1187.")
                 .clickLogin();

        homePage.welcomeText();



    }
}
