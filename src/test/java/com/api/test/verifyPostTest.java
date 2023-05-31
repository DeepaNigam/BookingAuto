package com.api.test;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import com.generic.script.*;

public class verifyPostTest 
{
	@Test
   public void verifyPostMethod() throws FileNotFoundException
   {
	GenericBookingForTest refpost = new GenericBookingForTest();
	refpost.post();
}
}