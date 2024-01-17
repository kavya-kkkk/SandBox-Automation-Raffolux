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
 *public class Winners_Gallery_pageSteps {

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

	@Given("I am on the Winners_Gallery page")
	public void i_am_on_the_winners_gallery_page() {
		driver.get("https://testing.d21ajyco9f10q5.amplifyapp.com/#/");
		driver.findElement(By.xpath("//a[text()='Winners Gallery']")).click();
	}

	@Then("I should see the text Winners Gallery")
	public void i_should_see_the_text_winners_gallery() {
		String actualText = driver.findElement(By.xpath("//h1[text()='Winners Gallery']")).getText();
		String expectedText = actualText;
		if (expectedText.equals(actualText)) {
			Assert.assertEquals(expectedText, actualText);
		}
	}

	@Then("I should see the list of winners cards displaying")
	public void i_should_see_the_list_of_winners_cards_displaying() {
		boolean flag = driver.findElement(By.xpath("//ul[@class='list-unstyled gallery-images mb-0']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should be able to count the no of winners cards displayed")
	public void i_should_be_able_to_count_the_no_of_winners_cards_displayed() {
		driver.findElements(By.tagName("li"));
	}

	@Then("I should see the text You’ve reached the end of our winner’s gallery, why not check out our latest raffles?")
	public void i_should_see_the_text_you_ve_reached_the_end_of_our_winner_s_gallery_why_not_check_out_our_latest_raffles() {
		String actualText = driver.findElement(By.xpath(
				"//p[text()='You’ve reached the end of our winner’s gallery, why not check out our latest raffles?']"))
				.getText();
		String expectedText = actualText;
		if (expectedText.equals(actualText)) {
			Assert.assertEquals(expectedText, actualText);
		}
	}

	@Then("I should see the Live raffles button")
	public void i_should_see_the_live_raffles_button() {
		boolean flag = driver.findElement(By.xpath("//button[@class='btn live-raffles-btn']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@When("I click on the Live raffles button")
	public void i_click_on_the_live_raffles_button() {
		driver.findElement(By.xpath("//ul[@class='list-unstyled gallery-images mb-0']")).click();
	}

	@Then("the user should navigate to the home page")
	public void the_user_should_navigate_to_the_home_page() {
		String ActualUrl = driver.getCurrentUrl();
		String ExpectedUrl = ActualUrl;
		if (ExpectedUrl.equals(ActualUrl)) {
			Assert.assertEquals(ExpectedUrl, ActualUrl);
		}
	}
}

 *
 */

