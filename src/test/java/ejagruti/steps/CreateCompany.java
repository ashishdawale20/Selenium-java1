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


public class CreateCompany {
	
	
	

	@And("^user clicks  Company$")
	public void user_clicks_Company() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		 SeleniumOperations.clickButton("//span[@class='tree-hit tree-collapsed']");
		 HTMLReportGenerator.StepDetails("pass", "user clicks  Company", "Expected:User should able to click Company,Actual:User clicked Company successfully");
		 //String op1="Expected:User should able to click Company button:"+",Actual:User is able to click button Successfully,Exception:NA";
	    	//System.out.println(op1);
		
		}
		catch(Exception ex)
		{
			 HTMLReportGenerator.StepDetails("Fail", "user clicks  Company", "Expected:User should able to click Company,Actual:Failed to clicked Company ");
			//String op1="Expected:User should able to Launch the URL:"+",Actual:Failed to click Company button,Exception:ex"+ex.getMessage();
	    	//System.out.println(op1);
		  
		}
	}

	@And("^user clicks  Manage Company$")
	public void user_clicks_Manage_Company() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		 SeleniumOperations.clickButton("//a[@title='Manage Company']");
		 HTMLReportGenerator.StepDetails("pass", "user clicks Manage Company", "Expected:User should able to click Manage Company,Actual:User clicked Manage Company successfully");
		// String op1="Expected:User should able to click Manage Company:"+",Actual:User is able to click Manage Company Successfully,Exception:NA";
	    	//System.out.println(op1);
		 
		}
		catch(Exception ex)
		{
			 HTMLReportGenerator.StepDetails("Fail", "user clicks Manage Company", "Expected:User should able to click Manage Company,Actual:Failed to clicked Manage Company ");
			//String op1="Expected:User should able to click Manage Company:"+",Actual:Flied to click Manage Company ,Exception:"+ex.getMessage();
	    	//System.out.println(op1);
		}
	}
	@And("^user clicks New button$")
	public void user_clicks_New_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
		SeleniumOperations.switchTo("actionid");
		 SeleniumOperations.clickButton("//a[@onclick='newItem()']");
		 HTMLReportGenerator.StepDetails("pass", "user clicks New button", "Expected:User should able to click New button,Actual:User clicked New button successfully ");
		// String op1="Expected:User should able to click New button:"+",Actual:User clicked New button Successfully,Exception:NA";
	    	//System.out.println(op1);
		}
		catch(Exception ex)
		{
			HTMLReportGenerator.StepDetails("Fail", "user clicks New button", "Expected:User should able to click New button,Actual:Failed to clicked New button ");
			//String op1="Expected:User should able to click Manage Company:"+",Actual:Falied to click New button ,Exception:"+ex.getMessage();
	    	//System.out.println(op1);
		  
		}
	}
	

	@And("^user enters \"([^\"]*)\" as Company Name$")
	public void user_enters_as_Company_Name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
		 SeleniumOperations.setText("//input[@name='name']",arg1);
		 HTMLReportGenerator.StepDetails("pass", "user enters CompanyName", "Expected:User should able to enter CompanyName,Actual:User enters CompanyName successfully ");
		 
		// String op1="Expected:User should able to enter Company name:"+arg1+",Actual:User entered Company name Successfully,Exception:NA";
	    	//System.out.println(op1);
		}
		catch(Exception ex)
		{
			 HTMLReportGenerator.StepDetails("Fail", "user enters CompanyName", "Expected:User should able to enter CompanyName,Actual:Fail to enters CompanyName");
			// String op1="Expected:User should able to enter Company name:"+arg1+",Actual:Fail to enter Company name ,Exception:NA"+ex.getMessage();
		    //	System.out.println(op1);
		  
		}
	}

	
        
	    @And ("^user enters \"(.*)\" as Company Type$")
	    public void EnterCompanyType(String value)
	    {
	    	try {
	    	//System.out.println("And user enters \"Manufacturing\" as Company Type");
	    	SeleniumOperations.setText("//select[@id='companytype']", value);
	    	 HTMLReportGenerator.StepDetails("pass", "user enters CompanyType", "Expected:User should able to enter CompanyType,Actual:User enters CompanyType successfully ");
	    	//String op1="Expected:User should able to enter Company Type :"+value+",Actual:user entered Company Type Successfully,Exception:NA";
	    	//System.out.println(op1);
	    	}
	    	catch(Exception ex)
			{
	    		 HTMLReportGenerator.StepDetails("Fail", "user enters CompanyType", "Expected:User should able to enter CompanyType,Actual:Fail to enter CompanyType");
	    		//String op1="Expected:User should able to enter Company Type :"+value+",Actual:Failed entered Company Type,Exception:"+ex.getMessage();
		    	//System.out.println(op1);
			}
	    }
	    
	   @And ("^user enters \"(.*)\" as Company Subtype$")
	    public void EnterCompanySubtype(String value)
	    {
		   try {
	    	//System.out.println("And user enters \"Automobile\" as Company Subtype");
		   SeleniumOperations.setText("//select[@name='subtype']", value);
		   HTMLReportGenerator.StepDetails("pass", "user enters CompanySubType", "Expected:User should able to enter CompanySubType,Actual:User enters CompanySubType successfully ");
		   //String op1="Expected:User should able to enter Company SubType :"+value+",Actual:Failed entered Company SubType,Exception:NA";
		   }
		   catch(Exception ex)
			{
			   HTMLReportGenerator.StepDetails("Fail", "user enters CompanySubType", "Expected:User should able to enter CompanySubType,Actual:Fail to enter CompanySubType");
			  // String op1="Expected:User should able to enter Company SubType :"+value+",Actual:Failed entered Company SubsType,Exception:"+ex.getMessage();
		    	//System.out.println(op1);
			  
			}
	    }
	    
	   @And ("^user enters \"(.*)\" as Address$")
	    public void EnterAddress(String value)
	    {
		   try {
	    	//System.out.println("And user enters \"Hinjewadi phase1\" as Address");
		   SeleniumOperations.setText("//textarea[@class='textbox-text validatebox-text textbox-prompt']", value);
		   HTMLReportGenerator.StepDetails("pass", "user enters Address", "Expected:User should able to enter Address,Actual:User enters Address successfully ");
		   //String op1="Expected:User should able to enter Address :"+value+",Actual:User is able to enter Address,Exception:NA";
	    	//System.out.println(op1);
		   }
		   catch(Exception ex)
			{
			   HTMLReportGenerator.StepDetails("Fail", "user enters Address", "Expected:User should able to enter Address,Actual:Failed to enter Address");
			   //String op1="Expected:User should able to enter Address :"+value+",Actual:Failed to  enter Address,Exception:"+ex.getMessage();
		    	//System.out.println(op1);
			  
			}
	    }
	    
	    @And ("^user enters \"(.*)\" as Phone$")
	    public void EnterPhone(String value) 
	    {
	    	try {
	    	//System.out.println("And user enters \"7218710933\" as Phone");
	    	SeleniumOperations.setText("//input[@class='textbox-text validatebox-text textbox-prompt']", value);
	    	HTMLReportGenerator.StepDetails("pass", "user enters Phone", "Expected:User should able to enter Phone ,Actual:user enters phone successfully");
	    	//String op1="Expected:User should able to enter phone number:"+value+",Actual:User is able to enter phone number,Exception:NA";
	    	//System.out.println(op1);
	    	}
	    	catch(Exception ex)
			{
	    		 HTMLReportGenerator.StepDetails("Fail", "user enters Phone", "Expected:User should able to enter Phone,Actual:Failed to enter phone");
	    		//String op1="Expected:User should able to enter phone number:"+value+",Actual:Failed to enter phone number,Exception:"+ex.getMessage();
		    	//System.out.println(op1);
			  
			}
	    }
	    
	   @And ("^user enters \"(.*)\" as Email$")
	    public void EnterEmail(String value)
	    {
		   try {
	    	//System.out.println("And user enters \"samiksha@gmail.com\" as Email");
		   SeleniumOperations.setText("//input[@name='email']", value);
		   HTMLReportGenerator.StepDetails("Pass", "user enters Email", "Expected:User should able to enter Email,Actual:User enters Email successfully");
		   //String op1="Expected:User should able to enter email:"+value+",Actual:User is able to enter email,Exception:NA";
	    	//System.out.println(op1);
		   }
		   catch(Exception ex)
			{
			   HTMLReportGenerator.StepDetails("Fail", "user enters Email", "Expected:User should able to enter Email,Actual:Fail to enter Email");
			   //String op1="Expected:User should able to enter phone number:"+value+",Actual:Falied to enter Address,Exception:"+ex.getMessage();
		    	//System.out.println(op1);
			  
			}
	    }
	   @And ("^user enters \"(.*)\" as Pan Details$")
	     public void EnterPan(String value)
	     {
		   try {
	    	// System.out.println("And user enters \"HRGH34565H\" as Pan Details");
		   SeleniumOperations.setText("//input[@name='pan']", value);
		   HTMLReportGenerator.StepDetails("Pass", "user enters Pan Details", "Expected:User should able to enter Pan details,Actual:User enters Pan Details successfully");
		  // String op1="Expected:User should able to enter Pan details:"+value+",Actual:User is able to enter pan details,Exception:NA";
	    	//System.out.println(op1);
		   }
		   catch(Exception ex)
			{
			   HTMLReportGenerator.StepDetails("Fail", "user enters Pan Details", "Expected:User should able to enter Pan Details,Actual:Fail to enter Pan Details ");
			   //String op1="Expected:User should able to enter Pan details:"+value+",Actual:Faild to enter pan details,Exception:"+ex.getMessage();
		    	//System.out.println(op1);
			  
			}
	     }
	    @And ("^User enters \"(.*)\" as Tin Details$")
	    public void EnterTin(String value) 
	    {
	    	try {
	    	//System.out.println("And User enters \"4565768697\" as Tin Details" );
	    	SeleniumOperations.setText( "//input[@name='tin']", value);
	    	HTMLReportGenerator.StepDetails("Pass", "user enters Tin  Details", "Expected:User should able to enter Tin details,Actual:User enters Tin Details successfully");
	    	//String op1="Expected:User should able to enter Tin details:"+value+",Actual:User is able to enter Tin details,Exception:NA";
	    	//System.out.println(op1);
	    	}
	    	catch(Exception ex)
			{
	    		HTMLReportGenerator.StepDetails("Fail", "user enters Tin Details", "Expected:User should able to enter Tin Details,Actual:Fail to enter Tin Details ");
	    		//String op1="Expected:User should able to enter Tin details:"+value+",Actual:Failed to enter Tin details,Exception:"+ex.getMessage();
		    	//System.out.println(op1);
			  
			}
	    }
	    
	    @And ("^user enters \"(.*)\" as Mobile$")
	    public void EnterMobile(String value)
	    {
	    	try {
	    	//System.out.println("And user enters \"6756444498\" as Mobile");
	    		
	    	SeleniumOperations.setText("//input[@class='textbox-text validatebox-text textbox-prompt']", value);
	    	 HTMLReportGenerator.StepDetails("Pass", "user enters Mobile", "Expected:User should able to enter Mobile,Actual:User enters Mobile successfully");
	    	//String op1="Expected:User should able to enter Mobile:"+value+",Actual:User is able to enter Mobile,Exception:NA";
	    	//System.out.println(op1);
	    	}
	    	catch(Exception ex)
			{
	    		HTMLReportGenerator.StepDetails("Fail", "user enters Mobile", "Expected:User should able to enter Mobile,Actual:Fail to enter Mobile");
	    		//String op1="Expected:User should able to enter Mobile:"+value+",Actual:Failed to enter Mobile,Exception:"+ex.getMessage();
		    	//System.out.println(op1);
			}
	    }
	    
	    @And ("^user enters \"(.*)\" as WebSite$")
	    public void EnterWebsite(String value) 
	    {
	    	try {
	    	//System.out.println("And user enters \"mycompany.com\" as WebSite");
	    	SeleniumOperations.setText("//input[@name='website']", value);
	    	 HTMLReportGenerator.StepDetails("Pass", "user enters WebSite", "Expected:User should able to enter WebSite,Actual:User enters WebSite successfully");
	    	//String op1="Expected:User should able to enter Website:"+value+",Actual:User is able to enter Website,Exception:NA";
	    	//System.out.println(op1);
	    	}
	    	catch(Exception ex)
			{
	    		HTMLReportGenerator.StepDetails("Fail", "user enters WebSite", "Expected:User should able to enter WebSite,Actual:Fail to enter WebSite");
	    		//String op1="Expected:User should able to enter Website:"+value+",Actual:Falied to enter Website,Exception:"+ex.getMessage();
		    	//System.out.println(op1);
			  
			}
	    }
	    
	    @And ("^user enters \"(.*)\" as Country$")
	    public void EnterCountry(String value)
	    {
	    	try {
	    	//System.out.println("And user enters \"IN\" as Country");
	    	SeleniumOperations.selectText("//select[@name='countryname']", value);
	    	HTMLReportGenerator.StepDetails("Pass", "user enters Country", "Expected:User should able to enter Country,Actual:User enters Country successfully");
	    	//String op1="Expected:User should able to enter Country:"+value+",Actual:User is able to enter Country,Exception:NA";
	    	//System.out.println(op1);
	    	}
	    	catch(Exception ex)
			{
	    		HTMLReportGenerator.StepDetails("Fail", "user enters Country", "Expected:User should able to enter Country,Actual:Fail to enter Country");
	    		//String op1="Expected:User should able to enter Country:"+value+",Actual:Falied to enter Country,Exception:"+ex.getMessage();
		    	//System.out.println(op1);
			  
			}
	    }
	    @And ("^user enters \"(.*)\" as State$")
	    public void EnterState(String value)
	    {
	    	try {
	    	//System.out.println("And user enters \"MAHARASHTRA\" as State");
	    	SeleniumOperations.selectText("//select[@name='state']", value);
	    	HTMLReportGenerator.StepDetails("Pass", "user enters State", "Expected:User should able to enter State,Actual:User enters State successfully");
	    	//String op1="Expected:User should able to enter State:"+value+",Actual:User is able to enter State,Exception:NA";
	    	//System.out.println(op1);
	    	}
	    	catch(Exception ex)
			{
	    		HTMLReportGenerator.StepDetails("Fail", "user enters State", "Expected:User should able to enter State,Actual:Fail to enter State");
	    		//String op1="Expected:User should able to enter State:"+value+",Actual:Failed to enter State,Exception:"+ex.getMessage();
		    	//System.out.println(op1);
			  
			}
	    }
	    
	    @And ("^user enters \"(.*)\" as City$")
	    public void EnterCity(String value)
	    {
	    	try {
	    	//System.out.println("And user enters \"PUNE\" as City");
	    	SeleniumOperations.selectText("//select[@name='city']", value);
	    	HTMLReportGenerator.StepDetails("Pass", "user enters City", "Expected:User should able to enter CityState,Actual:User enters City successfully");
	    	//String op1="Expected:User should able to enter City:"+value+",Actual:User is able to enter City,Exception:NA";
	    	//System.out.println(op1);
	    	}
	    	catch(Exception ex)
			{
	    		HTMLReportGenerator.StepDetails("Fail", "user enters City", "Expected:User should able to enter City,Actual:Fail to enter City");
	    		//String op1="Expected:User should able to enter City:"+value+",Actual:Failed to enter City,Exception:"+ex.getMessage();
		    	//System.out.println(op1);
			  
			}
	    }
	    @And("^user enters \"([^\"]*)\" as Total Employee$")
		public void user_enters_as_Total_Employee(String arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			try {
			 SeleniumOperations.setText("//input[@class='textbox-text validatebox-text textbox-prompt']", arg1);
			 HTMLReportGenerator.StepDetails("Pass", "user enters Total Employee", "Expected:User should able to enter Total Employee,Actual:User enters Total Employee successfully");
			 //String op1="Expected:User should able to enter Total number of employees:"+arg1+",Actual:user entered total number of Employees  Successfully,Exception:NA";
		    	//System.out.println(op1);
			}
			catch(Exception ex)
			{
				HTMLReportGenerator.StepDetails("Fail", "user enters Total Employee", "Expected:User should able to enter Total Employee,Actual:Fail to enter Total Employee");
				// String op1="Expected:User should able to enter Total number of employees:"+arg1+",Actual:Failed to enter total number of Employees ,Exception:"+ex.getMessage();
			    	//System.out.println(op1);
			}
		}
	    
	    @And ("^user clicks on Save$")
	    public void user_clicks_on_Save()throws Throwable{
	    	try {
	    	SeleniumOperations.clickButton("//a[@onclick='save1(this)']");
	    	
	    	SeleniumOperations.popup();
	    	HTMLReportGenerator.StepDetails("Pass", "user Clicks save Button", "Expected:User should able to Click save Button,Actual:User Clicked Save Button successfully");
	    	 //String op1="Expected:User should able to click Save button:"+",Actual:User is able click Save button successfullu,Exception:NA";
		    	//System.out.println(op1);
	    	
	    	}
	    	catch(Exception ex)
			{
	    		HTMLReportGenerator.StepDetails("Fail", "user Clicks save Button", "Expected:User should able to Click save Button,Actual:Failed to Clicked Save Button");
	    		//String op1="Expected:User should able to click Save button:"+",Actual:Failed to  click Save button successfullu,Exception:"+ex.getMessage();
		    	//System.out.println(op1);
	    	
			  
			}
	    	
	    }
	    
	    @Then ("^user can see Company is Created$")
	    public void user_can_see_Company_is_Created()throws Throwable{
	    	try {
	    		HTMLReportGenerator.StepDetails("Pass", "user can see Company is Created", "Expected:User should able to see company is created,Actual:User saw company created successfully");
	    	}
	    	catch(Exception ex)
	    	{
	    		HTMLReportGenerator.StepDetails("Fail", "user can see Company is Created", "Expected:User should able to see company is created,Actual:failed to see company created");
	    	}
	    }

	    
	}
