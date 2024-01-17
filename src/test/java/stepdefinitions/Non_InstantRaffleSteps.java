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
 *
 *public class Non_InstantRaffleSteps {

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

	@Given("I am on the Non_Instant_Raffle page")
	public void i_am_on_the_non_instant_raffle_page() {
		driver.get("(//button[@class='btn play-btn'])[3]");
		driver.findElement(By.xpath("//button[@class='btn play-btn']")).click();
		System.out.println("I am on the Non_Instant_Raffle page");
	}

	@Then("I should see the Non_Instant_Raffle image")
	public void i_should_see_the_non_instant_raffle_image() {
		boolean flag = driver.findElement(By.xpath("//img[@class='lapImg mb-laptopImgStylings']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Non_Instant_Raffle information section")
	public void i_should_see_the_non_instant_raffle_information_section() {
		boolean flag = driver.findElement(By.xpath("//div[@class='detailsCardStylings mb-detailsCard']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Non_Instant_Raffle About the prize section")
	public void i_should_see_the_non_instant_raffle_about_the_prize_section() {
		boolean flag = driver.findElement(By.xpath("(//div[@class='accordion mb-hide'])[1]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Non_Instant_Raffle About the prize text")
	public void i_should_see_the_non_instant_raffle_about_the_prize_text() {
		boolean flag = driver
				.findElement(By.xpath("//button[@class='accordion-button justify-content-between aboutBtn']"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see Non_Instant_Raffle about the prize description text")
	public void i_should_see_non_instant_raffle_about_the_prize_description_text() {
		boolean flag = driver.findElement(By.xpath("(//div[@class='accordion mb-hide'])[2]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Non_Instant_Raffle prize details and specifications section")
	public void i_should_see_the_non_instant_raffle_prize_details_and_specifications_section() {
		boolean flag = driver.findElement(By.xpath("(//div[@class='accordion mb-hide'])[1]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Non_Instant_Raffle prize details and specifications text")
	public void i_should_see_the_non_instant_raffle_prize_details_and_specifications_text() {
		boolean flag = driver.findElement(By.xpath(
				"(//button[@class='accordion-button justify-content-between aboutBtn detailsBtn prizeDetailsBtn'])[1]"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Non_Instant_Raffle prize details and specifications description text")
	public void i_should_see_the_non_instant_raffle_prize_details_and_specifications_description_text() {
		boolean flag = driver.findElement(By.xpath("(//div[@class='accordion-collapse collapse show'])[2]"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Non_Instant_Raffle Raffle terms section")
	public void i_should_see_the_non_instant_raffle_raffle_terms_section() {
		boolean flag = driver.findElement(By.xpath("(//div[@class='accordion mb-hide'])[3]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Non_Instant_Raffle Raffle terms text")
	public void i_should_see_the_non_instant_raffle_raffle_terms_text() {
		boolean flag = driver.findElement(By.xpath(
				"(//button[@class='accordion-button justify-content-between aboutBtn detailsBtn prizeDetailsBtn'])[2]"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Non_Instant_Raffle Raffle terms prize details and specifications description text")
	public void i_should_see_the_non_instant_raffle_raffle_terms_prize_details_and_specifications_description_text() {
		boolean flag = driver.findElement(By.xpath("(//div[@class='accordion-collapse collapse show'])[3]"))
				.isDisplayed();
		Assert.assertTrue(flag);
		System.out.println("I should see the Non_Instant_Raffle Raffle terms description text");
	}

	@Then("I should see the title of the Non_Instant_Raffle")
	public void i_should_see_the_non_instant_raffle_title_of_the_non_instant_raffle() {
		boolean flag = driver.findElement(By.xpath("//h4[@class='cardHeading mb-0 mb-cardHeadingText']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Non_Instant_Raffle entry price text")
	public void i_should_see_the_non_instant_raffle_entry_price_text() {
		boolean flag = driver.findElement(By.xpath("//p[@class='cardPrice mb-cardPriceText']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Non_Instant_Raffle user icon")
	public void i_should_see_the_non_instant_raffle_user_icon() {
		boolean flag = driver.findElement(By.xpath("//i[@class='far fa-circle-user iconStylings mb-userIcon']"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the text Non_Instant_Raffle MAX per person along with count of tickets")
	public void i_should_see_the_text_non_instant_raffle_max_per_person_along_with_count_of_tickets() {
		String ActualText = driver.findElement(By.xpath("(//h2[@class='cardText mb-0 mb-cardContent'])[1]")).getText();
		String ExpectedText = ActualText;

		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("I should see the draw date icon of Non_Instant_Raffle")
	public void i_should_see_the_draw_date_icon_of_non_instant_raffle() {
		boolean flag = driver.findElement(By.xpath("//img[@class='calender-light mb-calenderLight']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the text Draw date:16th June, 2am under the draw date icon of Non_Instant_Raffle")
	public void i_should_see_the_text_draw_date_16th_june_2am_under_the_draw_date_icon_of_non_instant_raffle() {
		String ActualText = driver.findElement(By.xpath("(//h2[@class='cardText mb-0 mb-cardContent'])[2]")).getText();
		String ExpectedText = ActualText;

		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("I should see the ticket icon of Non_Instant_Raffle")
	public void i_should_see_the_ticket_icon_of_non_instant_raffle() {
		boolean flag = driver.findElement(By.xpath("//img[@class='ticket-light mb-ticketLight']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the text {int} total tickets of Non_Instant_Raffle")
	public void i_should_see_the_text_total_tickets_of_non_instant_raffle(Integer int1) {
		boolean flag = driver.findElement(By.xpath("//h2[@class='cardText mb-0 mb-cardContent mb-hide']"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the progress bar of Non_Instant_Raffle")
	public void i_should_see_the_progress_bar_of_non_instant_raffle() {
		boolean flag = driver.findElement(By.xpath("//div[@class='progress progress-square instant_progress']"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the percentage bubble along with the percentage text of Non_Instant_Raffle")
	public void i_should_see_the_percentage_bubble_along_with_the_percentage_text_of_non_instant_raffle() {
		boolean flag = driver.findElement(By.xpath("//div[@class='bubble']")).isDisplayed();
		Assert.assertTrue(flag);

		String ActualText = driver.findElement(By.xpath("//div[@class='bubble']")).getText();
		String ExpectedText = ActualText;

		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("I should see the minimum no of tickets count under the progress bar of Non_Instant_Raffle")
	public void i_should_see_the_minimum_no_of_tickets_count_under_the_progress_bar_of_non_instant_raffle() {
		String ActualText = driver.findElement(By.xpath("//div[@class='col-4 progressBarText']")).getText();
		String ExpectedText = ActualText;

		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("I should see the maximum no of tickets count under the progress bar of Non_Instant_Raffle")
	public void i_should_see_the_maximum_no_of_tickets_count_under_the_progress_bar_of_non_instant_raffle() {
		String ActualText = driver.findElement(By.xpath("//div[@class='col-4 progressBarText text-end']")).getText();
		String ExpectedText = ActualText;

		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("I should see the count of tickets left till now of Non_Instant_Raffle")
	public void i_should_see_the_count_of_tickets_left_till_now_of_non_instant_raffle() {
		String ActualText = driver.findElement(By.xpath("//div[@class='col-4 progressBarText text-center']")).getText();
		String ExpectedText = ActualText;

		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("I should see the text see terms for free postal entry* of Non_Instant_Raffle")
	public void i_should_see_the_text_see_terms_for_free_postal_entry_of_non_instant_raffle() {
		String ActualText = driver.findElement(By.xpath("//p[@class='termsText mb-termsContent']")).getText();
		String ExpectedText = ActualText;

		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("I should see the select entries dropdown of Non_Instant_Raffle")
	public void i_should_see_the_select_entries_dropdown_of_non_instant_raffle() {
		boolean flag = driver.findElement(By.xpath("//button[@class='btn selectBtn dropdown-toggle selectEntriesBtn']"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Add tickets to cart button of Non_Instant_Raffle")
	public void i_should_see_the_add_tickets_to_cart_button_of_non_instant_raffle() {
		boolean flag = driver.findElement(By.xpath("//button[@class='btn addBtn']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the trust pilot image of Non_Instant_Raffle")
	public void i_should_see_the_trust_pilot_image_of_non_instant_raffle() {
		boolean flag = driver.findElement(By.xpath("(//img[@class='excellent-img'])[2]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@When("I click on the select entries dropdown of Non_Instant_Raffle")
	public void i_click_on_the_select_entries_dropdown_of_non_instant_raffle() {
		WebElement ele = driver
				.findElement(By.xpath("//button[@class='btn selectBtn dropdown-toggle selectEntriesBtn']"));
		ele.click();
	}

	@Then("I should see the dropdown menu list of Non_Instant_Raffle")
	public void i_should_see_the_dropdown_menu_list_of_non_instant_raffle() {
		boolean flag = driver.findElement(By.xpath("//ul[@class='dropdown-menu w-100 dropdownList show']"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@When("I click on the one of the option from the dropdowm menu list of Non_Instant_Raffle")
	public void i_click_on_the_one_of_the_option_from_the_dropdowm_menu_list_of_non_instant_raffle() {
		driver.findElement(By.xpath("(//a[@class='dropdown-item dropdownItemStylings'])[2]")).click();
	}

	@Then("I should see the number which i have selected from the dropdown menu list on the dropdown of Non_Instant_Raffle")
	public void i_should_see_the_number_which_i_have_selected_from_the_dropdown_menu_list_on_the_dropdown_of_non_instant_raffle() {
		boolean flag = driver.findElement(By.xpath("//button[@class='btn selectBtn dropdown-toggle selectEntriesBtn']"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the text Add tickets to cart along with the price of the tickets which i have selected from the dropdown of Non_Instant_Raffle")
	public void i_should_see_the_text_add_tickets_to_cart_along_with_the_price_of_the_tickets_which_i_have_selected_from_the_dropdown_of_non_instant_raffle() {
		String ActualText = driver.findElement(By.xpath("//button[@class='btn addBtn']")).getText();
		String ExpectedText = ActualText;

		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@When("I click on the trust pilot image of Non_Instant_Raffle")
	public void i_click_on_the_trust_pilot_image_of_non_instant_raffle() {
		driver.findElement(By.xpath("(//img[@class='excellent-img'])[2]")).click();
	}

	@Then("user should navigate to the respective trust pilot website page of Non_Instant_Raffle")
	public void user_should_navigate_to_the_respective_trust_pilot_website_page_of_non_instant_raffle() {
		String ActualUrl = driver.findElement(By.xpath("//button[@class='btn addBtn']")).getText();
		String ExpectedUrl = ActualUrl;

		if (ActualUrl.equals(ExpectedUrl)) {
			Assert.assertEquals(ExpectedUrl, ActualUrl);
		}
	}

	@Then("I should see the how instant draw works information text of Non_Instant_Raffle")
	public void i_should_see_the_how_instant_draw_works_information_text_of_non_instant_raffle() {
		String ActualText = driver.findElement(By.xpath("//div[@class='raffle_text']")).getText();
		String ExpectedText = ActualText;

		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("I should see the information text about the competition")
	public void i_should_see_the_information_text_about_the_competition() {
		String ActualText = driver.findElement(By.xpath("//div[@class='raffle_text']")).getText();
		String ExpectedText = ActualText;

		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}
	
	
}

 *
 */
