package com.steps;

import java.io.FileNotFoundException;

import com.generic.script.GenericBookingForTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class verifyPostCucumberSteps 
{
	
	GenericBookingForTest ref = new GenericBookingForTest();
		
	@Then("Execute Post Method")
	public void execute_post_method() throws FileNotFoundException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		ref.post();
	}

}
