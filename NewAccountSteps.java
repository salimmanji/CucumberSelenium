package steps;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewAccountSteps {

	WebDriver driver;

	@Given("^I go to the Jpetstore Login$")
	public void i_go_to_the_JP() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "chrome/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://35.209.98.104:8080/jpetstore/actions/Account.action?newAccountForm=");

	}

	@When("^I enter valid \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" combination$")
	public void i_enter_valid_and_combination(String arg1, String arg2, String arg3, String arg4, String arg5,
			String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("username")).sendKeys(arg1);
		driver.findElement(By.name("password")).sendKeys(arg2);
		driver.findElement(By.name("repeatedPassword")).sendKeys(arg3);
		driver.findElement(By.name("account.firstName")).sendKeys(arg4);
		driver.findElement(By.name("account.lastName")).sendKeys(arg5);
		driver.findElement(By.name("account.email")).sendKeys(arg6);
		driver.findElement(By.name("account.phone")).sendKeys(arg7);
		driver.findElement(By.name("account.address1")).sendKeys(arg8);
		driver.findElement(By.name("account.city")).sendKeys(arg9);
		driver.findElement(By.name("account.zip")).sendKeys(arg10);
		driver.findElement(By.name("account.state")).sendKeys(arg11);
		driver.findElement(By.name("account.country")).sendKeys(arg12);
		driver.findElement(By.name("newAccount")).click();
	}

	@Then("^I should be able create a new user with the User Information \"([^\"]*)\",\"([^\"]*)\" successfully$")
	public void i_should_be_able_to_login_successfully(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			System.setProperty("webdriver.chrome.driver", "chrome/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://35.209.98.104:8080/jpetstore/actions/Account.action?signonForm=");
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("username")).sendKeys(arg1);
			driver.findElement(By.name("password")).sendKeys(arg2);
			driver.findElement(By.name("signon")).click();
			WebElement ele = driver.findElement(By.linkText("Sign Out"));
			assertTrue(true);

		} catch (Exception e) {
			fail();
		} finally {
			driver.quit();
		}

	}

}
