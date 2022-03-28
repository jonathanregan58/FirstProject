@Register

Feature: feature to test register function

Scenario: Check register feature if the data is valid

Given user is on the register page
 When user enters "Jonathan" as First Name
 And user enters "Regan" as Last Name
 #And user enters "jonathanreganuntoro@yahoo.com" as email
 #And user enters "0818326755" as phone number
 #And user enters "abcdefg" as password
 #And user enters "abcdefg" as password confirmation
 #And user checks the checkbox for  "Agree to the policy"
 #And user clicks on submit button
Then user is navigated to the verification page

#@Given("user is on the register page")
#public void user_is_on_the_register_page() {
  #  // Write code here that turns the phrase above into concrete actions
 #   throw new io.cucumber.java.PendingException();
#}

#@When("user enters {string} as First Name")
#public void user_enters_as_First_Name(String string) {
  #  // Write code here that turns the phrase above into concrete actions
 #   throw new io.cucumber.java.PendingException();
#}

#@When("user enters {string} as Last Name")
#public void user_enters_as_Last_Name(String string) {
  #  // Write code here that turns the phrase above into concrete actions
 #   throw new io.cucumber.java.PendingException();
#}

#@When("user enters {string} as email")
#public void user_enters_as_email(String string) {
  #  // Write code here that turns the phrase above into concrete actions
 #   throw new io.cucumber.java.PendingException();
#}

#@When("user enters {string} as phone number")
#public void user_enters_as_phone_number(String string) {
  #  // Write code here that turns the phrase above into concrete actions
 #   throw new io.cucumber.java.PendingException();
#}

#@When("user enters {string} as password")
#public void user_enters_as_password(String string) {
  #  // Write code here that turns the phrase above into concrete actions
 #   throw new io.cucumber.java.PendingException();
#}

#@When("user enters {string} as password confirmation")
#public void user_enters_as_password_confirmation(String string) {
  #  // Write code here that turns the phrase above into concrete actions
 #   throw new io.cucumber.java.PendingException();
#}

#@When("user checks the checkbox for  {string}")
#public void user_checks_the_checkbox_for(String string) {
  #  // Write code here that turns the phrase above into concrete actions
 #   throw new io.cucumber.java.PendingException();
#}

#@When("user clicks on submit button")
#public void user_clicks_on_submit_button() {
  #  // Write code here that turns the phrase above into concrete actions
 #   throw new io.cucumber.java.PendingException();
#}

#@Then("user is navigated to the verification page")
#public void user_is_navigated_to_the_verification_page() {
  #  // Write code here that turns the phrase above into concrete actions
 #   throw new io.cucumber.java.PendingException();
#}