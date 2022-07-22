import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.net.MalformedURLException;
import java.util.Random;

public class CreateUser extends Base {
    Random random = new Random();
    int rnd = random.nextInt(100);
    String no=Integer.toString(rnd);
    AndroidDriver<AndroidElement> driver=capabilities();

    public CreateUser() throws MalformedURLException {
    }
    @Given("^register$")
    public void register()
    {
        driver.findElement(By.id("com.appsgallery.sagar.loginregistrationexample:id/register")).click();
    }
    @And("^create account using Username as \"(.*)\" and Password as \"(.*)\"$")
    public void createUser(String username, String password)
    {
        driver.findElement(By.id("com.appsgallery.sagar.loginregistrationexample:id/editTextUserName")).sendKeys(username+no);
        driver.findElement(By.id("com.appsgallery.sagar.loginregistrationexample:id/editTextPassword")).sendKeys(password);
        driver.findElement(By.id("com.appsgallery.sagar.loginregistrationexample:id/editTextConfirmPassword")).sendKeys(password);
        driver.findElement(By.id("com.appsgallery.sagar.loginregistrationexample:id/buttonCreateAccount")).click();
        driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));

    }
    @And("^login account using username \"(.*)\" and password \"(.*)\"$")
    public void cridential(String username, String password) throws InterruptedException {
        driver.findElement(By.id("com.appsgallery.sagar.loginregistrationexample:id/editLogin")).sendKeys(username+no);
        driver.findElement(By.id("com.appsgallery.sagar.loginregistrationexample:id/editPasswordLogin")).sendKeys(password);
//        driver.findElement(By.id("com.appsgallery.sagar.loginregistrationexample:id/login")).click();

    }
    @Then("^click on login button$")
    public void login() throws InterruptedException {
        driver.findElement(By.id("com.appsgallery.sagar.loginregistrationexample:id/login")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("com.appsgallery.sagar.loginregistrationexample:id/login")).click();

    }

}
