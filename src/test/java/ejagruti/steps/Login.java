package ejagruti.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ejagruti.gfl.SeleniumOperations;

public class Login {

	

@When("^user opens the \"([^\"]*)\" browser with \"([^\"]*)\"$")
	public void OpenBrowser(String browsername,String exepath) 
	{
   SeleniumOperations.SetProperty(browsername,exepath);
	   // System.out.println( "When user opens the \"Chrome\" browser");	
	}
	
    @And ("^user enters the url \"(.*)\"$")
	public void EnterUrl(String url)
	{
    	SeleniumOperations.launchUrl(url);
	//System.out.println(" And user enters the url \"http://localhost:90/finsys\"");
	}
	
	@When ("^user enters \"(.*)\" as username$")
	    public void EnterUsername(String username)
   {
   	System.out.println( "When user enters \"dummyfm\" as username");
    }
    
      @And ("^user enters \"(.*)\" as password$")
    public void EnterPassword(String password)
    {
   	System.out.println( "And user enters \"passw0rd\" as password");
    }
    
   @And ("^user clicks on login button$")
   public void ClickButton()
    {
    	System.out.println();
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
   
   @Then("^user gets the message starting with \"([^\"]*)\" on the top$")
   public void user_gets_the_message_starting_with_on_the_top(String arg1) throws Throwable {
       // Write code here that turns the phrase above into concrete actions
       //throw new PendingException();
	   System.out.println("test");
   }

    
    
    
   }
