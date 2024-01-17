/**
 * 
 */
package Runners;

import java.time.Duration;

// import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author hp
 *
 */
public class LoginStepDefinitions 
{
	private WebDriver driver;
	private WebDriverWait wait;
	
	@Before
	public void setUp() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://testing.d21ajyco9f10q5.amplifyapp.com/");
		driver.findElement(By.id("webSignInBtn")).click();
		System.out.println("user is on login page");
	}

	@When("user enters username {username} and password {password}")
	public void user_enters_username_and_password(String username, String password) {
		
		
		 WebElement usernameField = driver.findElement(By.id("SignInEmail"));
		 WebElement passwordField = driver.findElement(By.id("SignInPswd"));
		 
		 usernameField.sendKeys(username);
		 passwordField.sendKeys(password);
	}

	@When("click on the login button")
	public void click_on_the_login_button() {
		WebElement LoginBtn = driver.findElement(By.xpath("//button[@class='btn newSignInBtn']"));
		LoginBtn.click();
	}
	
	/*@Then("the user should see {string}")
    public void the_user_should_see(String expectedMessage) {
        WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message"))); // Replace with your message element locator
        String actualMessage = messageElement.getText();

        Assert.assertEquals(expectedMessage, actualMessage);
    }*/

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("user is on login page");
	}
	
	@After
	public void tearDown() {
		driver.close();
	}


}
