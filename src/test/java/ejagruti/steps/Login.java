package ejagruti.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ejagruti.gfl.HTMLReportGenerator;
import ejagruti.gfl.SeleniumOperations;

public class Login {
	
	
	

	
		
@When("^user opens the \"([^\"]*)\" browser with \"([^\"]*)\"$")
	public void OpenBrowser(String browsername,String exepath) 
	{
	try {
		
		//HTMLReportGenerator reportGenerator = new HTMLReportGenerator("D:\\HTMLReport\\manish.html", "ejagruti","D:\\HTMLReport\\Screenshots");
		HTMLReportGenerator.TestSuiteStart("D:\\HTMLReport\\manish.html", "Rahul");
		
		
       SeleniumOperations.SetProperty(browsername,exepath);
	    System.out.println( "When user opens the \"Chrome\" browser");
       //String op="Expected: user should able to open:"+browsername+"src\\test\\resources\\DRIVERS\\chromedriver.exe+"+",Actual:Browser opens successfuly,Exception :NA";
      // System.out.println("expected: Brouser should open"+" "+"actual:Brouser opens successfuly");
       
       
	}
       catch(Exception ex)
		{
    	   HTMLReportGenerator.StepDetails("fail","User opens the chrome browser", "Expected:User should be on home page, Actual:Failed to open browser");
		  //System.out.println(ex.getMessage());
		  
		}
	}
	
@Given("^user is on the application login page$")
public void user_is_on_the_application_login_page() throws Throwable {
   try {
	   HTMLReportGenerator.TestCaseStart("valid login", "Login Functionality for valid username and password");
	   HTMLReportGenerator.StepDetails("pass", "user is on the application login page", "Expected:User should be on login page, Actual:User is on login page");
   }
   catch(Exception ex) {
	   HTMLReportGenerator.StepDetails("fail","User is on the application login page ", "Expected:User should be on login page, Actual:Failed to access home page");
	   
   }
}



	@And ("^user enters the url \"(.*)\"$")
	public void EnterUrl(String url)
	{
    	
    	try {
    	SeleniumOperations.launchUrl(url);
    	 HTMLReportGenerator.StepDetails("pass", "User enters the URL", "Expected:User should able to enter URL, Actual:Launch URL Successfully");
	//System.out.println(" And user enters the url \"http://localhost:90/finsys\"");
    	//String op1="Expected:User should able to Launch the URL:"+url+",Actual:Launch URL Successfully,Exception:NA";
    	//System.out.println(op1);
    	
    	}
    	catch(Exception ex)
		{
    		 HTMLReportGenerator.StepDetails("fail","User enters the URL", "Expected:User should able to Launch the URL,Actual:Failed to Launch URL");
			//String op1="Expected:User should able to Launch the URL:"+url+",Actual:Failed to Launch URL,Exception:"+ex.getMessage();
	    	//System.out.println(op1);
		  
		}
	}
	
	@When ("^user enters \"(.*)\" as username$")
	    public void EnterUsername(String username)
   {
		try {
		SeleniumOperations.setText("//input[@placeholder='Username']", username) ;
		HTMLReportGenerator.StepDetails("pass", "User enters the Username"," Expected:User should able to enter username,Actual:User enters username successfully");
   	//System.out.println( "When user enters \"dummyfm\" as username");
		//String op1="Expected:User should able to enter username:"+username+",Actual:User enters username successfully,Exception:NA";
		//System.out.println(op1);
		}
		catch(Exception ex)
		{
			 HTMLReportGenerator.StepDetails("fail","User enters the Username", "Expected:User should able to enter username,Actual:Failed to enter usernname");
			//String op1="Expected:User should able to enter username:"+username+",Actual:Failed to enter usernname,Exception:"+ex.getMessage();
			//System.out.println(op1);
		  
		}
    }
    
      @And ("^user enters \"(.*)\" as password$")
    public void EnterPassword(String password)
    {
    	  try {
    	 SeleniumOperations.setText("//input[@placeholder='Password']", password);
    	 HTMLReportGenerator.StepDetails("pass", "User enters the password"," Expected:User should able to enter password,Actual:User enters passsword successfully");
    	 
   //System.out.println( "And user enters \"passw0rd\" as password");
    	// String op3="Expected: User should able to enter password:"+password+", Actual: User enters password successfully,Exception:NA";
    	// System.out.println(op3);
    	  }
    	  catch(Exception ex)
  		{
    		  HTMLReportGenerator.StepDetails("Fail", "User enters the password"," Expected:User should able to enter password,Actual:Failed enters password successfully");
    		  //String op3="Expected: User should able to enter password:"+password+", Actual: Failed to enter password,Exception:"+ex.getMessage();
    	    	// System.out.println(op3);
  		  
  		}
    	  
    }
    
   @And ("^user clicks on login button$")
   public void ClickButton()
    {
	   try {
	   SeleniumOperations.clickButton("//a[@onclick='return ValidateLogin()']");
	   HTMLReportGenerator.StepDetails("pass", "user clicks on login button"," Expected: User should able to click button, Actual:User clicked button successfull");
	   //String op4="Expected: User should able to click button:"+", Actual:User clicked button successfully,Exception:NA";
    	//System.out.println("op4");
	   }
	   catch(Exception ex)
		{
		   HTMLReportGenerator.StepDetails("Fail", "user clicks on login button"," Expected:User should able to click button,Actual:Failed to sclick button");
	//String op4="Expected:User should able to click button:"+", Actual:Falied to click login button,Exception:"+ex.getMessage();
		//  System.out.println(op4);
		}
   }
  
    

   @And("^user gets the message starting with \"([^\"]*)\" on the top$")
   public void user_gets_the_message_starting_with_on_the_top(String arg1) throws Throwable {
	   try {
		   System.out.println("Test end called");
		   HTMLReportGenerator.StepDetails("pass", "user gets the message "," Expected: User should able to get message, Actual:User gets message");
		   HTMLReportGenerator.TestCaseEnd();
	       HTMLReportGenerator.TestSuiteEnd();
	   }
      catch(Exception ex){
    	  HTMLReportGenerator.StepDetails("Fail", "user gets the message"," Expected:User should able to get  message,Actual:Failed to get error message"); 
    	  HTMLReportGenerator.TestCaseEnd();
    	  HTMLReportGenerator.TestSuiteEnd();
      
      
      }
   }
   
   @Then("^user is on the application home page$")
   public void user_is_on_the_application_home_page() throws Throwable {
       // Write code here that turns the phrase above into concrete actions
       //throw new PendingException();
   }

   @Then("^user is on the same login page$")
   public void user_is_on_the_same_login_page() throws Throwable {
       // Write code here that turns the phrase above into concrete actions
       //throw new PendingException();
   }

   @Then("^user gets the message starting with \"([^\"]*)\" on the bottom$")
   public void user_gets_the_message_starting_with_on_the_bottom(String arg1) throws Throwable {
       // Write code here that turns the phrase above into concrete actions
       //throw new PendingException();
   }
}
