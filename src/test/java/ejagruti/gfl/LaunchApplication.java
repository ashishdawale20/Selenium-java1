package ejagruti.gfl;

import java.awt.Desktop.Action;
import java.awt.List;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;  
  
public class LaunchApplication {   
private static WebElement target;

public static void main(String[]args){
	
	
	
	

	//relative path
     System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\DRIVERS\\chromedriver.exe");  
		
	 WebDriver driver=new ChromeDriver();  
	 
	 driver.navigate().to("http://localhost:90/finsys/seleniumtask.htm"); 
	 driver.manage().window().maximize();  

     //TEXTBOX
     WebElement objlink1= driver.findElement(By.linkText("Text Box"));     
     objlink1.click();
     WebElement objlink2=driver.findElement(By.id("firstval"));
     objlink2.sendKeys("samiksha");
     
     //CLICK ON BUTTON
     WebElement objlink=driver.findElement(By.linkText("Button"));
     objlink.click();
     WebElement obj=driver.findElement(By.name("ejagruti"));
     obj.click();
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
     //DOUBLE CLICK ON BUTTON
      WebElement objlink3=driver.findElement(By.linkText("Button (Double Click)"));
      objlink3.click();
      WebElement objlink4=driver.findElement(By.xpath("//*[@id='second']/input"));
      Actions action = new Actions(driver).doubleClick(objlink4);
      action.build().perform();
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
     
     
     //MOUSE HOVER ACTION
    WebElement objlink5=driver.findElement(By.linkText("Mouse Hover Action"));
    objlink5.click();
    try
    {
    WebElement objlink6=driver.findElement(By.className("color"));
    Actions action1=new Actions(driver).moveToElement(objlink6);
	action1.moveToElement(objlink6).perform(); 
    }
    catch(Exception ex) {
    	
    }
//LABEL
    WebElement objlink7=driver.findElement(By.linkText("Label"));
     objlink7.click();
     WebElement objlink8=driver.findElement(By.className("colorful"));
     objlink8.sendKeys("9");
   
     //RADIO BUTTON
     WebElement objlink9 =driver.findElement(By.linkText("RadioButton"));
     objlink9.click();
     WebElement option1 =driver.findElement(By.xpath("//*[@id=\'second\']/input[2]"));
     option1.click();
   
     //CHECKBOX
     WebElement objlink10=driver.findElement(By.linkText("CheckBox"));
     objlink10.click();
     WebElement objlink11=driver.findElement(By.name("2w"));
     objlink11.click();
     
     //TEXTAREA
     WebElement objlink12=driver.findElement(By.linkText("TextArea"));
     objlink12.click();
     WebElement objlink13=driver.findElement(By.xpath("//*[@id=\'second\']/div/textarea"));
     objlink13.sendKeys("Company Name:eJagruti Educational Services!!!\n" + 
     		"Location: Motiram Nagar Warje\n" + 
     		"City:Pune-411041\n");
  
     //DROPDOWN
     WebElement objlink14=driver.findElement(By.linkText("DropDown"));
     objlink14.click();
     try {
     WebElement objlink15=driver.findElement(By.name("language"));
     Select sel=new Select(objlink15);
	 sel.selectByIndex(11);
     }
     
     catch(Exception Ex) {
    	 
     }
     //UNORDERED LIST
	 WebElement objlink16=driver.findElement(By.linkText("Unordered List"));
	 objlink16.click();
	 WebElement objlink17=driver.findElement(By.tagName("ul"));
	 java.util.List<WebElement> lis = objlink17.findElements(By.tagName("li"));
	 for(int i=0; i<lis.size();i++)
	 {
		 System.out.println(lis.get(i).getText());
	 }
	 
	
	 //TABLE
	/* WebElement objlink18=driver.findElement(By.linkText("Table"));
	 objlink18.click();
	 
	 WebElement htmlTable = driver.findElement(By.tagName("table"));
	 java.util.List<WebElement> TRs = htmlTable.findElements(By.tagName("tr"));
	 for(int i =1;i<TRs.size();i++)
	 {
		java.util.List<WebElement> th = TRs.get(i).findElements(By.tagName("td"));
		System.out.println(th.get(0).getText());
		System.out.println(th.get(1));
	 }
	 */
	 //TEXT BOXEX
	 WebElement objlink20=driver.findElement(By.linkText("Text Boxex"));
	 objlink20.click();
	 WebElement objlink21=driver.findElement(By.id("firstval"));
	objlink21.sendKeys("samiksha");
	
	


}
	
}
	                                                                                                                                                                        



