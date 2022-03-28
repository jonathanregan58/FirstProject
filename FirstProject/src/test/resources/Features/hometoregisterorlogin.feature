
@Home
Feature: feature to test the accessability of register page and/or from home page

@HomeToRegister
Scenario: Check if register page can be accessed from home page

Given user is on Home Page
 When user clicks on Account dropdown menu
 And user clicks on register
Then user is navigated to the register page

#@Given("user is on Home Page")
#public void user_is_on_Home_Page() {
  #  // Write code here that turns the phrase above into concrete actions
 #   throw new io.cucumber.java.PendingException();
#}

#@When("user clicks on Account dropdown menu")
#public void user_clicks_on_Account_dropdown_menu() {
  #  // Write code here that turns the phrase above into concrete actions
 #   throw new io.cucumber.java.PendingException();
#}

#@When("user clicks on register")
#public void user_clicks_on_register() {
 #   // Write code here that turns the phrase above into concrete actions
 #   throw new io.cucumber.java.PendingException();
#}

#@Then("user is navigated to the register page")
#public void user_is_navigated_to_the_register_page() {
 #   // Write code here that turns the phrase above into concrete actions
 #   throw new io.cucumber.java.PendingException();
#}

@HomeToLogin
Scenario: Check if login page can be accessed from home page

Given user is on Home Page
 When user clicks on Account dropdown menu
 And user clicks on login
Then user is navigated to the login page

#@When("user clicks on login")
#public void user_clicks_on_login() {
  #  // Write code here that turns the phrase above into concrete actions
 #   throw new io.cucumber.java.PendingException();
#}

#@Then("user is navigated to the login page")
#public void user_is_navigated_to_the_login_page() {
  #  // Write code here that turns the phrase above into concrete actions
 #   throw new io.cucumber.java.PendingException();
#}


