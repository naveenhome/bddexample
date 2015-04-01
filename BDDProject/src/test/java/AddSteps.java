package test.java;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertTrue;

public class AddSteps {
	
	double a=0;
	double b=0;
	double c=0;
	String opt;
	int x,y,z;
	@Given("^the input number (\\d+) and (\\d+)$")
	public void the_input_number_and(int arg1, int arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		x=arg1;
		y=arg2;
	}

	@When("^I select \"([^\"]*)\" as option$")
	public void I_select_as_option(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		opt =arg1;
	}

	@Then("^the output should be (\\d+)$")
	public int the_output_should_be(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		if(opt.equals("Add"))
		{
			z=x+y;
		}
		if(opt.equals("Multiply"))
		{
			z=x*y;
		}
		if(opt.equals("Subtract"))
		{
			z=x-y;
		}
		System.out.println("calculated Output :" + z);
		assertTrue("Expected result :", z==arg1);
		return arg1;
	}
	
	@Given("^then input numbers \"([^\"]*)\" and \"([^\"]*)\"$")
	public void then_input_numbers_and(String arg1, String arg2) throws Throwable {
		
		a= Double.parseDouble(arg1);
		b= Double.parseDouble(arg2);
		
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

	@When("^I select \"([^\"]*)\" option$")
	public void I_select_option(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		opt=arg1;
	}

	@Then("^the output should be \"([^\"]*)\"$")
	public double the_output_should_be(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		if(opt.equals("Add"))
		{
			c=a+b;
		}
		if(opt.equals("Multiply"))
		{
			c=a*b;
		}
		if(opt.equals("Subtract"))
		{
			c=a-b;
		}
		System.out.println("calculated Output :" + c);
		assertTrue("Expected result :", c==Double.parseDouble(arg1));
		return Double.parseDouble(arg1);
		}
	
	@Given("^URL \"http://ata(\\d+).appspot.com in Firefox browser$")
	public void URL_http_ata_appspot_com_in_Firefox_browser(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^I hit enter key$")
	public void I_hit_enter_key() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^home page of website should loaded in Firefox browser$")
	public void home_page_of_website_should_loaded_in_Firefox_browser() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Given("^URL \"http://ata(\\d+).appspot.com in Chrome browser$")
	public void URL_http_ata_appspot_com_in_Chrome_browser(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^home page of website should loaded in Chrome browser$")
	public void home_page_of_website_should_loaded_in_Chrome_browser() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Given("^URL \"http://ata(\\d+).appspot.com in Explorer browser$")
	public void URL_http_ata_appspot_com_in_Explorer_browser(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^home page of website should loaded in Explorer browser$")
	public void home_page_of_website_should_loaded_in_Explorer_browser() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Given("^URL \"http://ata(\\d+).appspot.com in browser$")
	public void URL_http_ata_appspot_com_in_browser(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^home page of website should open in (\\d+) seconds$")
	public void home_page_of_website_should_open_in_seconds(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Given("^the input number (\\d+).(\\d+) and -(\\d+)$")
	public void the_input_number_and_(int arg1, int arg2, int arg3) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^the output should be (\\d+).(\\d+)$")
	public void the_output_should_be_(int arg1, int arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Given("^then number a and b$")
	public void then_number_a_and_b() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^I select \"Add: as option$")
	public void I_select_Add_as_option() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Given("^the input numbers \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_input_numbers_and(String arg1, String arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^I compare$")
	public void I_compare() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^the result both numbers should be between (\\d+) and (\\d+)$")
	public void the_result_both_numbers_should_be_between_and(int arg1, int arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^the result should be higher number$")
	public void the_result_should_be_higher_number() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	}


