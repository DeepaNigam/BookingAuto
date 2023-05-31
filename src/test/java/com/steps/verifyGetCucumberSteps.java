package com.steps;

import com.generic.script.GenericBookingForTest;

import io.cucumber.java.en.Given;

public class verifyGetCucumberSteps 
{
	
	GenericBookingForTest ref = new GenericBookingForTest();
	@Given("Execute Get Method")
	
	public void execute_get_method() 
	{
	   ref.get(2);
	}

}
