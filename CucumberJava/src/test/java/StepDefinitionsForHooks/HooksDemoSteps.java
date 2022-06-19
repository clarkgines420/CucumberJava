package StepDefinitionsForHooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksDemoSteps {
	
	WebDriver driver = null;
	
	@Before("@smoke")
	public void browserSetup() {
		System.out.println("I am inside browserSetup");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@Before(order=0)
	public void setup2() {
		System.out.println("I am inside setup2");
	}
	
	@BeforeStep
	public void beforeStep() {
		System.out.println("I am inside beforeSteps");
	}
	
	@AfterStep
	public void afterStep() {
		System.out.println("I am inside afterStep");
	}
	
	@After
	public void teardown() {
		System.out.println("I am inside teardown");
		driver.close();
		driver.quit();
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("I am inside step 1");
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		System.out.println("I am inside step 2");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("I am inside step 3");
	}

	@Then("user is navigated to the home pages")
	public void user_is_navigated_to_the_home_pages() {
		System.out.println("I am inside step 4");
	}

}
