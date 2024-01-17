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
import org.openqa.selenium.interactions.Actions;
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
 *public class HomepageSteps {
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

	@Given("I am on the home page")
	public void i_am_on_the_home_page() {
		driver.get("https://testing.d21ajyco9f10q5.amplifyapp.com/#/");
		System.out.println("I am on the home page");
	}

	@Then("I should see the raffolux logo")
	public void i_should_see_the_raffolux_logo() {
		boolean flag = driver.findElement(By.xpath("//*[@id=\"navbar-sec\"]/div[1]/a[1]/img")).isDisplayed();
		Assert.assertTrue(flag);
		;
	}

	@Then("I should see the login button")
	public void i_should_see_the_login_button() {
		boolean flag = driver.findElement(By.xpath("//button[@class='btn login-btn']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Sign up button")
	public void i_should_see_the_sign_up_button() {
		boolean flag = driver.findElement(By.xpath("(//button[@class='btn signUp-btn'])[1]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the horizontal banner section")
	public void i_should_see_the_horizontal_banner_section() {
		boolean flag = driver.findElement(By.xpath("//div[@class='banner_bg']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Sign up bonus card")
	public void i_should_see_the_sign_up_bonus_card() {
		boolean flag = driver.findElement(By.xpath("//div[@class='col-md-4 left-section']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Horizontal raffle corosel")
	public void i_should_see_the_horizontal_raffle_corosel() {

		try {
			boolean flag = driver.findElement(By.xpath("//div[@class='v-window__container']")).isDisplayed();
			Assert.assertFalse(flag);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Then("I should see the Winners information section")
	public void i_should_see_the_winners_information_section() {
		boolean flag = driver
				.findElement(
						By.xpath("//div[@class='row winners-details align-items-center m-0 justify-content-between']"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the supported payment options section")
	public void i_should_see_the_supported_payment_options_section() {
		boolean flag = driver.findElement(By.xpath("//div[@class='row payment-sec align-items-center me-0']"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Flash cash section")
	public void i_should_see_the_flash_cash_section() {
		boolean flag = driver.findElement(By.xpath("//div[@class='flash-cards']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Live Cometitions section")
	public void i_should_see_the_live_cometitions_section() {
		boolean flag = driver.findElement(By.xpath("(//div[@class='page-content-wrapper'])[5]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the signup bonus text")
	public void i_should_see_the_signup_bonus_text() {
		boolean flag = driver.findElement(By.xpath("//button[@class='bonus-element btn']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the join the uks fastest growing raffle site text")
	public void i_should_see_the_join_the_uks_fastest_growing_raffle_site_text() {
		boolean flag = driver.findElement(By.xpath("//h2[@class='mainHdng']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Claim your VIP sign up bonus when you create an account today text")
	public void i_should_see_the_claim_your_vip_sign_up_bonus_when_you_create_an_account_today_text() {
		boolean flag = driver.findElement(By.xpath("//h5[@class='subTxt']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Free {int} pounds Cashback text")
	public void i_should_see_the_free_pounds_cashback_text(Integer int1) {
		boolean flag = driver.findElement(By.xpath("//h3[text()='FREE £20 CASHBACK']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Double points text")
	public void i_should_see_the_double_points_text() {
		boolean flag = driver.findElement(By.xpath("//h3[text()='DOUBLE POINTS']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the sign up button on Signup bonus card")
	public void i_should_see_the_sign_up_button_on_signup_bonus_card() {
		try {
			boolean flag = driver.findElement(By.xpath("//button[@class='btn left-sec-btn']")).isDisplayed();
			Assert.assertTrue(flag);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(
					" ================================== Exception Alert ========================================= ");
		}
	}

	@When("I click on the sign up button")
	public void i_click_on_the_sign_up_button() {

		try {
			WebElement ele = driver.findElement(By.xpath("//button[@class='btn left-sec-btn']"));

			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", ele);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(
					" ================================== Exception Alert ========================================= ");
		}
	}

	@Then("user should navigate to the sign up page")
	public void user_should_navigate_to_the_sign_up_page() {

		try {
			boolean flag = driver.findElement(By.xpath("(//button[@class='nav-link active'])[1]")).isDisplayed();
			Assert.assertTrue(flag);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(
					" ================================== Exception Alert ========================================= ");
		}
	}

	@Then("I should see the payment accepted text along with the acceptable cards")
	public void i_should_see_the_payment_accepted_text_along_with_the_acceptable_cards() {
		boolean flag = driver.findElement(By.xpath("//span[@class='d-flex align-items-center gap-1']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Never played before? Check out our latest text along with the signup offers button")
	public void i_should_see_the_never_played_before_check_out_our_latest_text_along_with_the_signup_offers_button() {
		boolean flag = driver
				.findElement(By.xpath("(//span[@class='d-flex align-items-center justify-content-center'])[1]"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the trust_pilot image")
	public void i_should_see_the_trust_pilot_image() {
		boolean flag = driver.findElement(By.xpath("//*[@id=\"offers-sec\"]/div[3]/img")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Mega Jockpot text along with the crown symbol")
	public void i_should_see_the_mega_jockpot_text_along_with_the_crown_symbol() {
		try {
			boolean flag = driver.findElement(By.xpath("(//h4[text()='MEGA JACKPOT'])[1]")).isDisplayed();
			boolean flag1 = driver.findElement(By.xpath("(//img[@class='jackpot_img'])[1]")).isDisplayed();
			Assert.assertTrue(flag);
			Assert.assertTrue(flag1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(
					" ================================== Exception Alert ========================================= ");
		}
	}

	@Then("I should see the title of respective raffle")
	public void i_should_see_the_title_of_respective_raffle() {
		String ActualText = driver.findElement(By.xpath("//h1[text()='Summer £101k Treasure Hunt']")).getText();
		String ExpectedText = "Summer £101k Treasure Hunt";
		Assert.assertEquals(ExpectedText, ActualText);
	}

	@Then("I should see the entry price of the respective raffle")
	public void i_should_see_the_entry_price_of_the_respective_raffle() {
		String ActualText = driver.findElement(By.xpath("//h3[text()='£2.99']")).getText();
		String ExpectedText = "£2.99";
		Assert.assertEquals(ExpectedText, ActualText);
	}

	@Then("I should see the ticket sold progress bar")
	public void i_should_see_the_ticket_sold_progress_bar() {
		boolean flag = driver.findElement(By.xpath("(//div[@class='progress progress-square'])[4]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the x no of tickets sold text")
	public void i_should_see_the_x_no_of_tickets_sold_text() {
		try {
			String ActualText = driver.findElement(By.xpath("//h5[text()='6950 tickets sold']")).getText();
			String ExpectedText = "6950 tickets sold";
			Assert.assertEquals(ExpectedText, ActualText);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Then("I should see the play now button")
	public void i_should_see_the_play_now_button() {
		boolean flag = driver.findElement(By.xpath("//button[text()=' PLAY NOW ']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@When("I hover over the raffle on the carosel")
	public void i_hover_over_the_raffle_on_the_carosel() {
		WebElement element = driver.findElement(By.xpath("//button[text()=' PLAY NOW ']"));
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}

	@Then("I should see the arrow symbols at both left and right side on the raffle")
	public void i_should_see_the_arrow_symbols_at_both_left_and_right_side_on_the_raffle() {
		boolean flag = driver
				.findElement(By.xpath(
						"//i[@class='mdi-chevron-left mdi v-icon notranslate v-theme--light v-icon--size-default']"))
				.isDisplayed();
		boolean flag1 = driver
				.findElement(By.xpath(
						"//i[@class='mdi-chevron-right mdi v-icon notranslate v-theme--light v-icon--size-default']"))
				.isDisplayed();
		if (flag == flag1) {
			Assert.assertTrue(flag);
		}
	}

	@When("I click on the left arrow symbol")
	public void i_click_on_the_left_arrow_symbol() {
		driver.findElement(
				By.xpath("//i[@class='mdi-chevron-left mdi v-icon notranslate v-theme--light v-icon--size-default']"))
				.click();
	}

	@Then("I should see the remaining prev raffles")
	public void i_should_see_the_remaining_prev_raffles() throws Exception {
		CaptureScreenshot(driver);
	}

	@When("I click on the right arrow symbol")
	public void i_click_on_the_right_arrow_symbol() {
		driver.findElement(
				By.xpath("//i[@class='mdi-chevron-right mdi v-icon notranslate v-theme--light v-icon--size-default']"))
				.click();
	}

	@Then("I should see the remaining next raffles")
	public void i_should_see_the_remaining_next_raffles() {
		try {
			CaptureScreenshot(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("I should see the winner information section")
	public void i_should_see_the_winner_information_section() {
		boolean flag = driver
				.findElement(
						By.xpath("//div[@class='row winners-details align-items-center m-0 justify-content-between']"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the won in prizes so far text along with the count of the amount that has been won till now by the users")
	public void i_should_see_the_won_in_prizes_so_far_text_along_with_the_count_of_the_amount_that_has_been_won_till_now_by_the_users() {
		String Actualtext = driver.findElement(By.xpath("//h3[text()='won in prizes so far']")).getText();
		String Expectedtext = "won in prizes so far";
		String Actualtext1 = driver.findElement(By.xpath("//h3[text()='won in prizes so far']")).getText();
		String Expectedtext1 = " £9.61 Million ";
		if (Actualtext == Expectedtext) {
			Assert.assertEquals(Expectedtext, Actualtext);
			Assert.assertEquals(Expectedtext1, Actualtext1);
		}
	}

	@Then("I should see the over {int} winners and counting text")
	public void i_should_see_the_over_winners_and_counting_text(Integer int1) {
		String Actualtext = driver.findElement(By.xpath("//h3[text()='Over 8,000 winners and counting']")).getText();
		String Expectedtext = "Over 8,000 winners and counting";
		if (Actualtext == Expectedtext) {
			Assert.assertEquals(Expectedtext, Actualtext);
		}
	}

	@Then("I should see the winner cup symbol beside the over {int} winners and counting text")
	public void i_should_see_the_winner_cup_symbol_beside_the_over_winners_and_counting_text(Integer int1) {
		boolean flag = driver.findElement(By.xpath("//img[@class='desk-trophy-img']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Guaranteed winners everyday text")
	public void i_should_see_the_guaranteed_winners_everyday_text() {
		String Actualtext = driver.findElement(By.xpath("//h3[text()='Guaranteed winners every day']")).getText();
		String Expectedtext = "Guaranteed winners every day";
		if (Actualtext == Expectedtext) {
			Assert.assertEquals(Expectedtext, Actualtext);
		}
	}

	@Then("I should see the gift box symbol beside the Guaranteed winners everyday text")
	public void i_should_see_the_gift_box_symbol_beside_the_guaranteed_winners_everyday_text() {
		boolean flag = driver.findElement(By.xpath("//img[@class='desk-gift-img']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the over 500k donated to UK charities text")
	public void i_should_see_the_over_500k_donated_to_uk_charities_text() {
		String Actualtext = driver.findElement(By.xpath("//h3[text()='Over £500k donated to UK charities']")).getText();
		String Expectedtext = "Over £500k donated to UK charities";
		if (Actualtext == Expectedtext) {
			Assert.assertEquals(Expectedtext, Actualtext);
		}
	}

	@Then("I should see the charity symbol beside the over 500k donated to UK charities text")
	public void i_should_see_the_charity_symbol_beside_the_over_500k_donated_to_uk_charities_text() {
		boolean flag = driver.findElement(By.xpath("//img[@class='desk-ribbon-img']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the instant prize claims & fast payouts text")
	public void i_should_see_the_instant_prize_claims_fast_payouts_text() {
		String Actualtext = driver.findElement(By.xpath("//h3[text()='Instant prize claims & fast payouts']"))
				.getText();
		String Expectedtext = "Instant prize claims & fast payouts";
		if (Actualtext == Expectedtext) {
			Assert.assertEquals(Expectedtext, Actualtext);
		}
	}

	@Then("I should see the instant prize claims & fast payouts symbol")
	public void i_should_see_the_instant_prize_claims_fast_payouts_symbol() {
		boolean flag = driver.findElement(By.xpath("//img[@class='desk-bolt-img']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the supported payment card options section")
	public void i_should_see_the_supported_payment_card_options_section() {
		boolean flag = driver.findElement(By.xpath("//div[@class='row payment-sec align-items-center me-0']"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the supported payment options text")
	public void i_should_see_the_supported_payment_options_text() {
		String Actualtext = driver.findElement(By.xpath("//div[@class='row payment-sec align-items-center me-0']"))
				.getText();
		String Exepctedtext = "Supported payment options";
		if (Actualtext.equals(Exepctedtext)) {
			Assert.assertEquals(Exepctedtext, Actualtext);
		}
	}

	@Then("I should see the different available card options")
	public void i_should_see_the_different_available_card_options() {
		boolean flag = driver.findElement(By.xpath("(//span[@class='d-flex justify-content-center'])[1]"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Sign_Up button on supported payment options section")
	public void i_should_see_the_sign_up_button_on_supported_payment_options_section() {
		boolean flag = driver.findElement(By.xpath("(//button[@class='btn signUp-btn'])[2]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@When("I click on the Sign_Up button on supported payment options section")
	public void i_click_on_the_sign_up_button_on_supported_payment_options_section() {

		WebElement ele = driver.findElement(By.xpath("(//button[@class='btn signUp-btn'])[2]"));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);
		System.out.println("Successfully clicked on the signup button");
	}

	@Then("I should navigate to the Sign_Up page on supported payment options section")
	public void i_should_navigate_to_the_sign_up_page_on_supported_payment_options_section() {
		boolean flag = driver
				.findElement(By.xpath("//h1[text()=' Create your Raffolux account and join the action! ']"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Live Cometitions text")
	public void i_should_see_the_live_cometitions_text() {
		String ActualText = driver.findElement(By.xpath("//h2[text()='LIVE COMPETITIONS']")).getText();
		String ExpectedText = "";
		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("I should see the count of active raffles box section along with the dot and count of active raffles")
	public void i_should_see_the_count_of_active_raffles_box_section_along_with_the_dot_and_count_of_active_raffles() {
		boolean flag = driver.findElement(By.xpath("//span[@class='d-flex raffle-sec align-items-center']"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the count of ended raffles box section along with the dot and count of ended raffles")
	public void i_should_see_the_count_of_ended_raffles_box_section_along_with_the_dot_and_count_of_ended_raffles() {
		boolean flag = driver.findElement(By.xpath("//span[@class='d-flex raffle-sec align-items-center me-sm-2']"))
				.isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the one of the raffle from the list of raffles")
	public void i_should_see_the_one_of_the_raffle_from_the_list_of_raffles() {
		boolean flag = driver.findElement(By.xpath("(//img[@class='tab-cards'])[1]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the category tablist section")
	public void i_should_see_the_category_tablist_section() {
		boolean flag = driver.findElement(By.xpath("//ul[@class='nav nav-pills justify-content-end']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the All category text")
	public void i_should_see_the_all_category_text() {
		boolean flag = driver.findElement(By.xpath("//button[text()=' All ']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Cash category text")
	public void i_should_see_the_cash_category_text() {
		boolean flag = driver.findElement(By.xpath("//button[text()=' Cash ']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Electronic category text")
	public void i_should_see_the_electronic_category_text() {
		boolean flag = driver.findElement(By.xpath("//button[text()=' Electronic ']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Holiday category text")
	public void i_should_see_the_holiday_category_text() {
		boolean flag = driver.findElement(By.xpath("//button[text()=' Holiday ']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("I should see the Others category text")
	public void i_should_see_the_others_category_text() {
		boolean flag = driver.findElement(By.xpath("//button[text()=' Others ']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@When("I click on the All category tab")
	public void i_click_on_the_all_category_tab() {

	}

	@Then("I should see the")
	public void i_should_see_the() {

	}
}

 *
 *
 */
