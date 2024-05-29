package testcases; 
  
 import java.io.IOException;
 import org.testng.annotations.Test;
import pageObjectModel.LoginPageObjects;
import pageObjectModel.RegisterationPageObjects;
import resources.baseClass;
import resources.commonMethods;
import resources.constant; 
 
 public class VeriyLoginTestCases extends baseClass{ 
 	 
 	 
 	 
 	@Test 
 	public void verifyLoginithValidData() throws IOException{ 
 		 
      LoginPageObjects lpo=new LoginPageObjects(driver);
      lpo.clickOnMyAccount().click();
      lpo.clickOnLogin().click();
      lpo.enterEmail().sendKeys(email);
      commonMethods.WaitHandling(driver,10, lpo.enterPassword());
      lpo.enterPassword().sendKeys(constant.password);
      lpo.clickOnSubmitButton().click();
      
      commonMethods.AssertHandling(lpo.ActualText().getText(), constant.expectedlogin);
		
 	} 


 
 
	@Test 
	public void verifyLoginithInValidData() throws IOException, InterruptedException { 


		RegisterationPageObjects rpo = new RegisterationPageObjects(driver); 
 		rpo.clickOnMyAccount().click(); 
  
 		LoginPageObjects lpo = new LoginPageObjects(driver); 
  
 		lpo.clickOnLogin().click(); 
  
 		lpo.enterEmail().sendKeys(email); 
 	
 		lpo.enterPassword().sendKeys(constant.invalidPassword); 
 		lpo.clickOnSubmitButton().click(); 
  
 		commonMethods.AssertHandling(lpo.unactual().getText(),  constant.unexpected);
 		
 		
  
 	} 
	
 }