package com.api.test;
import org.testng.annotations.Test;

import com.generic.script.*;

public class verifyGetTest 
{
	@Test
   public void verifyGetMethod()
   {
	GenericBookingForTest refget = new GenericBookingForTest();
	refget.get(2);
}
}