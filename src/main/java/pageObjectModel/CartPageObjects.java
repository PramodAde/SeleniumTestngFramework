package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPageObjects {

	public WebDriver driver;
	
	private By phoneoption = By.xpath("//a[text()='Phones & PDAs']");
	private By iphoneprise = By.xpath("(//P[@class='price'])[2]");
	private By iphonecart = By.xpath("(//button[@type='button'])[12]");
	private By samsungsearch = By.xpath("//input[@type='text']");
	private By button = By.xpath("(//button[@type='button'])[4]");
	private By samsungprise = By.xpath("(//p[@class='price'])[2]");
	private By samsungcart = By.xpath("(//i[@class='fa fa-shopping-cart'])[5]");
	private By opnecart = By.xpath("(//button[@type='button'])[5]");
	private By totalcart = By.xpath("(//td[@class='text-right'])[12]");
	
	public CartPageObjects(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public WebElement ClickonphoneorPDAs() { 
 		return driver.findElement(phoneoption); 
 	}
	
	public WebElement appleprise() { 
 		return driver.findElement(iphoneprise); 
 	}
	
	public WebElement AppleAddTocart() { 
 		return driver.findElement(iphonecart); 
 	}
	
	public WebElement ClickonSearch() { 
 		return driver.findElement(samsungsearch); 
 	}
	
	public WebElement ClickonButton() { 
 		return driver.findElement(button); 
 	}
	
	public WebElement ClickonSamsungPrise() { 
 		return driver.findElement(samsungprise); 
 	}
	
	public WebElement ClickonSamsungCart() { 
 		return driver.findElement(samsungcart); 
 	}
	
	public WebElement ClickonTotalCart() { 
 		return driver.findElement(opnecart); 
 	}
	
	public WebElement TotalCartPrise() { 
 		return driver.findElement(totalcart); 
 	}
	
}
