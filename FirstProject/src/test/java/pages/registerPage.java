package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesFactory.homePage_PF;
import pagesFactory.registerPage_PF;


public class registerPage {

	
	WebDriver driver;
	registerPage_PF register;
	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}
	@Given("user is on the register page")
	public void user_is_on_the_register_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = (WebDriver) new ChromeDriver();
		 String currentURL = driver.getCurrentUrl();
		 if(currentURL == "http://tutorialsninja.com/demo/index.php?route=account/register")
		 {
			 driver.navigate().refresh();
		 }
		 else
		 {
			 driver.navigate().to("http://tutorialsninja.com/demo/index.php?route=account/register");
		 }
		 
	}

	@When("user enters {string} as First Name")
	public void user_enters_as_First_Name(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		 register = new registerPage_PF(driver);
		 register.enterFirstName("Jonathan");
		 Thread.sleep(4000);
	}

	@When("user enters {string} as Last Name")
	public void user_enters_as_Last_Name(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		 register = new registerPage_PF(driver);
		 register.enterLastName("Regan");
		 Thread.sleep(4000);
	}
	@Then("user is navigated to the verification page")
	public void user_is_navigated_to_the_verification_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
