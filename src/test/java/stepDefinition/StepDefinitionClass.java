package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.One.BaseClass;
import project.One.POM;

public class StepDefinitionClass extends BaseClass{
	POM POM;
	@Given("User is on facebook page")
	public void user_is_on_facebook_page() {
	   getdriver("edge");
	   url("https://www.facebook.com/");
	}
	@When("user enters username and passwords")
	public void user_enters_username_and_passwords(io.cucumber.datatable.DataTable dataTable) {
		POM = new POM();
		List<List<String>> emp = dataTable.asLists();
		WebElement userName = POM.getUsername();
		textSend(userName,emp.get(1).get(0));
		System.out.println(userName);
		
		WebElement pwd = POM.getPwd();
		textSend(pwd,emp.get(1).get(0));
	    System.out.println(pwd);
	
	}
	@Then("click login button")
	public void click_login_button() {
		//quitBrowser();
	    
	}
	
}


