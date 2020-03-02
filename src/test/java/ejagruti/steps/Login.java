package ejagruti.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ejagruti.gfl.SeleniumOperations;

public class Login {
	
	
	
		
@When("^user opens the \"([^\"]*)\" browser with \"([^\"]*)\"$")
	public void OpenBrowser(String browsername,String exepath) 
	{
	try {
       SeleniumOperations.SetProperty(browsername,exepath);
	   // System.out.println( "When user opens the \"Chrome\" browser");
       String op="Expected: user should able to open:"+browsername+"src\\test\\resources\\DRIVERS\\chromedriver.exe+"+",Actual:Browser opens successfuly,Exception :NA";
       System.out.println("expected: Brouser should open"+" "+"actual:Brouser opens successfuly");
	}
       catch(Exception ex)
		{
		  System.out.println(ex.getMessage());
		  
		}
	}
	
    @And ("^user enters the url \"(.*)\"$")
	public void EnterUrl(String url)
	{
    	
    	try {
    	SeleniumOperations.launchUrl(url);
	//System.out.println(" And user enters the url \"http://localhost:90/finsys\"");
    	String op1="Expected:User should able to Launch the URL:"+url+",Actual:Launch URL Successfully,Exception:NA";
    	System.out.println(op1);
    	
    	}
    	catch(Exception ex)
		{
			String op1="Expected:User should able to Launch the URL:"+url+",Actual:Failed to Launch URL,Exception:"+ex.getMessage();
	    	System.out.println(op1);
		  
		}
	}
	
	@When ("^user enters \"(.*)\" as username$")
	    public void EnterUsername(String username)
   {
		try {
		SeleniumOperations.setText("//input[@placeholder='Username']", username) ;
   	//System.out.println( "When user enters \"dummyfm\" as username");
		String op1="Expected:User should able to enter username:"+username+",Actual:User enters username successfully,Exception:NA";
		System.out.println(op1);
		}
		catch(Exception ex)
		{
			String op1="Expected:User should able to enter username:"+username+",Actual:Failed to enter usernname,Exception:"+ex.getMessage();
			System.out.println(op1);
		  
		}
    }
    
      @And ("^user enters \"(.*)\" as password$")
    public void EnterPassword(String password)
    {
    	  try {
    	 SeleniumOperations.setText("//input[@placeholder='Password']", password);
   //System.out.println( "And user enters \"passw0rd\" as password");
    	 String op3="Expected: User should able to enter password:"+password+", Actual: User enters password successfully,Exception:NA";
    	 System.out.println(op3);
    	  }
    	  catch(Exception ex)
  		{
    		  String op3="Expected: User should able to enter password:"+password+", Actual: Failed to enter password,Exception:"+ex.getMessage();
    	    	 System.out.println(op3);
  		  
  		}
    	  
    }
    
   @And ("^user clicks on login button$")
   public void ClickButton()
    {
	   try {
	   SeleniumOperations.clickButton("//a[@onclick='return ValidateLogin()']");
	   boolean isLoggedInFailed = SeleniumOperations.IsElementExists("//div[@id='error']");
	   if(isLoggedInFailed)
		   throw new Exception("Login failed because username or password was invalid");
	   
	   String op4="Expected: User should able to click button:"+", Actual:User clicked button successfully,Exception:NA";
    	System.out.println("op4");
	   }
	   catch(Exception ex)
		{
	String op4="Expected:User should able to click button:"+", Actual:Falied to click login button,Exception:"+ex.getMessage();
		  System.out.println(op4);
		}
   }
    
    
   @Given("^user is on the application login page$")
   public void user_is_on_the_application_login_page() throws Throwable {
       // Write code here that turns the phrase above into concrete actions
       //throw new PendingException();
   }

   @Then("^user is on the application home page$")
   
   public void user_is_on_the_application_home_page() throws Throwable {
       // Write code here that turns the phrase above into concrete actions
       //throw new PendingException();
   }
   
   @And("^user gets the message starting with \"([^\"]*)\" on the top$")
   public void user_gets_the_message_starting_with_on_the_top(String arg1) throws Throwable {
       // Write code here that turns the phrase above into concrete actions
       //throw new PendingException();
	   //System.out.println("test");
   }
}
