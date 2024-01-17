/**
 * 
 */
package stepdefinitions;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;

/**
 * @author hp
 *
 *public class InstantRaffleSteps {

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

	@Given("I am on the Instant_Raffle page")
	public void i_am_on_the_instant_raffle_page() {

		driver.get("https://testing.d21ajyco9f10q5.amplifyapp.com/#/");
		driver.findElement(By.xpath("//button[@class='btn play-btn']")).click();
		System.out.println("I am on the Instant_Raffle page");
	}

	@Then("I should see the Instant_Raffle image")
	public void i_should_see_the_instant_raffle_image() {
		boolean flag = driver.findElement(By.xpath("//img[@class='lapImg mb-laptopImgStylings']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Instant_Raffle information section")
	public void i_should_see_the_instant_raffle_information_section() {
		boolean flag = driver.findElement(By.xpath("//div[@class='detailsCardStylings mb-detailsCard']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the About the prize section")
	public void i_should_see_the_about_the_prize_section() {
		boolean flag = driver.findElement(By.xpath("//div[@class='accordionBgStylings']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the how to play image")
	public void i_should_see_the_how_to_play_image() {
		boolean flag = driver.findElement(By.xpath("//img[@class='img-fluid playImgStylings']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Top prizes section")
	public void i_should_see_the_top_prizes_section() {
		boolean flag = driver.findElement(By.xpath("(//span[text()=' Top Prizes'])[1]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the All prizes section")
	public void i_should_see_the_all_prizes_section() {
		boolean flag = driver.findElement(By.xpath("(//h2[text()='All Prizes'])[1]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the About the prize text")
	public void i_should_see_the_about_the_prize_text() {
		boolean flag = driver
				.findElement(By.xpath("//button[@class='accordion-button justify-content-between aboutBtn']"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see about the prize description text")
	public void i_should_see_about_the_prize_description_text() {
		boolean flag = driver.findElement(By.xpath("//div[@class='textPad']")).isDisplayed();
		Assert.assertTrue(flag);
		String text = driver.findElement(By.xpath("//div[@class='textPad']")).getText();
		System.out.println(text);
	}

	@Then("I should see the title of the Instant_Raffle")
	public void i_should_see_the_title_of_the_instant_raffle() {
		String ActualText = driver.findElement(By.xpath("//div[@class='textPad']")).getText();
		String ExpectedText = ActualText;

		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("I should see the entry price text")
	public void i_should_see_the_entry_price_text() {
		String ActualText = driver.findElement(By.xpath("//p[@class='cardPrice mb-cardPriceText']")).getText();
		String ExpectedText = ActualText;

		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("I should see the user icon")
	public void i_should_see_the_user_icon() {
		boolean flag = driver.findElement(By.xpath("//i[@class='far fa-circle-user iconStylings mb-userIcon']"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the text MAX per person along with count of tickets")
	public void i_should_see_the_text_max_per_person_along_with_count_of_tickets() {
		String ActualText = driver.findElement(By.xpath("(//h2[@class='cardText mb-0 mb-cardContent'])[1]")).getText();
		String ExpectedText = ActualText;

		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("I should see the draw date icon")
	public void i_should_see_the_draw_date_icon() {
		boolean flag = driver.findElement(By.xpath("//img[@class='calender-light mb-calenderLight']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the text Draw date:16th June, 2am under the draw date icon")
	public void i_should_see_the_text_draw_date_16th_june_2am_under_the_draw_date_icon() {
		String ActualText = driver.findElement(By.xpath("(//h2[@class='cardText mb-0 mb-cardContent'])[2]")).getText();
		String ExpectedText = ActualText;

		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("I should see the ticket icon")
	public void i_should_see_the_ticket_icon() {
		boolean flag = driver.findElement(By.xpath("//img[@class='ticket-light mb-ticketLight']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the text {int} total tickets")
	public void i_should_see_the_text_total_tickets(Integer int1) {
		String ActualText = driver.findElement(By.xpath("//h2[@class='cardText mb-0 mb-cardContent mb-hide']"))
				.getText();
		String ExpectedText = ActualText;

		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("I should see the progress bar")
	public void i_should_see_the_progress_bar() {
		boolean flag = driver.findElement(By.xpath("//div[@class='progress progress-square instant_progress']"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the percentage bubble along with the percentage text")
	public void i_should_see_the_percentage_bubble_along_with_the_percentage_text() {
		boolean flag = driver.findElement(By.xpath("//div[@class='progress progress-square instant_progress']"))
				.isDisplayed();
		Assert.assertTrue(flag);

		String ActualText = driver.findElement(By.xpath("//div[@class='bubble']")).getText();
		String ExpectedText = ActualText;

		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("I should see the minimum no of tickets count under the progress bar")
	public void i_should_see_the_minimum_no_of_tickets_count_under_the_progress_bar() {
		String ActualText = driver.findElement(By.xpath("//div[@class='col-4 progressBarText']")).getText();
		String ExpectedText = ActualText;

		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("I should see the maximum no of tickets count under the progress bar")
	public void i_should_see_the_maximum_no_of_tickets_count_under_the_progress_bar() {
		String ActualText = driver.findElement(By.xpath("//div[@class='col-4 progressBarText text-end']")).getText();
		String ExpectedText = ActualText;

		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("I should see the count of tickets left till now")
	public void i_should_see_the_count_of_tickets_left_till_now() {
		String ActualText = driver.findElement(By.xpath("//p[@class='termsText mb-termsContent']")).getText();
		String ExpectedText = ActualText;

		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("I should see the text see terms for free postal entry*")
	public void i_should_see_the_text_see_terms_for_free_postal_entry() {
		String ActualText = driver.findElement(By.xpath("//div[@class='col-4 progressBarText text-center']")).getText();
		String ExpectedText = ActualText;

		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("I should see the select entries dropdown")
	public void i_should_see_the_select_entries_dropdown() {
		String ActualText = driver
				.findElement(By.xpath("//button[@class='btn selectBtn dropdown-toggle selectEntriesBtn']")).getText();
		String ExpectedText = ActualText;

		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("I should see the Add tickets to cart button")
	public void i_should_see_the_add_tickets_to_cart_button() {
		boolean flag = driver.findElement(By.xpath("//button[@class='btn addBtn']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the trust pilot image")
	public void i_should_see_the_trust_pilot_image() {
		boolean flag = driver.findElement(By.xpath("(//img[@class='excellent-img'])[2]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@When("I click on the select entries dropdown")
	public void i_click_on_the_select_entries_dropdown() {
		driver.findElement(By.xpath("//button[@class='btn selectBtn dropdown-toggle selectEntriesBtn']")).click();
	}

	@Then("I should see the dropdown menu list")
	public void i_should_see_the_dropdown_menu_list() {
		boolean flag = driver.findElement(By.xpath("//ul[@class='dropdown-menu w-100 dropdownList show']"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@When("I click on the one of the option from the dropdowm menu list")
	public void i_click_on_the_one_of_the_option_from_the_dropdowm_menu_list() {
		boolean flag = driver.findElement(By.xpath("(//a[@class='dropdown-item dropdownItemStylings'])[1]"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the number which i have selected from the dropdown menu list on the dropdown")
	public void i_should_see_the_number_which_i_have_selected_from_the_dropdown_menu_list_on_the_dropdown() {

		String ActualText = driver.findElement(By.xpath("(//a[@class='dropdown-item dropdownItemStylings'])[1]"))
				.getText();
		String ExpectedText = ActualText;

		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("I should see the text Add tickets to cart along with the price of the tickets which i have selected from the dropdown")
	public void i_should_see_the_text_add_tickets_to_cart_along_with_the_price_of_the_tickets_which_i_have_selected_from_the_dropdown() {
		String ActualText = driver.findElement(By.xpath("//button[@class='btn addBtn']")).getText();
		String ExpectedText = ActualText;

		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@When("I click on the trust pilot image")
	public void i_click_on_the_trust_pilot_image() {
		WebElement ele = driver.findElement(By.xpath("(//img[@class='excellent-img'])[2]"));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);
	}

	@Then("user should navigate to the respective trust pilot website page")
	public void user_should_navigate_to_the_respective_trust_pilot_website_page() {
		String ActualUrl = driver.getCurrentUrl();
		String ExpectedUrl = "https://www.trustpilot.com/review/raffolux.com";
		if (ActualUrl.equals(ExpectedUrl)) {
			Assert.assertEquals(ExpectedUrl, ActualUrl);
		}
	}

	@Then("I should see the winner cup symbol beside the top prizes text")
	public void i_should_see_the_winner_cup_symbol_beside_the_top_prizes_text() {
		boolean flag = driver.findElement(By.xpath("(//img[@class='trophyIcon'])[1]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the text Top prizes")
	public void i_should_see_the_text_top_prizes() {

		String ActualText = driver.findElement(By.xpath("(//span[text()=' Top Prizes'])[1]")).getText();
		String ExpectedText = ActualText;

		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("I should see the list of Top instant prize cards")
	public void i_should_see_the_list_of_top_instant_prize_cards() {
		boolean flag = driver.findElement(By.xpath("(//ul[@class='m-0 p-0 top_all_prizes'])[1]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should be able to count the list of Top prizes cards")
	public void i_should_be_able_to_count_the_list_of_top_prizes_cards() {
		List<WebElement> prizecards = driver.findElements(By.tagName("li"));
		int count = prizecards.size();
		System.out.println(count);
	}

	@Then("I should be able to see the total and available no of instant prizes in the Top prizes section")
	public void i_should_be_able_to_see_the_total_and_available_no_of_instant_prizes_in_the_top_prizes_section() {
		String ActualText = driver
				.findElement(By.xpath("(//span[@class='d-flex ticketsAvailNum align-items-center'])[1]")).getText();
		String ExpectedText = ActualText;

		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("I should see the text All prizes")
	public void i_should_see_the_text_all_prizes() {
		boolean flag = driver.findElement(By.xpath("(//h2[@class='topPrizesHeading mb-0'])[2]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the list of All instant prize cards")
	public void i_should_see_the_list_of_all_instant_prize_cards() {
		boolean flag = driver.findElement(By.xpath("(//ul[@class='m-0 p-0 top_all_prizes'])[1]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should be able to count the list of All prizes cards")
	public void i_should_be_able_to_count_the_list_of_all_prizes_cards() {
		List<WebElement> prizecards = driver.findElements(By.tagName("li"));
		int count = prizecards.size();
		System.out.println(count);
	}

	@Then("I should be able to see the total and available no of instant prizes in the All prizes section")
	public void i_should_be_able_to_see_the_total_and_available_no_of_instant_prizes_in_the_all_prizes_section() {
		String ActualText = driver
				.findElement(By.xpath("(//span[@class='d-flex ticketsAvailNum align-items-center'])[2]")).getText();
		String ExpectedText = ActualText;

		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("I should see the Search by item or ticket number… search field")
	public void i_should_see_the_search_by_item_or_ticket_number_search_field() {
		boolean flag = driver.findElement(By.xpath("//div[@class='flex-nowrap searchBar']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the search icon inside the Search by item or ticket number… search field")
	public void i_should_see_the_search_icon_inside_the_search_by_item_or_ticket_number_search_field() {
		boolean flag = driver.findElement(By.xpath("(//i[@class='fa-solid fa-magnifying-glass searchIcon'])[1]"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the text Search by item or ticket number… inside the text field")
	public void i_should_see_the_text_search_by_item_or_ticket_number_inside_the_text_field() {
		String ActualText = driver.findElement(By.xpath("(//input[@class='form-control searchItem'])[1]")).getText();
		String ExpectedText = ActualText;

		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("I should see Value low to high and high to low dropdown")
	public void i_should_see_value_low_to_high_and_high_to_low_dropdown() {
		boolean flag = driver.findElement(By.xpath("//select[@class='form-select selectList']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@When("I click on the respective dropdown")
	public void i_click_on_the_respective_dropdown() {
		WebElement ele = driver.findElement(By.xpath("//select[@class='form-select selectList']"));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);

	}

	@Then("user should be able to see the the list of options which are Value low to high and value high to low")
	public void user_should_be_able_to_see_the_the_list_of_options_which_are_value_low_to_high_and_value_high_to_low() {
		boolean flag = driver.findElement(By.xpath("(//option[@class='selectedOption valueTextStylings'])[1]"))
				.isDisplayed();
		Assert.assertTrue(flag);

		boolean flag1 = driver.findElement(By.xpath("(//option[@class='selectedOption valueTextStylings'])[2]"))
				.isDisplayed();
		Assert.assertTrue(flag1);
	}

	@When("I select value low to high option from the dropdown")
	public void i_select_value_low_to_high_option_from_the_dropdown() {

		WebElement element = driver.findElement(By.xpath("//select[@class='form-select selectList']"));

		Select s = new Select(element);
		s.selectByIndex(0);
	}

	@Then("I should see the instant prize cards displaying in the increasing order")
	public void i_should_see_the_instant_prize_cards_displaying_in_the_increasing_order() {

		boolean flag = driver
				.findElement(By
						.xpath("//*[@id=\"app\"]/div/div/main/div/div/div[7]/div[1]/div[3]/div[2]/div/ul/li[1]/div/p"))
				.isDisplayed();
		Assert.assertTrue(flag);

		String text = driver
				.findElement(By
						.xpath("//*[@id=\"app\"]/div/div/main/div/div/div[7]/div[1]/div[3]/div[2]/div/ul/li[1]/div/p"))
				.getText();
		System.out.println(text);
	}

	@When("I select value high to low option from the dropdown")
	public void i_select_value_high_to_low_option_from_the_dropdown() {
		WebElement element = driver.findElement(By.xpath("//select[@class='form-select selectList']"));

		Select s = new Select(element);
		s.selectByIndex(1);
	}

	@Then("I should see the instant prize cards displaying in the decreasing order")
	public void i_should_see_the_instant_prize_cards_displaying_in_the_decreasing_order() {

		boolean flag = driver
				.findElement(By
						.xpath("//*[@id=\"app\"]/div/div/main/div/div/div[7]/div[1]/div[3]/div[2]/div/ul/li[1]/div/p"))
				.isDisplayed();
		Assert.assertTrue(flag);

		String text = driver
				.findElement(By
						.xpath("//*[@id=\"app\"]/div/div/main/div/div/div[7]/div[1]/div[3]/div[2]/div/ul/li[1]/div/p"))
				.getText();
		System.out.println(text);
	}
}

 *
 */

