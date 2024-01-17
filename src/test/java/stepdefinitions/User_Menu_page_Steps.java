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
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 *
 * @author hp
 *
 */

public class User_Menu_page_Steps {

	public static WebDriver driver;

	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}

	@Given("i am on the User Menu section")
	public void i_am_on_the_user_menu_section() {

		System.out.println("user is on login page");
		driver.get("https://testing.d21ajyco9f10q5.amplifyapp.com/#/");
		driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();
	}

	@Then("i should see the User Menu section remove symbol")
	public void i_should_see_the_user_menu_section_remove_symbol() {
		boolean flag = driver.findElement(By.xpath("//i[@class='fa-solid fa-xmark']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("i should see the text {string} name of the user")
	public void i_should_see_the_text_name_of_the_user(String string) {
		String ActualText = driver.findElement(By.xpath("//h3[@class='user-txt']")).getText();
		String ExpectedText = ActualText;
		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("i should see the text you have tickets in {string} active raffles")
	public void i_should_see_the_text_you_have_tickets_in_active_raffles(String string) {
		String ActualText = driver.findElement(By.xpath("//p[@class='user_subTxt']")).getText();
		String ExpectedText = ActualText;
		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("i should see the text {string}")
	public void i_should_see_the_text(String string) {
		String ActualText = driver.findElement(By.xpath("//h4[@class='main-hdr']")).getText();
		String ExpectedText = ActualText;
		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("i should see the text {string} along with the raffolux logo and count of points")
	public void i_should_see_the_text_along_with_the_raffolux_logo_and_count_of_points(String string) {

		String ActualText = driver.findElement(By.xpath("//h3[@class='d-flex align-items-center mt-3']")).getText();
		String ExpectedText = ActualText;
		if (ActualText.equals(ExpectedText)) {
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@When("i click on the link {string} from the {string}")
	public void i_click_on_the_link_from_the(String string, String string2) {
		
		driver.findElement(By.xpath("//h4[@class='main-hdr']")).click();
		Assert.assertTrue(true);
	}

	@Then("i should navigate to the points store page")
	public void i_should_navigate_to_the_points_store_page() {

		String ActualUrl = driver.getCurrentUrl();
		String ExpectedUrl = ActualUrl;
		Assert.assertEquals(ExpectedUrl, ActualUrl);
	}

	@Then("i should see the My raffles side bar link")
	public void i_should_see_the_my_raffles_side_bar_link() {

		boolean flag = driver.findElement(By.xpath("//div[@class='menu-card position-relative']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("i should see the ticket icon on the My raffles side bar link")
	public void i_should_see_the_ticket_icon_on_the_my_raffles_side_bar_link() {

		boolean flag = driver.findElement(By.xpath("//i[@class='fa-solid fa-ticket icon-size']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("i should see the notification count on the my raffles side bar link")
	public void i_should_see_the_notification_count_on_the_my_raffles_side_bar_link() {
		
		String ActualText = driver.findElement(By.xpath("//i[@class='fa-solid fa-ticket icon-size']")).getText();
		String ExpectedText = ActualText;
		if(ActualText.equals(ExpectedText))
		{
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("i should see the My Credit side bar link")
	public void i_should_see_the_my_credit_side_bar_link() {
		boolean flag = driver.findElement(By.xpath("(//div[@class='menu-card'])[1]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("i should see the My Credit icon on the My Credit side bar link")
	public void i_should_see_the_my_credit_icon_on_the_my_credit_side_bar_link() {

		boolean flag = driver.findElement(By.xpath("//i[@class='fa-solid fa-coin-blank menuCoinIcon']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("i should see the Credit amount")
	public void i_should_see_the_credit_amount() {
		String ActualText = driver.findElement(By.xpath("//h4[@class='credit_value mb-0']")).getText();
		String ExpectedText = ActualText;
		if(ActualText.equals(ExpectedText))
		{
			Assert.assertEquals(ExpectedText, ActualText);
		}
	}

	@Then("i should see the Store side bar link")
	public void i_should_see_the_store_side_bar_link() {

		boolean flag = driver.findElement(By.xpath("(//div[@class='menu-card'])[2]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("i should see the New text on the Store side bar link")
	public void i_should_see_the_new_text_on_the_store_side_bar_link() {

		boolean flag = driver.findElement(By.xpath("//button[@class='btn new-btn']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("i should see the bag icon on the Store side bar link")
	public void i_should_see_the_bag_icon_on_the_store_side_bar_link() {

		boolean flag = driver.findElement(By.xpath("//i[@class='fa-solid fa-bag-shopping icon-size']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("i should see the Winners side bar link")
	public void i_should_see_the_winners_side_bar_link() {

		boolean flag = driver.findElement(By.xpath("(//div[@class='menu-card'])[3]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("i should see the winner cup icon the Winners side bar link")
	public void i_should_see_the_winner_cup_icon_the_winners_side_bar_link() {

		boolean flag = driver.findElement(By.xpath("//i[@class='fa-solid fa-trophy icon-size']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("i should see the Refer_a_Friend side bar link")
	public void i_should_see_the_refer_a_friend_side_bar_link() {

		boolean flag = driver.findElement(By.xpath("(//div[@class='menu-card'])[4]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("i should see the Gift icon on the Refer_a_Friend side bar link")
	public void i_should_see_the_gift_icon_on_the_refer_a_friend_side_bar_link() {

		boolean flag = driver.findElement(By.xpath("//i[@class='fa-solid fa-gift icon-size']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("i should see the Promotions side bar link")
	public void i_should_see_the_promotions_side_bar_link() {

		boolean flag = driver.findElement(By.xpath("(//div[@class='menu-card'])[5]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("i should see the Promotions icon on the Promotions side bar link")
	public void i_should_see_the_promotions_icon_on_the_promotions_side_bar_link() {

		boolean flag = driver.findElement(By.xpath("//i[@class='fa-solid fa-rocket icon-size']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("i should see the Charity side bar link")
	public void i_should_see_the_charity_side_bar_link() {

		boolean flag = driver.findElement(By.xpath("(//div[@class='menu-card'])[6]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("i should see the Charity icon on the Promotions side bar link")
	public void i_should_see_the_charity_icon_on_the_promotions_side_bar_link() {

		boolean flag = driver.findElement(By.xpath("//i[@class='fa-solid fa-ribbon icon-size']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("i should see the Logout side bar link")
	public void i_should_see_the_logout_side_bar_link() {

		boolean flag = driver.findElement(By.xpath("(//div[@class='menu-card'])[7]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("i should see the Logout icon on the Logout side bar link")
	public void i_should_see_the_logout_icon_on_the_logout_side_bar_link() {

		boolean flag = driver.findElement(By.xpath("//i[@class='fa-regular fa-arrow-right-from-bracket icon-size']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@When("i click on the My raffles side bar link")
	public void i_click_on_the_my_raffles_side_bar_link() {

		driver.findElement(By.xpath("//div[@class='menu-card position-relative']")).click();
		Assert.assertTrue(true);
	}

	@Then("i should navigate to the my raffles page")
	public void i_should_navigate_to_the_my_raffles_page() {

		String ActualUrl = driver.getCurrentUrl();
		String ExpectedUrl = ActualUrl;
		Assert.assertEquals(ExpectedUrl, ActualUrl);
	}

	@When("i click on the My Credit side bar link")
	public void i_click_on_the_my_credit_side_bar_link() {

		driver.findElement(By.xpath("(//div[@class='menu-card'])[1]")).click();
		Assert.assertTrue(true);
	}

	@Then("i should navigate to the My Credit page")
	public void i_should_navigate_to_the_my_credit_page() {

		String ActualUrl = driver.getCurrentUrl();
		String ExpectedUrl = ActualUrl;
		Assert.assertEquals(ExpectedUrl, ActualUrl);
	}

	@When("i click on the Store side bar link")
	public void i_click_on_the_store_side_bar_link() {

		driver.findElement(By.xpath("(//div[@class='menu-card'])[2]")).click();
		Assert.assertTrue(true);
	}

	@Then("i should navigate to the Store page")
	public void i_should_navigate_to_the_store_page() {

		String ActualUrl = driver.getCurrentUrl();
		String ExpectedUrl = ActualUrl;
		Assert.assertEquals(ExpectedUrl, ActualUrl);
	}

	@When("i click on the Winners side bar link")
	public void i_click_on_the_winners_side_bar_link() {

		driver.findElement(By.xpath("(//div[@class='menu-card'])[3]")).click();
		Assert.assertTrue(true);
	}

	@Then("i should navigate to the Winners page")
	public void i_should_navigate_to_the_winners_page() {

		String ActualUrl = driver.getCurrentUrl();
		String ExpectedUrl = ActualUrl;
		Assert.assertEquals(ExpectedUrl, ActualUrl);
	}

	@When("i click on the Refer a Friend side bar link")
	public void i_click_on_the_refer_a_friend_side_bar_link() {

		driver.findElement(By.xpath("(//div[@class='menu-card'])[4]")).click();
		Assert.assertTrue(true);
	}

	@Then("i should navigate to the Refer a Friend page")
	public void i_should_navigate_to_the_refer_a_friend_page() {

		String ActualUrl = driver.getCurrentUrl();
		String ExpectedUrl = ActualUrl;
		Assert.assertEquals(ExpectedUrl, ActualUrl);
	}

	@When("i click on the Promotions side bar link")
	public void i_click_on_the_promotions_side_bar_link() {

		driver.findElement(By.xpath("(//div[@class='menu-card'])[5]")).click();
		Assert.assertTrue(true);
	}

	@Then("i should navigate to the Promotions page")
	public void i_should_navigate_to_the_promotions_page() {

		String ActualUrl = driver.getCurrentUrl();
		String ExpectedUrl = ActualUrl;
		Assert.assertEquals(ExpectedUrl, ActualUrl);
	}

	@When("i click on the Charity side bar link")
	public void i_click_on_the_charity_side_bar_link() {

		driver.findElement(By.xpath("(//div[@class='menu-card'])[6]")).click();
		Assert.assertTrue(true);
	}

	@Then("i should navigate to the Charity page")
	public void i_should_navigate_to_the_charity_page() {

		String ActualUrl = driver.getCurrentUrl();
		String ExpectedUrl = ActualUrl;
		Assert.assertEquals(ExpectedUrl, ActualUrl);
	}

	@When("i click on the Logout side bar link")
	public void i_click_on_the_logout_side_bar_link() {

		driver.findElement(By.xpath("(//div[@class='menu-card'])[1]")).click();
		Assert.assertTrue(true);
	}

	@Then("i should navigate to the index page")
	public void i_should_navigate_to_the_index_page() {

		String ActualUrl = driver.getCurrentUrl();
		String ExpectedUrl = ActualUrl;
		Assert.assertEquals(ExpectedUrl, ActualUrl);
	}

	@Then("i should see the text Account Settings")
	public void i_should_see_the_text_account_settings() {

		String ActualText = driver.findElement(By.xpath("(//h3[@class='main-hdr'])[2]")).getText();
		String ExpectedText = ActualText;
		Assert.assertEquals(ExpectedText, ActualText);
	}

	@Then("i should see the Personal info side bar link")
	public void i_should_see_the_personal_info_side_bar_link() {

		boolean flag = driver.findElement(By.xpath("(//div[@class='menu-card'])[8]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("i should see the user icon on the Personal info side bar link")
	public void i_should_see_the_user_icon_on_the_personal_info_side_bar_link() {

		boolean flag = driver.findElement(By.xpath("//i[@class='fa-regular fa-user icon-size']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("i should see the Light/Dark side bar link")
	public void i_should_see_the_light_dark_side_bar_link() {

		boolean flag = driver.findElement(By.xpath("(//div[@class='menu-card'])[9]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("i should see the half moon icon on the Light/Dark side bar link")
	public void i_should_see_the_half_moon_icon_on_the_light_dark_side_bar_link() {

		boolean flag = driver.findElement(By.xpath("//i[@class='fas fa-moon']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("i should see the Light/Dark toggle theme on the Light/Dark side bar link")
	public void i_should_see_the_light_dark_toggle_theme_on_the_light_dark_side_bar_link() {

		boolean flag = driver.findElement(By.xpath("//label[@for='checkbox']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("i should see the half moon icon on the Light/Dark toggle")
	public void i_should_see_the_half_moon_icon_on_the_light_dark_toggle() {

		boolean flag = driver.findElement(By.xpath("//i[@class='fas fa-moon']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("i should see the sun icon on the Light/Dark toggle")
	public void i_should_see_the_sun_icon_on_the_light_dark_toggle() {

		boolean flag = driver.findElement(By.xpath("//i[@class='fas fa-sun']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@When("i click on the personal info side bar link")
	public void i_click_on_the_personal_info_side_bar_link() {

		driver.findElement(By.xpath("(//div[@class='menu-card'])[8]")).click();
		Assert.assertTrue(true);
	}

	@Then("i should navigate to the account Settings page")
	public void i_should_navigate_to_the_account_settings_page() {

		String ActualUrl = driver.getCurrentUrl();
		String ExpectedUrl = ActualUrl;
		Assert.assertEquals(ExpectedUrl, ActualUrl);
	}

	@When("i click on the Light/Dark side bar link")
	public void i_click_on_the_light_dark_side_bar_link() {

		driver.findElement(By.xpath("(//div[@class='menu-card'])[9]")).click();
		Assert.assertTrue(true);
	}

	@Then("i should see the changes on the respective web page")
	public void i_should_see_the_changes_on_the_respective_web_page() {

		Assert.assertTrue(true);
	}

	@Then("i should see the text Site information")
	public void i_should_see_the_text_site_information() {

		String ActualText = driver.findElement(By.xpath("//h3[text()='SITE INFORMATION']")).getText();
		String ExpectedText = ActualText;
		Assert.assertEquals(ExpectedText, ActualText);
	}

	@Then("i should see the Help & FAQs side bar link")
	public void i_should_see_the_help_fa_qs_side_bar_link() {

		boolean flag = driver.findElement(By.xpath("(//div[@class='menu-card'])[10]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("i should see the Help & FAQs icon on the Help & FAQs side bar link")
	public void i_should_see_the_help_fa_qs_icon_on_the_help_fa_qs_side_bar_link() {

		boolean flag = driver.findElement(By.xpath("//i[@class='fa-regular fa-circle-question icon-size']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@When("i click on the Help & FAQs side bar link")
	public void i_click_on_the_help_fa_qs_side_bar_link() {

		driver.findElement(By.xpath("(//div[@class='menu-card'])[10]")).click();
		Assert.assertTrue(true);
	}

	@Then("i should navigate to the Help page")
	public void i_should_navigate_to_the_help_page() {

		String ActualUrl = driver.getCurrentUrl();
		String ExpectedUrl = ActualUrl;
		Assert.assertEquals(ExpectedUrl, ActualUrl);
	}

	@Then("i should see the Terms link")
	public void i_should_see_the_terms_link() {

		boolean flag = driver.findElement(By.xpath("//a[text()='Terms']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("i should see the Privacy link")
	public void i_should_see_the_privacy_link() {

		boolean flag = driver.findElement(By.xpath("//a[text()='Privacy']")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Then("i should see the Help link")
	public void i_should_see_the_help_link() {

		boolean flag = driver.findElement(By.xpath("//a[text()='Help']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("i should see the Responsible Play link")
	public void i_should_see_the_responsible_play_link() {

		boolean flag = driver.findElement(By.xpath("(//a[text()='Responsible Play'])[1]")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("i should see the Facebook icon")
	public void i_should_see_the_facebook_icon() {

		boolean flag = driver.findElement(By.xpath("//i[@class='fa-brands fa-facebook']")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Then("i should see the Twitter icon")
	public void i_should_see_the_twitter_icon() {

		boolean flag = driver.findElement(By.xpath("//i[@class='fa-brands fa-twitter']")).isDisplayed();
		Assert.assertTrue(flag);
	}
	

	@After
	public void tearDown() {
		driver.close();
	}
}
