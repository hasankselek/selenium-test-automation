package Base;

import org.openqa.selenium.WebDriver;

public class Data {

    public static WebDriver driver;

    public String url = "https://www.netflix.com/login";
    public String message = "Parolanız 4 ila 60 karakter olmalıdır.";
    public String unsuccessfulErrorMessage = "testotomasyonu@gmail.com için parola yanlış";
    public String maxCharErrorMessage = "Lütfen geçerli bir e‑posta adresi girin.";

}
