package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;

public class LoginDemoSteps_PF {

	public static WebDriver driver = null;
	LoginPage_PF login;
	HomePage_PF home;

	@Given("browser is open")
	public void browser_is_open() {
		
		System.out.println("==== I am inside LoginDemoSteps_PF class ==== ");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("I am inside user is on login page step");
		driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		System.out.println("I am inside user enters username and password step");
		login = new LoginPage_PF(driver);
		login.enterUsername(username);
		login.enterPassword(password);
	}

	@And("user clicks on login")
	public void user_clicks_on_login() {
		System.out.println("I am inside user clicks on login step");
		login.clickOnLogin();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		System.out.println("I am inside user is navigated to the home page step");
		home = new HomePage_PF(driver);
		home.checkLogoutIsDisplayed();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
