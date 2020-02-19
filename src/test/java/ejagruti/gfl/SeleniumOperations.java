package ejagruti.gfl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumOperations {
	static WebDriver driver;
	public static void SetProperty(String value1,String value2) {
		System.setProperty((value1),(value2));
		if(value1 == "Chrome")
			driver = new ChromeDriver(); 
		 }
	
	public static void launchUrl(String url) {
		 driver.navigate().to(url); 
		 driver.manage().window().maximize(); 
	}
	
	public static void clickButton(String xpath) {
		WebElement login=driver.findElement(By.xpath(xpath));
		login.click();
		
		
	}
	
	public static void setText(String xpath,String value) {
		 WebElement username=driver.findElement(By.xpath(xpath)); 
		 username.sendKeys(value);	
		 }
	
	
	public static void selectText(String xpath,String value) {
		WebElement Companytype =driver.findElement(By.xpath(xpath));
	     Select sel=new Select(Companytype);
		 sel.selectByValue(value);
	}
	
	
	
	
	
	
	
	
     
	
}	




