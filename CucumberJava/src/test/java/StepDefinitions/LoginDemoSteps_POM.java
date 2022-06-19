package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.loginPage;

public class LoginDemoSteps_POM {

//	WebDriver driver = null;
//	loginPage login;
//
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("Inside LoginDemoSteps_POM");
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		driver.navigate().to("https://example.testproject.io/web/");
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) {
//
//		login = new loginPage(driver);
//
//		login.enterUsername(username);
//		login.enterPassword(password);
//	}
//
//	@And("user clicks on login")
//	public void user_clicks_on_login() {
//		login.clickLogin();
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() throws InterruptedException {
//
//		login.checkLogoutIsDisplayed();
//
//		Thread.sleep(2000);
//		driver.close();
//		driver.quit();
//	}

}
