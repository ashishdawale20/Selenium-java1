package ejagruti.UnitTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ejagruti.gfl.GenericFunctions;
import ejagruti.gfl.SeleniumOperations;

public class ValidLogin1 {
	//test
	public static void main(String[]args) {
	GenericFunctions genericFun = new GenericFunctions();
	
	//Launch Application
	SeleniumOperations.SetProperty(genericFun.getKeyValue1("createcompany_setproperty"), genericFun.getKeyValue1("createcompany_property"));
	WebDriver driver=new ChromeDriver(); 
	
	 SeleniumOperations.launchUrl( genericFun.getKeyValue1("createcompany_url"));
	 
	 //Enter valid username
	 SeleniumOperations.setText(genericFun.getKeyValue("createcompany_username"),genericFun.getKeyValue1("createcompany_username"));

	 //Enter valid password
	 SeleniumOperations.setText(genericFun.getKeyValue("createcompany_password"),genericFun.getKeyValue1("createcompany_password"));
	 
	 // Click on login
	 SeleniumOperations.clickButton(genericFun.getKeyValue("createcompany_login"));
}
}
