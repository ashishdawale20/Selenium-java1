package ejagruti.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class CreateCompany {
	/*@When ("^ user opens the \"(.*)\" browser$")
		public void OpenBrowser(String browsername) 
		{
		     System.out.println( "When user opens the \"firefox\" browser");	
		}
		
	@And ("^user enters the url \"(.*)\"$")
		public void EnterUrl(String url)
		{
			System.out.println(" And user enters the url \"http://localhost:90/finsys\"");
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
	    */
	  @And ("^user enters \"(.*)\" as Company Name&")
	    public void EnterCompanyName(String name)
	    {
	    	System.out.println("And user enters \"MyCompany\" as Company Name");
	    }
        
	    @And ("^user enters \"(.*)\" as Company Type$")
	    public void EnterCompanyType(String value)
	    {
	    	System.out.println("And user enters \"Manufacturing\" as Company Type");
	    }
	    
	   @And ("^user enters \"(.*)\" as Company Subtype$")
	    public void EnterCompanySubtype(String value)
	    {
	    	System.out.println("And user enters \"Automobile\" as Company Subtype");
	    }
	    
	   @And ("^user enters \"(.*)\" as Address$")
	    public void EnterAddress(String value)
	    {
	    	System.out.println("And user enters \"Hinjewadi phase1\" as Address");
	    }
	    
	    @And ("^user enters \"(.*)\" as Phone$")
	    public void EnterPhone(int num) 
	    {
	    	System.out.println("And user enters \"7218710933\" as Phone");
	    }
	    
	   @And ("^user enters \"(.*)\" as Email$")
	    public void EnterEmail(String value)
	    {
	    	System.out.println("And user enters \"samiksha@gmail.com\" as Email");
	    }
	   @And ("^user enters \"(.*)\" as Pan Details$")
	     public void EnterPan(String value)
	     {
	    	 System.out.println("And user enters \"HRGH34565H\" as Pan Details");
	     }
	    @And ("^User enters \"(.*)\" as Tin Details$")
	    public void EnterTin(String value) 
	    {
	    	System.out.println("And User enters \"4565768697\" as Tin Details" );
	    }
	    
	    @And ("^user enters \"(.*)\" as Mobile$")
	    public void EnterMobile(int num)
	    {
	    	System.out.println("And user enters \"6756444498\" as Mobile");
	    }
	    
	    @And ("^user enters \"(.*)\" as WebSite$")
	    public void EnterWebsite(String value) 
	    {
	    	System.out.println("And user enters \"mycompany.com\" as WebSite");
	    }
	    
	    @And ("^user enters \"(.*)\" as Country$")
	    public void EnterCountry(String value)
	    {
	    	System.out.println("And user enters \"IN\" as Country");
	    }
	    @And ("^user enters \"(.*)\" as State$")
	    public void EnterState(String value)
	    {
	    	System.out.println("And user enters \"MAHARASHTRA\" as State");
	    }
	    
	    @And ("^user enters \"(.*)\" as City$")
	    public void EnterCity(String value)
	    {
	    	System.out.println("And user enters \"PUNE\" as City");
	    }
	    @And ("^user enters \"(.*s)\" as Total Employee$")
	    public void EnterTotalemployee(int num)
	    {
	    	System.out.println("And user enters \"2345\" as Total Employee");
	    }
	    
	    
	    
	    
	}
