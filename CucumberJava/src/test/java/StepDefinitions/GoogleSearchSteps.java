package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps {
	
	public static WebDriver driver = null;
	
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("Inside Step - browser is open");
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//		System.out.println("Inside Step - user is on google search page");
//		driver.get("https://google.com");
//	}
//
//	@When("user enters a text in search box")
//	public void user_enters_a_text_in_search_box() {
//		System.out.println("Inside Step - user enters a text in search box");
//		driver.findElement(By.name("q")).sendKeys("a text");
//	}
//
//	@And("hits enter")
//	public void hits_enter() {
//		System.out.println("Inside Step - hits enter");
//		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
//	}
//
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() {
//		System.out.println("Inside Step - user is navigated to search results");
//		boolean navigatedToSearchResults = driver.getPageSource().contains("a text");
//		if(navigatedToSearchResults == true){
//			System.out.println("Step Passed");
//		}
//		else {
//			Assert.fail();
//			System.out.println("Step Failed");
//			//else statement works but step failure is not detected by JUNIT
//		}
//		driver.close();
//		driver.quit();
//	}
}
