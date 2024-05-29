package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterationPageObjects {

	public WebDriver driver; 
	 // This dirver is null--this dont have any scope  
	 
 	//we will store locators here -- 
 	 
 	 
 	//driver.fidElemet(By.xpath"").click(); 
 	 
	 private By myAccount = By.xpath("//a[@title='My Account']"); 
	 private By Register = By.xpath("//a[text()='Register']"); 
	 private By firstname = By.xpath("//input[@name='firstname']"); 
	 private By lastname = By.xpath("//input[@name='lastname']"); 
	 private By email = By.xpath("//input[@name='email']"); 
	 private By telephone = By.xpath("//input[@name='telephone']"); 
	 private By password = By.xpath("//input[@name='password']"); 
	 private By passwordconfirm = By.xpath("//input[@name='confirm']"); 
	 private By policycheck = By.xpath("//input[@type='checkbox']"); 
	 private By submit = By.xpath("//input[@type='submit']"); 
	 private By actual=By.xpath("//h1[text()='Your Account Has Been Created!']"); 
	 private By fnActual=By.xpath("//div[text()='First Name must be between 1 and 32 characters!']");
	 private By lnActual=By.xpath("//div[text()='Last Name must be between 1 and 32 characters!']");
	 //Create the Constructor --- 
	 public RegisterationPageObjects(WebDriver driver2) {
		
		 this.driver=driver2;
	}

	public WebElement clickOnMyAccount() { 
	  
	     return driver.findElement(myAccount); 
	 } 
	  
	 public WebElement clickOnRegister() { 
	  
	     return driver.findElement(Register); 
	 } 
	 public WebElement Enterfirstname() { 
	  
	     return driver.findElement(firstname); 
	 } 
	 public WebElement Enterlastname() { 
	  
	     return driver.findElement(lastname); 
	 } 
	 public WebElement Enteremail() { 
	  
	     return driver.findElement(email); 
	 } 
	 public WebElement Entertelephone() { 
	  
	     return driver.findElement(telephone); 
	 } 
	 public WebElement Enterpassword() { 
	  
	     return driver.findElement(password); 
	 } 
	 public WebElement Enterpasswordconfirm() { 
	  
	     return driver.findElement(passwordconfirm); 
	 } 
	 public WebElement clickOnpolicycheck() { 
	  
	     return driver.findElement(policycheck); 
	 } 
	 public WebElement clickOnsubmit() { 
	  
	     return driver.findElement(submit); 
	 }
	 
	 
	 	public WebElement actualText() { 
	 		return driver.findElement(actual); 
	 	} 

	
	public WebElement fnactualText() { 
 		return driver.findElement(fnActual); 
 	} 

	public WebElement lnactualText() { 
 		return driver.findElement(lnActual); 
 	} 
}



