import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class Login extends Base{
    @Given("^user name \"(.*)\" and password \"(.*)\"$")
    public void cridential(String username, String password) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver=capabilities();

        driver.findElement(By.id("com.appsgallery.sagar.loginregistrationexample:id/editLogin")).sendKeys(username);
        driver.findElement(By.id("com.appsgallery.sagar.loginregistrationexample:id/editPasswordLogin")).sendKeys(password);
        driver.findElement(By.id("com.appsgallery.sagar.loginregistrationexample:id/login")).click();
//        driver.findElement(By.id("com.appsgallery.sagar.loginregistrationexample:id/login")).click();
    }
}
