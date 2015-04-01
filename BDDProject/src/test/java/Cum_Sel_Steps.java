package test.java;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cum_Sel_Steps {
	
	private TestGuiAdd testGuiAdd = new TestGuiAdd();
	@Given("^the input value (\\d+) and (\\d+)$")
	public void the_input_value_and(int arg1, int arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		testGuiAdd.setFirst(arg1);
		testGuiAdd.setSecond(arg2);
		
	}

	@When("^I click \"([^\"]*)\" as option$")
	public void I_click_as_option(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		testGuiAdd.setOperator(arg1);
	}

	@Then("^the output should be (\\d+) in result$")
	public void the_output_should_be_in_result(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		testGuiAdd.Result();
	}

}
