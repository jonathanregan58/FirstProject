package pagesFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerPagewithExcel_PF {
	
WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"input-firstname\"]")
	WebElement txt_firstname;
	
	@FindBy(xpath="//*[@id=\"input-lastname\"]")
	WebElement txt_lastname;
	
	@FindBy(xpath="//*[@id=\"input-email\"]")	
	WebElement txt_email;
	
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[2]")
	WebElement btn_submit;

public registerPagewithExcel_PF(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
     
     public void enterFirstNameExcel(String firstname) {
    	 
 		txt_firstname.sendKeys(firstname);

 	}
     
     public void enterLastNameExcel(String lastname) {
    	 
  		txt_lastname.sendKeys(lastname);

  	}
     
     public void enterEmailExcel(String email) {
    	 
   		txt_email.sendKeys(email);

   	}
     
     public void pressSubmitButton() {
    	
       btn_submit.click();	 
     }
     
     
     
 	
 	//public void enterLastName(String lastname) {
 		//txt_lastname.sendKeys(lastname);

 	//}


}
