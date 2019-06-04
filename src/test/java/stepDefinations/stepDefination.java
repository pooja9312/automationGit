package stepDefinations;


import java.util.List;
import Helpers.Login;
import org.junit.runner.RunWith;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import io.cucumber.datatable.DataTable;
import cucumber.api.java.en.Then;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;



@RunWith(Cucumber.class)
public class stepDefination {
	
	public static Login obj= new Login();
	//public static stepDefination ob= new stepDefination();

    @Given("^User is on Sign in page$")
    public void user_is_on_sign_in_page() throws Throwable {
    	obj.setup();
    	
    	System.out.println("login");
    }

    @When("^User login applictaion with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_applictaion_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable{
    	
    	
    	obj.loginCred(strArg1, strArg2);
    	System.out.println("pss");
    }

    @Then("^dashboard is displayed is \"([^\"]*)\"$")
    public void dashboard_is_displayed_is_something(String strArg1) throws Throwable {
    	
    	obj.dashboardTit(strArg1);
    
    	
    	System.out.println("dash2263w");
    		
    	
    }
    	
  
    	    

    	    @When("^User sign up with following details$")
    	    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
    	
    
    	    
    	    	List<List<String>> object = data.asLists();
    	    	
    	    	
    	    	//List<List<String>> object = data.create(raw);
    	   
    	     System.out.println(object.get(0).get(0));
    	  System.out.println(object.get(0).get(1));
    	  System.out.println(object.get(0).get(2));
    	  System.out.println(object.get(0).get(3));
         
    	    }
    	    
    	    
    	    @When("^User login into applictaion with (.+) and (.+)$")
    	    public void user_login_into_applictaion_with_and(String username, String password) throws Throwable  {
    	    	obj.loginCred(username, password);
    	    	
    	    	System.out.println("paramerized");
    
    	    }


    	    @Then("^dashboard is displayed or not$")
    	    public void dashboard_is_displayed_or_not() throws Throwable {
    	        
    	    	obj.dashboardTitle1();
    	        
    	    }
    	
    	    
    	    @Given("^Validate the browser$")
    	    public void validate_the_browser() throws Throwable {
    	    	System.out.println("test1");
    	    }

    	    @When("^Browser is triggered$")
    	    public void browser_is_triggered() throws Throwable {
    	    	System.out.println("test2");
    	    }

    	    @Then("^check if browser is started$")
    	    public void check_if_browser_is_started() throws Throwable {
    	       	System.out.println("test3");
    	    }
    	
   
}