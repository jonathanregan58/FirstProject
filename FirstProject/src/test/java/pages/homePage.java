package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import pagefactory.HomePage_PF;
//import pagefactory.LoginPage_PF;
import pagesFactory.registerPage_PF;
import pagesFactory.homePage_PF;


public class homePage {
	
	
	
	//WebDriver driver;
	WebDriver driver = null;
	public registerPage_PF register;
	public homePage_PF home;

	//WebDriver driver = null;
	//homePage_PF home;
	//registerPage_PF register;
	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}
	
	//public void clickDropdown() {
		
//	}
	
	//public void clickRegister() {
		
	//}
	
	@Given("user is on Home Page")
	public void user_is_on_Home_Page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
        System.out.println("Inside Step - user is on process(This uses POM)");
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = (WebDriver) new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		Thread.sleep(4000);
		
		driver.navigate().to("http://tutorialsninja.com/demo/index.php");
	}

	@When("user clicks on Account dropdown menu")
	public void user_clicks_on_Account_dropdown_menu() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		 System.out.println("Inside Step - user clicks dropdown(This uses POM)");
	    home = new homePage_PF(driver);
		home.clickOnDropDownAccount();
		Thread.sleep(4000);
	}

	@When("user clicks on register")
	public void user_clicks_on_register() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		 home = new homePage_PF(driver);
		 home.clickOnRegisterAccount();
		 Thread.sleep(4000);
	}
	
	

	@Then("user is navigated to the register page")
	public void user_is_navigated_to_the_register_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		 home = new homePage_PF(driver);
		 home.checkTextIsDisplayed();
		 Thread.sleep(4000);
	}
	
	@When("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		home = new homePage_PF(driver);
		 home.clickOnLoginAccount();
		 Thread.sleep(4000);
	}

	@Then("user is navigated to the login page")
	public void user_is_navigated_to_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new io.cucumber.java.PendingException();
	}
	
	

}
