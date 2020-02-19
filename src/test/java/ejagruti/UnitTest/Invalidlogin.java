package ejagruti.UnitTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ejagruti.gfl.GenericFunctions;
import ejagruti.gfl.SeleniumOperations;

public class Invalidlogin {
	
	public static void main(String[]args){

		//STEP 1. Launch Application
		GenericFunctions genericFun = new GenericFunctions();
		
		SeleniumOperations.SetProperty(genericFun.getKeyValue1("createcompany_setproperty"), genericFun.getKeyValue1("createcompany_property"));
		/*	System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\DRIVERS\\chromedriver.exe");
			 WebDriver driver=new ChromeDriver(); 
			 driver.navigate().to("http://localhost:90/finsys/login.html"); 
			 driver.manage().window().maximize();  */
		 WebDriver driver=new ChromeDriver(); 
		 
		 SeleniumOperations.launchUrl( genericFun.getKeyValue1("createcompany_url"));
			 
			//STEP 2.Enter Invalid username
		 
		 SeleniumOperations.setText(genericFun.getKeyValue("createcompany_user"),genericFun.getKeyValue1("createcompany_username"));
			/* WebElement username=driver.findElement(By.xpath("//*[@id=\'mainwindow\']/center/form/div[2]/div[2]/div[1]/span/input[1]")); 
			 username.sendKeys("samiksha");  */
			
			//STEP 3.Enter Invalid password
		 
		 SeleniumOperations.setText(genericFun.getKeyValue("createcompany_pass"),genericFun.getKeyValue1("createcompany_password"));	
		/*	WebElement password=driver.findElement(By.xpath("//*[@id=\'mainwindow\']/center/form/div[2]/div[2]/div[2]/span/input[1]"));
			password.sendKeys("password");  */
			
			//Click on login button
		 
		 SeleniumOperations.clickButton(genericFun.getKeyValue("createcompany_login"));	
		/*	WebElement login=driver.findElement(By.xpath("//*[@id=\'mainwindow\']/center/form/div[2]/div[2]/div[4]/a"));
			login.click(); */
			
			
			//Error Message should be displayed
			/*String url = driver.getCurrentUrl();

			if (url.equals("http://localhost:90/finsys/login.html")){
			System.out.println("Login Successful – Passed");
			}
			else {
			System.out.println("Please Enter Valid Username or Password!!");
			}*/
			driver.close();
			
			
			}
			
			
				
	}			

