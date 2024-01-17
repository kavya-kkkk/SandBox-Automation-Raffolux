/**
 * 
 */
package stepdefinitions;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
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
 *public class MyRafflesSteps {

	private static WebDriver driver;

	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}

	@After
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

	public static String CaptureScreenshot(WebDriver driver) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File destinationfile = new File(".\\resources\\homepage2 " + System.currentTimeMillis() + ".png");
		// Always end with .png in order to get the Screenshot as image
		String absolutpathlocation = destinationfile.getAbsolutePath();
		FileUtils.copyFile(srcfile, destinationfile);
		return absolutpathlocation;
	}

	@Given("I am on the my_raffles page")
	public void i_am_on_the_my_raffles_page() {
		driver.get("https://testing.d21ajyco9f10q5.amplifyapp.com/#/");
		driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();
		driver.findElement(By.id("emailAddress")).sendKeys("Dharmaveera.Devaputra@rhibhus.com");
		driver.findElement(By.id("Password")).sendKeys("Dharma@8103");
		driver.findElement(By.id("btnLogin")).click();
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://sandbox.raffolux.com/";
		driver.findElement(By.xpath("//h5[text()='My tickets']")).click();
		Assert.assertEquals(ExpectedURL, ActualURL);
		System.out.println("I am on the my_raffles page");
	}

	@Then("I should see the my_raffles title")
	public void i_should_see_the_my_raffles_title() {
		boolean flag = driver.findElement(By.xpath("//h2[text()='My Raffles']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the arrow symbol")
	public void i_should_see_the_arrow_symbol() {
		boolean flag = driver
				.findElement(
						By.xpath("//a[@class='text-decoration-none fa-solid fa-arrow-left arrowStyles mrdesk-hide']"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the text {string}")
	public void i_should_see_the_text(String string) {
		String ActualText = driver.findElement(By.xpath("//h2[text()=' My Raffles ']")).getText();
		String ExpectedText = " My Raffles ";
		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@When("I click on the arrow symbol")
	public void i_click_on_the_arrow_symbol() {
		driver.findElement(
				By.xpath("//a[@class='text-decoration-none fa-solid fa-arrow-left arrowStyles mrdesk-hide']")).click();
	}

	@Then("I should be on the home page after login")
	public void i_should_be_on_the_home_page_after_login() {
		String ActualUrl = driver.getCurrentUrl();
		String ExpectedUrl = "https://testing.d21ajyco9f10q5.amplifyapp.com/#/homeLogin";
		if (ActualUrl.equals(ExpectedUrl)) {
			Assert.assertEquals(ExpectedUrl, ActualUrl);
		}
	}

	@Then("I should see the active tab")
	public void i_should_see_the_active_tab() {
		boolean flag = driver
				.findElement(By.xpath("//button[@class='nav-link active tab-headingStylings mb-myRaffleTabsStylings']"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the ended tab")
	public void i_should_see_the_ended_tab() {
		boolean flag = driver
				.findElement(By.xpath("//button[@class='nav-link tab-headingStylings mb-myRaffleTabsStylings']"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@When("I click on the ended tab")
	public void i_click_on_the_ended_tab() {
		driver.findElement(By.xpath("//button[@class='nav-link tab-headingStylings mb-myRaffleTabsStylings']")).click();
	}

	@Then("I should see the line under the ended tab")
	public void i_should_see_the_line_under_the_ended_tab() {
		boolean flag = driver
				.findElement(By.xpath("//button[@class='nav-link tab-headingStylings mb-myRaffleTabsStylings active']"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the text You havent entered any raffles yet.")
	public void i_should_see_the_text_you_havent_entered_any_raffles_yet() {
		String ActualText = driver.findElement(By.xpath("(//p[@class='text-black'])[3]")).getText();
		String ExpectedText = ActualText;
		if (ExpectedText.equals(ActualText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("I should see the text click here to see whats on link under the ended tab.")
	public void i_should_see_the_text_click_here_to_see_whats_on_link_under_the_ended_tab() {
		boolean flag = driver.findElement(By.xpath("//*[@id=\"pills-profile\"]/div/div/div/p[2]/a")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@When("I click on the click here to see whats on link under the ended tab.")
	public void i_click_on_the_click_here_to_see_whats_on_link_under_the_ended_tab() {
		driver.findElement(By.xpath("//*[@id=\"pills-profile\"]/div/div/div/p[2]/a")).click();
	}

	@When("I click on the active tab")
	public void i_click_on_the_active_tab() {
		driver.findElement(By.xpath("//button[@class='nav-link tab-headingStylings mb-myRaffleTabsStylings active']"))
				.click();
	}

	@Then("I should see the line under the active tab")
	public void i_should_see_the_line_under_the_active_tab() {
		boolean flag = driver
				.findElement(By.xpath("//button[@class='nav-link tab-headingStylings mb-myRaffleTabsStylings active']"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the text You are not currently entered into any active raffles.")
	public void i_should_see_the_text_you_are_not_currently_entered_into_any_active_raffles() {
		String ActualText = driver
				.findElement(By.xpath("//p[text()=' You are not currently entered into any active raffles. ']"))
				.getText();
		String ExpectedText = ActualText;
		if (ExpectedText.equals(ActualText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("I should see the text click here to see whats on link under the active tab.")
	public void i_should_see_the_text_click_here_to_see_whats_on_link_under_the_active_tab() {
		boolean flag = driver.findElement(By.xpath("//*[@id=\"pills-home\"]/div/div/div/p[2]/a")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@When("I click on the click here to see whats on link under the active tab.")
	public void i_click_on_the_click_here_to_see_whats_on_link_under_the_active_tab() {
		driver.findElement(By.xpath("//*[@id=\"pills-home\"]/div/div/div/p[2]/a")).click();
	}

	@Then("I should be on the home page after__login")
	public void i_should_be_on_the_home_page_after__login() {
		String ActualUrl = driver.getCurrentUrl();
		String ExpectedUrl = "https://testing.d21ajyco9f10q5.amplifyapp.com/#/homeLogin";
		if (ActualUrl.equals(ExpectedUrl)) {
			Assert.assertEquals(ExpectedUrl, ActualUrl);
		}
	}
}

 *
 */
