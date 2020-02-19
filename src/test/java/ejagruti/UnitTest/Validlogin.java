package ejagruti.UnitTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ejagruti.gfl.GenericFunctions;
import ejagruti.gfl.SeleniumOperations;

public class Validlogin {
public static void main(String[]args) throws InterruptedException {
		
		GenericFunctions genericFun = new GenericFunctions();
		
		
		//STEP 1. Launch Application
		SeleniumOperations.SetProperty(genericFun.getKeyValue1("createcompany_setproperty"), genericFun.getKeyValue1("createcompany_property"));
	/*	System.setProperty(genericFun.getKeyValue1("createcompany_setproperty"),genericFun.getKeyValue1("createcompany_property"));
		 WebDriver driver=new ChromeDriver(); 
		 driver.navigate().to(genericFun.getKeyValue1("createcompany_url")); 
		 driver.manage().window().maximize(); 
		*/ 
		 WebDriver driver=new ChromeDriver(); 
		 
		 SeleniumOperations.launchUrl( genericFun.getKeyValue1("createcompany_url"));
		 Thread.sleep(1000);
		  
	//STEP 2.Enter Valid username
		 
		 SeleniumOperations.setText(genericFun.getKeyValue("createcompany_username"),genericFun.getKeyValue1("createcompany_username"));
		/* WebElement username=driver.findElement(By.xpath(genericFun.getKeyValue("createcompany_username"))); 
		 username.sendKeys(genericFun.getKeyValue1("createcompany_username"));  */
		 
		 
		
		//STEP 3.Enter valid password
		 
		 SeleniumOperations.setText(genericFun.getKeyValue("createcompany_password"),genericFun.getKeyValue1("createcompany_password"));
		/* WebElement password=driver.findElement(By.xpath(genericFun.getKeyValue("createcompany_password")));
		password.sendKeys(genericFun.getKeyValue1("createcompany_password"));  */
		
		//STEP 4. Click on login button
		 
		 SeleniumOperations.clickButton(genericFun.getKeyValue("createcompany_login"));
			
		 /* WebElement login=driver.findElement(By.xpath(genericFun.getKeyValue("createcompany_login")));
		login.click();  */
		
		 Thread.sleep(1000);
	}
}

