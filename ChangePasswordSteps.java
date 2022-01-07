package steps;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChangePasswordSteps {
	
	WebDriver driver;

		@Given("^I log into the JPetStore page with valid credentials$")
		public void i_log_into_the_JPetStore_page_with_valid_credentials() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "chrome/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://35.209.98.104:8080/jpetstore/actions/Account.action?signonForm=");
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("username")).sendKeys("quality1");
			driver.findElement(By.name("password")).sendKeys("12345678");
			driver.findElement(By.name("signon")).click();

		}

		@Given("^I navigate to the my account page$")
		public void i_navigate_to_the_my_account_page() throws Throwable {
			driver.findElement(By.linkText("My Account")).click();

		}
	
		 @When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\" combination2$")
			public void i_enter_valid_and_combination(String arg1, String arg2) throws Throwable {
				driver.findElement(By.name("password")).sendKeys(arg1);
				driver.findElement(By.name("repeatedPassword")).sendKeys(arg2);
				driver.findElement(By.name("editAccount")).click();

			}

		@Then("^I should be able to change my password successfully$")
		public void i_should_be_able_to_change_my_password_successfully() throws Throwable {
			try {
				WebElement element = driver.findElement(By.linkText("Sign Out"));
				assertTrue(true);
			} catch (Exception e) {
				fail();
			} finally {
				driver.quit();
			}

		}


}
