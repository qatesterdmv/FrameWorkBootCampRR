package TutorialNinjaBootcamp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Login {
	
	public static WebDriver driver;
    public static SoftAssert softassert = new SoftAssert();
    public static WebDriverWait Wait;
	
@Test
public static void ninjaTest(String username, String password) {

	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://tutorialninjas.com/demo");
	
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.id("input-email")).sendKeys("");
	driver.findElement(By.id("input-password")).sendKeys("");
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	softassert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
    softassert.assertAll();
	driver.quit();
}
}
