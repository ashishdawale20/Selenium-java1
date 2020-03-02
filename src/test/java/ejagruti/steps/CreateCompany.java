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


public class CreateCompany {
	
	
	

	@And("^user clicks  Company$")
	public void user_clicks_Company() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		 SeleniumOperations.clickButton("//span[@class='tree-hit tree-collapsed']");
		 String op1="Expected:User should able to click Company button:"+",Actual:User clicked button Successfully,Exception:NA";
	    	System.out.println(op1);
		
		}
		catch(Exception ex)
		{
			String op1="Expected:User should able to Launch the URL:"+",Actual:Failed to click Company button,Exception:ex"+ex.getMessage();
	    	System.out.println(op1);
		  
		}
	}

	@And("^user clicks  Manage Company$")
	public void user_clicks_Manage_Company() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		 SeleniumOperations.clickButton("//a[@title='Manage Company']");
		 String op1="Expected:User should able to click Manage Company:"+",Actual:User clicked Manage Company Successfully,Exception:NA";
	    	System.out.println(op1);
		 
		}
		catch(Exception ex)
		{
			String op1="Expected:User should able to click Manage Company:"+",Actual:Flied to click Manage Company ,Exception:"+ex.getMessage();
	    	System.out.println(op1);
		}
	}
	@And("^user clicks New button$")
	public void user_clicks_New_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
		SeleniumOperations.switchTo("actionid");
		 SeleniumOperations.clickButton("//a[@onclick='newItem()']");
		 String op1="Expected:User should able to click New button:"+",Actual:User clicked New button Successfully,Exception:NA";
	    	System.out.println(op1);
		}
		catch(Exception ex)
		{
			String op1="Expected:User should able to click Manage Company:"+",Actual:Falied to click New button ,Exception:"+ex.getMessage();
	    	System.out.println(op1);
		  
		}
	}
	

	@And("^user enters \"([^\"]*)\" as Company Name$")
	public void user_enters_as_Company_Name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
		 SeleniumOperations.setText("//input[@name='name']",arg1);
		 String op1="Expected:User should able to enter Company name:"+",Actual:User entered Company name Successfully,Exception:NA";
	    	System.out.println(op1);
		}
		catch(Exception ex)
		{
			 String op1="Expected:User should able to enter Company name:"+",Actual:Fail to enter Company name ,Exception:NA"+ex.getMessage();
		    	System.out.println(op1);
		  
		}
	}

	@And("^user enters \"([^\"]*)\" as Total Employee$")
	public void user_enters_as_Total_Employee(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
		 SeleniumOperations.setText("//input[@class='textbox-text validatebox-text textbox-prompt']", arg1);
		 String op1="Expected:User should able to enter Total number of employees:"+",Actual:user entered total number of Employees  Successfully,Exception:NA";
	    	System.out.println(op1);
		}
		catch(Exception ex)
		{
			 String op1="Expected:User should able to enter Total number of employees:"+",Actual:Failed to enter total number of Employees ,Exception:"+ex.getMessage();
		    	System.out.println(op1);
		}
	}


	
	/*  @And ("^user enters \"(.*)\" as Company Name&")
	    public void EnterCompanyName(String name)
	    {
		  try {
	    	//System.out.println("And user enters \"MyCompany\" as Company Name");
		  SeleniumOperations.setText("//input[@name='name']",name);
		  String op1="Expected:User should able to enter Total number of employees:"+",Actual:user entered total number of Employees  Successfully,Exception:NA";
	    	System.out.println(op1);		  }
		  catch(Exception ex)
			{
			  String op1="Expected:User should able to enter Total number of employees:"+",Actual:user entered total number of Employees  Successfully,Exception:NA";
		    	System.out.println(op1);
			}   
	    }*/
        
	    @And ("^user enters \"(.*)\" as Company Type$")
	    public void EnterCompanyType(String value)
	    {
	    	try {
	    	//System.out.println("And user enters \"Manufacturing\" as Company Type");
	    	SeleniumOperations.setText("//select[@id='companytype']", value);
	    	String op1="Expected:User should able to enter Company Type :"+",Actual:user entered Company Type Successfully,Exception:NA";
	    	System.out.println(op1);
	    	}
	    	catch(Exception ex)
			{
	    		String op1="Expected:User should able to enter Company Type :"+",Actual:Failed entered Company Type Successfully,Exception:NA";
		    	System.out.println(op1);
			}
	    }
	    
	   @And ("^user enters \"(.*)\" as Company Subtype$")
	    public void EnterCompanySubtype(String value)
	    {
		   try {
	    	//System.out.println("And user enters \"Automobile\" as Company Subtype");
		   SeleniumOperations.setText("//select[@name='subtype']", value);
		   System.out.println("pass");
		   }
		   catch(Exception ex)
			{
			  System.out.println(ex.getMessage());
			  
			}
	    }
	    
	   @And ("^user enters \"(.*)\" as Address$")
	    public void EnterAddress(String value)
	    {
		   try {
	    	//System.out.println("And user enters \"Hinjewadi phase1\" as Address");
		   SeleniumOperations.setText("//textarea[@class='textbox-text validatebox-text textbox-prompt']", value);
		   System.out.println("pass");
		   }
		   catch(Exception ex)
			{
			  System.out.println(ex.getMessage());
			  
			}
	    }
	    
	    @And ("^user enters \"(.*)\" as Phone$")
	    public void EnterPhone(String value) 
	    {
	    	try {
	    	//System.out.println("And user enters \"7218710933\" as Phone");
	    	SeleniumOperations.setText("//input[@class='textbox-text validatebox-text textbox-prompt']", value);
	    	System.out.println("pass");
	    	}
	    	catch(Exception ex)
			{
			  System.out.println(ex.getMessage());
			  
			}
	    }
	    
	   @And ("^user enters \"(.*)\" as Email$")
	    public void EnterEmail(String value)
	    {
		   try {
	    	//System.out.println("And user enters \"samiksha@gmail.com\" as Email");
		   SeleniumOperations.setText("//input[@name='email']", value);
		   System.out.println("pass");
		   }
		   catch(Exception ex)
			{
			  System.out.println(ex.getMessage());
			  
			}
	    }
	   @And ("^user enters \"(.*)\" as Pan Details$")
	     public void EnterPan(String value)
	     {
		   try {
	    	// System.out.println("And user enters \"HRGH34565H\" as Pan Details");
		   SeleniumOperations.setText("//input[@name='pan']", value);
		   System.out.println("pass");
		   }
		   catch(Exception ex)
			{
			  System.out.println(ex.getMessage());
			  
			}
	     }
	    @And ("^User enters \"(.*)\" as Tin Details$")
	    public void EnterTin(String value) 
	    {
	    	try {
	    	//System.out.println("And User enters \"4565768697\" as Tin Details" );
	    	SeleniumOperations.setText( "//input[@name='tin']", value);
	    	System.out.println("pass");
	    	}
	    	catch(Exception ex)
			{
			  System.out.println(ex.getMessage());
			  
			}
	    }
	    
	    @And ("^user enters \"(.*)\" as Mobile$")
	    public void EnterMobile(String value)
	    {
	    	try {
	    	//System.out.println("And user enters \"6756444498\" as Mobile");
	    	SeleniumOperations.setText("//input[@class='textbox-text validatebox-text textbox-prompt']", value);
	    	System.out.println("pass");
	    	}
	    	catch(Exception ex)
			{
			  System.out.println(ex.getMessage());
			  
			}
	    }
	    
	    @And ("^user enters \"(.*)\" as WebSite$")
	    public void EnterWebsite(String value) 
	    {
	    	try {
	    	//System.out.println("And user enters \"mycompany.com\" as WebSite");
	    	SeleniumOperations.setText("//input[@name='website']", value);
	    	System.out.println("pass");
	    	}
	    	catch(Exception ex)
			{
			  System.out.println(ex.getMessage());
			  
			}
	    }
	    
	    @And ("^user enters \"(.*)\" as Country$")
	    public void EnterCountry(String value)
	    {
	    	try {
	    	//System.out.println("And user enters \"IN\" as Country");
	    	SeleniumOperations.selectText("//select[@name='countryname']", value);
	    	System.out.println("pass");
	    	}
	    	catch(Exception ex)
			{
			  System.out.println(ex.getMessage());
			  
			}
	    }
	    @And ("^user enters \"(.*)\" as State$")
	    public void EnterState(String value)
	    {
	    	try {
	    	//System.out.println("And user enters \"MAHARASHTRA\" as State");
	    	SeleniumOperations.selectText("//select[@name='state']", value);
	    	System.out.println("pass");
	    	}
	    	catch(Exception ex)
			{
			  System.out.println(ex.getMessage());
			  
			}
	    }
	    
	    @And ("^user enters \"(.*)\" as City$")
	    public void EnterCity(String value)
	    {
	    	try {
	    	//System.out.println("And user enters \"PUNE\" as City");
	    	SeleniumOperations.selectText("//select[@name='city']", value);
	    	System.out.println("pass");
	    	}
	    	catch(Exception ex)
			{
			  System.out.println(ex.getMessage());
			  
			}
	    }
	    @And ("^user enters \"(.*s)\" as Total Employee$")
	    public void EnterTotalemployee(String arg1)
	    {
	    	try {
	    	//System.out.println("And user enters \"2345\" as Total Employee");
	    	 SeleniumOperations.setText("//input[@class='textbox-text validatebox-text textbox-prompt']",arg1);
	    	 System.out.println("pass");
	    	}
	    	catch(Exception ex)
			{
			  System.out.println(ex.getMessage());
			  
			}
	    }
	    
	    @And ("^user clicks on Save$")
	    public void user_clicks_on_Save()throws Throwable{
	    	try {
	    	SeleniumOperations.clickButton("//a[@onclick='save1(this)']");
	    	
	    	SeleniumOperations.popup();
	    	
	    	System.out.println("pass");
	    	}
	    	catch(Exception ex)
			{
			  System.out.println(ex.getMessage());
			  
			}
	    	
	    }
	    
	    @Then ("^user can see Company is Created$")
	    public void user_can_see_Company_is_Created()throws Throwable{
	    	
	    }

	    
	}
