package testcases;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjectModel.CartPageObjects;
import resources.baseClass;
import resources.commonMethods;
import resources.constant;

public class AddingToCartTestCase extends baseClass{
    @Test
	public void VerifyProductAddingToCart()  throws IOException, InterruptedException {

		CartPageObjects cpo=new CartPageObjects(driver);

		

		
		cpo.ClickonphoneorPDAs().click();
		WebElement applecosttext = cpo.appleprise();

		String applecost = applecosttext.getText();

		String costapple = applecost.substring(0, 7);

		String[] dcost = costapple.split(" ");

		String acost = dcost[0];

		String appleruppecost = acost.replaceAll("[$]", "");
		
		String apple = appleruppecost;

		Double AppleAmount = Double.parseDouble(apple);
		commonMethods.WaitHandling(driver, 10, cpo.AppleAddTocart());
		cpo.AppleAddTocart().click();

	

		cpo.ClickonSearch().sendKeys(constant.modelname);
		
		cpo.ClickonButton().click();

		WebElement samsungcost = cpo.ClickonSamsungPrise();

		String SamusangText = samsungcost.getText();

		String costsamsung = SamusangText.substring(0, 7);

		String[] Scost = costsamsung.split(" ");

		String samcost = Scost[0];

		String RsSamsungcost = samcost.replaceAll("[$]", "");

		Double SamsungAmount = Double.parseDouble(RsSamsungcost);

		

		cpo.ClickonSamsungCart().click();

		
		double AppleSamsung = AppleAmount + SamsungAmount;

		String A = Double.toString(AppleSamsung);

		
		commonMethods.WaitHandling(driver, 10, cpo.ClickonTotalCart());	
		cpo.ClickonTotalCart().click();
		
		WebElement totalcart = cpo.TotalCartPrise();
		
		String Total = totalcart.getText();

		String Totalamount = Total.replaceAll("[$]", "");

		if (A.equals(Totalamount)) {
			System.out.println(constant.maching);

		} else {
			System.out.println(constant.notmaching);
		}

	}

}
