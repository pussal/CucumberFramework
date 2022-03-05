package stepDefinitions;
import io.cucumber.java.en.And;
//ctrl+shift+O for import all at once
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("user is on login page");
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		System.out.println("user enters valid username and password");

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("clicks on login button");

	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("user is navigated to the home page");

	}




}