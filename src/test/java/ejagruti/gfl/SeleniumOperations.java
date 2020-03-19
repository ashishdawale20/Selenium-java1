package ejagruti.gfl;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumOperations {
	static WebDriver driver;
	
	 
	public static void SetProperty(String value1,String value2) {
		
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.setProperty((value1),(value2));
		driver = new ChromeDriver(); 
	}
	
	public static void launchUrl(String url) {
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver.navigate().to(url); 
		 driver.manage().window().maximize(); 
	}
	
	public static void clickButton(String xpath) {
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement login=driver.findElement(By.xpath(xpath));
		login.click();
		
	}
	
	public static void setText(String xpath,String value) {
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 WebElement username=driver.findElement(By.xpath(xpath)); 
		 username.sendKeys(value);	
		 }
	
	
	public static void selectText(String xpath,String value) {
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement Companytype =driver.findElement(By.xpath(xpath));
	     Select sel=new Select(Companytype);
		 sel.selectByValue(value);
	}
	
	public static void switchTo(String id) {
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().frame(id);
	}
	
	
	public static void popup() {
		try {
	 	    WebDriverWait wait = new WebDriverWait(driver, 2);
	 	    wait.until(ExpectedConditions.alertIsPresent());
	 	    Alert alert = driver.switchTo().alert();
	 	    System.out.println(alert.getText());
	 	    alert.accept();
	 	    
	 	 } catch (Exception e) 
	     {
	 	  System.out.println(e);
	     }
	}
     
	
}	




