package com.steps;

import java.io.FileNotFoundException;

import com.generic.script.GenericBookingForTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class verifyPutCucumberSteps 
{
	
	GenericBookingForTest ref = new GenericBookingForTest();
		
	@Then("Execute Put Method")
	public void execute_put_method() throws FileNotFoundException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		ref.put(2);
	}

	@Then("Execute Patch Method")
	public void execute_patch_method() throws FileNotFoundException {
	    ref.patch(2);
	}
	
}
