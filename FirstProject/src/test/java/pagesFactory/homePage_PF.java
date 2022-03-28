package pagesFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class homePage_PF {
	
	
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]")
	WebElement dropdownaccount;
	
	//  /html/body/nav/div/div[2]/ul/li[2]
			//*[@id="top-links"]/ul/li[2]
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
	WebElement dropdownregister;
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	WebElement dropdownlogin;
	
	//*[@id="top-links"]/ul/li[2]/ul/li[1]/a
	
	@FindBy(xpath="//*[@id=\"input-firstname\"]")
	WebElement txt;
	
	WebDriver driver;
	
	public homePage_PF(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}


	
	
	public void clickOnDropDownAccount() {
		dropdownaccount.click();

	}
	
	public void clickOnRegisterAccount() {
		dropdownregister.click();

	}
	
	public void clickOnLoginAccount() {
		dropdownlogin.click();

	}
	
	public void checkTextIsDisplayed() {
		txt.isDisplayed();

	}

}
