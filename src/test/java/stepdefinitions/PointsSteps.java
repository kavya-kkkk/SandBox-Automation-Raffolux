/**
 * 
 */
package stepdefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author hp
 *
 */
public class PointsSteps {
	private static WebDriver driver;

/*	@Before
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

	@Given("I am on the points store page")
	public void i_am_on_the_points_store_page() {
		System.out.println("I am on the points_store page");
		driver.findElement(By.xpath("//div[@class='pointsClaimed']")).click();
	}

	@Then("I should see the points store title")
	public void i_should_see_the_points_store_title() {
		System.out.println("I should see the title {string}");
		boolean flag = driver.findElement(By.xpath("//h3[text()='Points Store']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the arrow symbol")
	public void i_should_see_the_arrow_symbol() {
		System.out.println("I should see the Arrow symbol");
		boolean flag = driver.findElement(By.xpath("//i[@class='fas fa-solid fa-arrow-left desk-store-hide']"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the store tab")
	public void i_should_see_the_store_tab() {
		System.out.println("I should see the text {string}");
		boolean flag = driver.findElement(By.id("pills-home-tab")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the earned tab")
	public void i_should_see_the_earned_tab() {
		System.out.println("I should see the text {string}");
		boolean flag = driver.findElement(By.xpath("//button[@class='nav-link storetab active']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Latest Offers text")
	public void i_should_see_the_latest_offers_text() {
		System.out.println("I am on the points_store page");
		boolean flag = driver.findElement(By.xpath("(//h5[@class='offersListHeading mb-offersHeading'])[1]"))
				.isDisplayed();

		if (flag == true) {
			Assert.assertTrue(flag);
		} else {
			Assert.assertFalse(flag);
		}
	}

	@Then("I should see the All Prizes text")
	public void i_should_see_the_all_prizes_text() {
		System.out.println("I should see text {string}");
		boolean flag = driver.findElement(By.xpath("//h5[text()='ALL PRIZES']")).isDisplayed();

		if (flag == true) {
			Assert.assertFalse(flag);
		} else {
			Assert.assertTrue(flag);
		}
	}

	@Then("I should see the list of prizes under Latest Offers section")
	public void i_should_see_the_list_of_prizes_under_latest_offers_section() {
		System.out.println("I am on the points_store page");
	}

	@Then("I should see the list of prizes under All Prizes section")
	public void i_should_see_the_list_of_prizes_under_all_prizes_section() {
		System.out.println("I am on the points_store page");
	}

	@Then("I should see the text you have raffolux points along with raffolux logo and count of points")
	public void i_should_see_the_text_you_have_raffolux_points_along_with_raffolux_logo_and_count_of_points() {
		System.out.println("I am on the points_store page");
	}*/
}
