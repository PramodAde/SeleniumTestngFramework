 package testcases; 
  
 import java.io.IOException;

import org.testng.annotations.Test;


import pageObjectModel.RegisterationPageObjects; 
 import resources.baseClass;
import resources.commonMethods;
import resources.constant; 
  
 public class VerifyRegisterationTestCases extends baseClass { 
  
 	 
 	@Test 
 	public void verifyRegisterationWithValidData() throws IOException, InterruptedException { 
 
  
 		RegisterationPageObjects rpo = new RegisterationPageObjects(driver); 
  
 		rpo.clickOnMyAccount().click(); 
 		rpo.clickOnRegister().click(); 
 		rpo.Enterfirstname().sendKeys(constant.firstname); 
 		rpo.Enterlastname().sendKeys(constant.lastname); 
 		rpo.Enteremail().sendKeys(email);
 		commonMethods.WaitHandling(driver,10, rpo.Entertelephone());
 		rpo.Entertelephone().sendKeys(constant.phone); 
 		rpo.Enterpassword().sendKeys(constant.password); 
 		rpo.Enterpasswordconfirm().sendKeys(constant.confirmpassword); 
 		rpo.clickOnpolicycheck().click();
 		rpo.clickOnsubmit().click();
 		
        commonMethods.AssertHandling(rpo.actualText().getText(), constant.expectedRegisteration);
 		
  
 	} 
 	 
 	 
 	@Test 
 	public void verifyRegisterationWithInValidData() throws IOException, InterruptedException { 
  
 	 
  
 		RegisterationPageObjects rpo = new RegisterationPageObjects(driver); 
  
 		rpo.clickOnMyAccount().click(); 
 		rpo.clickOnRegister().click();
 		rpo.clickOnsubmit().click(); 
  
        commonMethods.AssertHandling(rpo.lnactualText().getText(), constant.lnExpected);
 		commonMethods.AssertHandling(rpo.fnactualText().getText(), constant.fnExpected);
 	} 
  
 }