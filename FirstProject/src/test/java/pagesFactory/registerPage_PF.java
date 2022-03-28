package pagesFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class registerPage_PF {
	
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"input-firstname\"]")
	WebElement txt_firstname;
	
	@FindBy(xpath="//*[@id=\"input-lastname\"]")
	WebElement txt_lastname;

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}
	
     public registerPage_PF(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
     
     public void enterFirstName(String firstname) {
 		txt_firstname.sendKeys(firstname);

 	}
 	
 	public void enterLastName(String lastname) {
 		txt_lastname.sendKeys(lastname);

 	}

}
