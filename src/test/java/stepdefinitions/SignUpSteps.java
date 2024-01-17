/**
 * 
 */
package stepdefinitions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author hp
 *
 */
public class SignUpSteps {
	private WebDriver driver;

	/*@Before
	public void setUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}

	@Given("user is on Sign_Up page")
	public void user_is_on_sign_up_page() {
		System.out.println("user is on login page");
		driver.get("https://sandbox.raffolux.com/signup/");
	}

	@When("user enters {string}, {string}, {string}, {string}, {string}, {string}")
	public void user_enters(String First_Name, String Last_Name, String Email_Address, String Phone_number,
			String Choose_password, String Confirm_password) {

		System.out.println("user enters username and password");
		driver.findElement(By.id("id_first_name")).sendKeys(First_Name);
		driver.findElement(By.id("id_last_name")).sendKeys(Last_Name);
		driver.findElement(By.id("id_email")).sendKeys(Email_Address);
		driver.findElement(By.id("id_contact_number_2_1")).sendKeys(Phone_number);
		driver.findElement(By.id("id_password1")).sendKeys(Choose_password);
		driver.findElement(By.id("id_password2")).sendKeys(Confirm_password);
	}

	@When("selects country code from the dropdown")
	public void selects_country_code_from_the_dropdown() {
		System.out.println("selects country code from the dropdown");
		WebElement ele = driver.findElement(By.id("id_contact_number_2_0"));

		Select s = new Select(ele);
		s.selectByVisibleText("India +91");
	}

	@When("select a marketing preference check boxes which are yes or no")
	public void select_a_marketing_preference_check_boxes_which_are_yes_or_no() {
		System.out.println("select a marketing preference check boxes which are yes or no");
		WebElement ele = driver.findElement(By.xpath("(//span[@class='radio'])[1]"));
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);
	}

	@When("click on the Create account button")
	public void click_on_the_create_account_button() {
		System.out.println("click on the login button");
		WebElement ele = driver.findElement(By.xpath("//button[@class='primary-btn-18 w-100 mt-4 py-2']"));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);
	}

	@Then("user should be navigated to the home page")
	public void user_should_be_navigated_to_the_home_page() {
		System.out.println("user should be navigated to the home page");
	}*/
}
