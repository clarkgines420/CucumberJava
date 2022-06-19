package StepDefinitionsForBackground;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundDemoSteps {
//Background
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("I am inside BACKGROUND");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
	}
	
//Scenario 1
	@When("user clicks on welcome link")
	public void user_clicks_on_welcome_link() {
		System.out.println("I am inside SCENARIO 1");
	}

	@Then("logout link is displayed")
	public void logout_link_is_displayed() {
	}

//Scenario 2
	@When("user clicks on dashboard link")
	public void user_clicks_on_dashboard_link() {
		System.out.println("I am inside SCENARIO 2");
	}

	@Then("quick launch toolbar is displayed")
	public void quick_launch_toolbar_is_displayed() {
	}

}
