package pages;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesFactory.registerPage_PF;
import pagesFactory.registerPagewithExcel_PF;
import util.ExcelReader;

public class registerPagewithExcel {

	WebDriver driver = null;
	registerPagewithExcel_PF register;

	
	@Given("user is on register")
	public void user_is_on_register() {
	   
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

	@When("user in first scenario fills the form from given sheetname {string} and rownumber {int}")
	public void user_in_first_scenario_fills_the_form_from_given_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
	  
		register = new registerPagewithExcel_PF(driver);
		ExcelReader reader =  new ExcelReader();
		List<Map<String,String>> testData = 
		reader.getData("D:\\FirstProject\\profile.xlsx", sheetName);
		
		String fn = testData.get(rowNumber).get("firstname");
		String ln = testData.get(rowNumber).get("lastname");
		
		System.out.println(fn);
		register.enterFirstNameExcel(fn);
		register.enterLastNameExcel(ln);
	
	}
	
	@When("user in second scenario fills the form from given sheetname {string} and rownumber {int}")
	public void user_in_second_scenario_fills_the_form_from_given_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
	  
		register = new registerPagewithExcel_PF(driver);
		ExcelReader reader =  new ExcelReader();
		List<Map<String,String>> testData = 
		reader.getData("D:\\FirstProject\\profile.xlsx", sheetName);
		
		String fn = testData.get(rowNumber).get("firstname");
		String ln = testData.get(rowNumber).get("lastname");
		String em = testData.get(rowNumber).get("email");
		
		System.out.println(fn);
		register.enterFirstNameExcel(fn);
		register.enterLastNameExcel(ln);
		register.enterEmailExcel(em);
	
	}

	@And("user clicks on a button")
	public void user_clicks_on_a_button() {
		register = new registerPagewithExcel_PF(driver);
		register.pressSubmitButton();
	}

	
	@Then("the error message displayed")
	public void the_error_message_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new io.cucumber.java.PendingException();
	}

}
