package ejagruti.UnitTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import ejagruti.gfl.GenericFunctions;
import ejagruti.gfl.SeleniumOperations;
import ejagruti.pfl.Global;

public class CreateCompany {

	public static void main(String[]args) throws InterruptedException {
		
		GenericFunctions genericFun = new GenericFunctions();
		
		
		//STEP 1. Launch Application
		SeleniumOperations.SetProperty(genericFun.getKeyValue1("createcompany_setproperty"), genericFun.getKeyValue1("createcompany_property"));
		//System.setProperty(genericFun.getKeyValue1("createcompany_setproperty"),genericFun.getKeyValue1("createcompany_property"));
		 WebDriver driver=new ChromeDriver(); 
		 
		 SeleniumOperations.launchUrl( genericFun.getKeyValue1("createcompany_url"));
		// driver.navigate().to(genericFun.getKeyValue1("createcompany_url")); 
		 //driver.manage().window().maximize(); 
		 
		 Thread.sleep(1000);
		  
	//STEP 2.Enter Valid username
		
		 SeleniumOperations.setText(genericFun.getKeyValue("createcompany_username"),genericFun.getKeyValue1("createcompany_username"));
		// WebElement username=driver.findElement(By.xpath(genericFun.getKeyValue("createcompany_username"))); 
		// username.sendKeys(genericFun.getKeyValue1("createcompany_username"));
		 
		 
		
		//STEP 3.Enter valid password
		 
		 SeleniumOperations.setText(genericFun.getKeyValue("createcompany_password"),genericFun.getKeyValue1("createcompany_password"));
		
	//	WebElement password=driver.findElement(By.xpath(genericFun.getKeyValue("createcompany_password")));
	//	password.sendKeys(genericFun.getKeyValue1("createcompany_password"));
		
		//STEP 4. Click on login button
		 
		 SeleniumOperations.clickButton(genericFun.getKeyValue("createcompany_login"));
		
		//WebElement login=driver.findElement(By.xpath(genericFun.getKeyValue("createcompany_login")));
		//login.click();
		
		 Thread.sleep(1000);
		  
		
		//STEP 5. Click on Company
		try
		{
			SeleniumOperations.clickButton(genericFun.getKeyValue("createcompany_company"));
		/*WebElement company=driver.findElement(By.xpath(genericFun.getKeyValue("createcompany_company")));
		company.click();  */
		}
		catch(Exception ex) {}
		
		Thread.sleep(1000);
		
		//STEP 6. Click on Manage Company
		
		SeleniumOperations.clickButton(genericFun.getKeyValue("createcompany_managecompany"));
	/*	WebElement managecompany=driver.findElement(By.xpath(genericFun.getKeyValue("createcompany_managecompany")));
		managecompany.click();  */
		
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		Thread.sleep(1000);
		
		driver.switchTo().frame("actionid");
		//STEP 7. Click on New button
		
		SeleniumOperations.clickButton(genericFun.getKeyValue("createcompany_newbutton"));
	/*	WebElement newCompany=driver.findElement(By.xpath(genericFun.getKeyValue("createcompany_newbutton")));
		newCompany.click();  */
		
		 Thread.sleep(1000);
		  
		//STEP 8. Enter Company Name
		 
		 SeleniumOperations.setText(genericFun.getKeyValue("createcompany_companyname"),genericFun.getKeyValue1("createcompany_companyname"));
		//WebElement Companyname=driver.findElement(By.xpath(genericFun.getKeyValue("createcompany_companyname")));
		//Companyname.sendKeys(genericFun.getKeyValue1("createcompany_companyname"));
		
		
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	  Thread.sleep(1000);
	  
	  //STEP 9. Select Company type
	  SeleniumOperations.selectText( genericFun.getKeyValue("createcompany_companytype"), genericFun.getKeyValue1("createcompany_companytype"));
	  
	  
	/*    WebElement Companytype =driver.findElement(By.xpath(genericFun.getKeyValue("createcompany_companytype")));
	     Select sel=new Select(Companytype);
		 sel.selectByValue(genericFun.getKeyValue1("createcompany_companytype"));
		*/ 
		 Thread.sleep(1000);
		 
		  //STEP 10. Select Company subtype
		 
		 SeleniumOperations.selectText(genericFun.getKeyValue("createcompany_companysubtype"),genericFun.getKeyValue1("createcompany_companysubtype"));
     /*   WebElement Companysubtype=driver.findElement(By.xpath(genericFun.getKeyValue("createcompany_companysubtype")));
         Select sel1=new Select (Companysubtype);
         sel1.selectByValue(genericFun.getKeyValue1("createcompany_companysubtype"));
      */   
         Thread.sleep(1000);
   	  //STEP 11. Select Address
         
         SeleniumOperations.setText(genericFun.getKeyValue("createcompany_address"),genericFun.getKeyValue1("createcompany_address"));
	//	WebElement Address=driver.findElement(By.xpath(genericFun.getKeyValue("createcompany_address")));
	//	Address.sendKeys(genericFun.getKeyValue1("createcompany_address"));
		
		 Thread.sleep(1000);
		  //STEP 12. Enter valid Phone number
		 
		 SeleniumOperations.setText(genericFun.getKeyValue("createcompany_phone"),genericFun.getKeyValue1("createcompany_phone"));
		// WebElement Phone=driver.findElement(By.xpath(genericFun.getKeyValue("createcompany_phone")));
	    // Phone.sendKeys(genericFun.getKeyValue1("createcompany_phone"));
		
		 Thread.sleep(1000);
		  //STEP 13. Enter valid Email id
		 
		 SeleniumOperations.setText(genericFun.getKeyValue("createcompany_email"),genericFun.getKeyValue1("createcompany_email"));
		// WebElement Email=driver.findElement(By.xpath(genericFun.getKeyValue("createcompany_email")));
		 //Email.sendKeys(genericFun.getKeyValue1("createcompany_email"));
		
		 Thread.sleep(1000);
		
		 //STEP 14. Enter valid Pan number
		 SeleniumOperations.setText(genericFun.getKeyValue("createcompany_pandetails"),genericFun.getKeyValue1("createcompany_pandetails"));
		 
		// WebElement Pan=driver.findElement(By.xpath(genericFun.getKeyValue("createcompany_pandetails")));
		 //Pan.sendKeys(genericFun.getKeyValue1("createcompany_pandetails"));
		
		 Thread.sleep(1000);
		//STEP 15. Enter valid Tin number
		 SeleniumOperations.setText(genericFun.getKeyValue("createcompany_tindetails"),genericFun.getKeyValue1("createcompany_tindetails"));
		 //WebElement Tin=driver.findElement(By.xpath(genericFun.getKeyValue("createcompany_tindetails")));
		 //Tin.sendKeys(genericFun.getKeyValue1("createcompany_tindetails"));
		 
		 Thread.sleep(1000);
		 //STEP 16. Enter valid mobile number
		 SeleniumOperations.setText(genericFun.getKeyValue("createcompany_mobile"), genericFun.getKeyValue1("createcompany_mobile"));
		 
		// WebElement Mobile=driver.findElement(By.xpath(genericFun.getKeyValue("createcompany_mobile")));
		 //Mobile.sendKeys(genericFun.getKeyValue1("createcompany_mobile"));
		 
		 Thread.sleep(1000);
		 
		 //STEP 17. Enter valid website
		 
		 SeleniumOperations.setText(genericFun.getKeyValue("createcompany_website"),genericFun.getKeyValue1("createcompany_website"));
		// WebElement Website=driver.findElement(By.xpath(genericFun.getKeyValue("createcompany_website")));
		 //Website.sendKeys(genericFun.getKeyValue1("createcompany_website"));
		 
		 Thread.sleep(1000);
		 
		 //STEP 18. Select country
		 
		 SeleniumOperations.selectText(genericFun.getKeyValue("createcompany_country"),genericFun.getKeyValue1("createcompany_country"));
	/*	 WebElement Country =driver.findElement(By.xpath(genericFun.getKeyValue("createcompany_country")));
		 Select sel3=new Select(Country);
         sel3.selectByValue(genericFun.getKeyValue1("createcompany_country"));
       */  
         Thread.sleep(1000);
         // STEP 19. Select State
         
         SeleniumOperations.selectText(genericFun.getKeyValue("createcompany_state"),genericFun.getKeyValue1("createcompany_state"));
       /*  WebElement State=driver.findElement(By.xpath(genericFun.getKeyValue("createcompany_state")));
         Select sel4=new Select (State);
         sel4.selectByValue(genericFun.getKeyValue1("createcompany_state"));
        */ 
         Thread.sleep(1000);
         //STEP 20. Select City
         
         SeleniumOperations.selectText(genericFun.getKeyValue("createcompany_city"), genericFun.getKeyValue1("createcompany_city"));
       /*  WebElement City=driver.findElement(By.xpath(genericFun.getKeyValue("createcompany_city")));
         Select sel5=new Select (City);
         sel5.selectByValue(genericFun.getKeyValue1("createcompany_city"));
       */  
         Thread.sleep(1000);
         //STEP 21. Enter number of employees
         SeleniumOperations.setText(genericFun.getKeyValue("createcompany_totalemployee"), genericFun.getKeyValue1("createcompany_totalemployee"));
        // WebElement TotalEmp=driver.findElement(By.xpath(genericFun.getKeyValue("createcompany_totalemployee")));
         //TotalEmp.sendKeys(genericFun.getKeyValue1("createcompany_totalemployee"));
         
         Thread.sleep(1000);
		// STEP 22. Click save button
         
         SeleniumOperations.clickButton(genericFun.getKeyValue("createcompany_savebutton"));
	/*	WebElement Save=driver.findElement(By.xpath(genericFun.getKeyValue("createcompany_savebutton")));
		Save.click();  */
		
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
