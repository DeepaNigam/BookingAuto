package com.api.test;
import java.io.FileNotFoundException;
import org.testng.annotations.Test;
import com.generic.script.*;

public class verifyPutTest 
{
	@Test
   public void verifyPutMethod() throws FileNotFoundException
   {
	GenericBookingForTest refput = new GenericBookingForTest();
	refput.put(2);
}
}