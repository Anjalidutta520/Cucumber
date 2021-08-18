package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("^user is on login page$")
    public void user_is_on_login_page(){
        System.out.println("Inside Step- user is on login page.");
    }

    @When("^user enters username and password$")
    public void user_enters_username_and_password(){
        System.out.println("Inside Step- user enters username and password.");
    }

    @And("^clicks on login button$")
    public void clicks_on_login_button(){
        System.out.println("Inside Step- user clicks on login button");
    }

    @Then("^user is navigated to home page$")
    public void user_is_navigated_to_home_page(){
        System.out.println("Inside Step- user is navigated to home page.");
    }

    @Given("^user is on login page for new scenario$")
    public void user_is_on_login_page_for_new_scenario(){
        System.out.println("Inside Step Scenario Outline- user is on login page.");
    }

    @When("^user enters user1 and password1$")
    public void user_enters_user1_and_password1(){
        System.out.println("Inside Step Scenario Outline- user enters invalid username and password.");
    }

    @When("^user enters user2 and password2$")
    public void user_enters_user2_and_password2(){
        System.out.println("Inside Step Scenario Outline- user enters invalid username and password.");
    }

    @And("^clicks on login button for new scenario$")
    public void clicks_on_login_button_for_new_scenario(){
        System.out.println("Inside Step Scenario Outline- user clicks on login button");
    }

    @Then("^user is not navigated to home page$")
    public void user_is_not_navigated_to_home_page(){
        System.out.println("Inside Step Scenario Outline- user is not navigated to home page.");
    }
}
