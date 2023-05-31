package com.api.test;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import com.generic.script.*;

public class verifyAssertPostTest 
{
	@Test
   public void verifyAssertPostMethod() throws FileNotFoundException
   {
	GenericBookingForTest refpost = new GenericBookingForTest();
	refpost.assertpost();
}
}