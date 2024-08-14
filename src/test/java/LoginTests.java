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
    public void loginSuccessful() throws InterruptedException {

        mainPage.clickOneTrustClose();
        loginPage.fillEmail("testotomasyonu09@gmail.com")
                 .fillPassword("Test1234.")
                 .clickLogin();
        Thread.sleep(3000);
        homePage.loginController();
    }

    @Test
    public void loginUnsuccessful() throws InterruptedException {

        mainPage.clickOneTrustClose();
        loginPage.fillEmail("testotomasyonu@gmail.com")
                .fillPassword("Test1234.")
                .clickLogin()
                .unsuccessfulMessageController();

    }

    @Test
    public void maxCharacterControl() throws InterruptedException {

        mainPage.clickOneTrustClose();
        loginPage.fillEmail("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaasudhıaushdıaushgdıausghdıuasghdıuasghduıasuıd")
                .fillPassword("12937123123y12983712837812ıasgdyıuagsdyugasyıudgaısuydghaıusydghauısghd")
                .clickLogin()
                .maxCharMessageController();

    }

    @Test
    public void minCharacterControl() throws InterruptedException {

        mainPage.clickOneTrustClose();
        loginPage.fillEmail("testotomasyonu09@gmail.com")
                .clickLogin()
                .passwordMessageController();


    }
}
