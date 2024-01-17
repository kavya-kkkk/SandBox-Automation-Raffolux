/**
 * 
 */
package stepdefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
public class PointStore_Steps {

	/*private static WebDriver driver;

	// Open browser and navigate to the home page after login
	@Before
	public void setUp() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.get("https://sandbox.raffolux.com/accounts/login/");
		driver.findElement(By.id("emailAddress")).sendKeys("Dharmaveera.Devaputra@rhibhus.com");
		driver.findElement(By.id("Password")).sendKeys("Dharma@8103");
		driver.findElement(By.xpath("//button[@class='primary-btn-18 w-100 mt-0 py-2']")).click();
	}

	@After
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

	// Navigate to the points store page
	@Given("I am on the points_store page")
	public void i_am_on_the_points_store_page() throws InterruptedException {
		System.out.println("I am on the points_store page");
		driver.findElement(By.xpath("//div[@class='pointsClaimed']")).click();
	}

	// Verify Store text
	@Then("I should see the title {string}")
	public void i_should_see_the_title(String string) {
		System.out.println("I should see the title {string}");
		boolean flag = driver.findElement(By.xpath("//h3[text()='Points Store']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	// Verify Arrow symbol
	@Then("I should see the Arrow symbol")
	public void i_should_see_the_arrow_symbol() {
		System.out.println("I should see the Arrow symbol");
		boolean flag = driver.findElement(By.xpath("//i[@class='fas fa-solid fa-arrow-left desk-store-hide']"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	// Verify navigation by clicking the arrow symbol
	@When("I click on the Arrow symbol")
	public void i_click_on_the_arrow_symbol() {
		System.out.println("I click on the Arrow symbol");
		driver.findElement(By.xpath("//i[@class='fas fa-solid fa-arrow-left desk-store-hide']")).click();
	}

	// Verify the successful login
	@Then("user should redirect to the raffolux homepage")
	public void user_should_redirect_to_the_raffolux_homepage() {
		System.out.println("user should redirect to the raffolux homepage");
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://sandbox.raffolux.com/";
		Assert.assertEquals(ExpectedURL, ActualURL);
	}

	// Verify Earned text
	@Then("I should see the text {string}")
	public void i_should_see_the_text(String string) {
		System.out.println("I should see the text {string}");
		boolean flag = driver.findElement(By.xpath("//button[@class='nav-link storetab active']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	// Verify the navigation by clicking the Earned tab
	@When("I click on the Earned tab")
	public void i_click_on_the_earned_tab() {
		System.out.println("I click on the Earned tab");
		WebElement ele = driver.findElement(By.id("pills-profile-tab"));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);
	}

	// Verify the elements after clicking the earned tab
	@Then("I should not see the text {string}")
	public void i_should_not_see_the_text(String string) {
		System.out.println("I should not see the text {string}");
		boolean flag = driver.findElement(By.xpath("(//h5[@class='offersListHeading mb-offersHeading'])[1]"))
				.isDisplayed();

		if (flag == true) {
			Assert.assertFalse(flag);
		} else {
			Assert.assertTrue(flag);
		}
	}

	// Verify the elements after clicking the earned tab
	@Then("I should see the text {string} and the count of points available")
	public void i_should_see_the_text_and_the_count_of_points_available(String string) {
		System.out.println("I should see the text {string} and the count of points available");
		boolean flag = driver.findElement(By.xpath("(//h2[@class='pointsHeading mb-pointsHeadingStyle'])[1]"))
				.isDisplayed();
		System.out.println(flag);

		if (flag == true) {
			Assert.assertFalse(flag);
		} else {
			Assert.assertTrue(flag);
		}

		String Actualtext = driver.findElement(By.xpath("(//span[@class='pointsNum'])[1]")).getText();
		System.out.println(Actualtext);
		String Expectedtext = "2194";
		Assert.assertEquals(Expectedtext, Actualtext);
	}

	// Verify the navigation by clicking the Store tab
	@When("I click on the Store tab")
	public void i_click_on_the_store_tab() {
		System.out.println("I click on the Store tab");
		WebElement ele = driver.findElement(By.id("pills-home-tab"));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);
	}

	// Verify the elements after clicking the Store tab
	@Then("I should see text {string}")
	public void i_should_see_text(String string) {
		System.out.println("I should see text {string}");
		boolean flag = driver.findElement(By.xpath("(//h5[@class='offersListHeading mb-offersHeading'])[1]"))
				.isDisplayed();

		if (flag == true) {
			Assert.assertFalse(flag);
		} else {
			Assert.assertTrue(flag);
		}
	}

	// Verify the elements after clicking the Store tab
	@Then("I should see text {string} and count of points available")
	public void i_should_see_text_and_the_count_of_points_available(String string) {
		System.out.println("I should see text {string} and the count of points available");
		boolean flag = driver.findElement(By.xpath("(//h2[@class='pointsHeading mb-pointsHeadingStyle'])[1]"))
				.isDisplayed();
		System.out.println(flag);

		if (flag == true) {
			Assert.assertFalse(flag);
		} else {
			Assert.assertTrue(flag);
		}

		String Actualtext = driver.findElement(By.xpath("(//span[@class='pointsNum'])[1]")).getText();
		System.out.println(Actualtext);
		String Expectedtext = "2194";
		Assert.assertEquals(Expectedtext, Actualtext);
	}
	
	@Then("I should see the text {string}")
	public void i_should_see_the_text(String string) {
		System.out.println("I should see text {string}");
		boolean flag = driver.findElement(By.xpath("(//h5[@class='offersListHeading mb-offersHeading'])[1]"))
				.isDisplayed();

		if (flag == true) {
			Assert.assertFalse(flag);
		} else {
			Assert.assertTrue(flag);
		}
	}*/
}
