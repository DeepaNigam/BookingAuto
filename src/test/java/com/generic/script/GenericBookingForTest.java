package com.generic.script;
import java.io.*;
import java.util.Scanner;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.*;

public class GenericBookingForTest 
{

	public void get(int id)
	{
		 RestAssured.given().accept(ContentType.JSON).pathParam("id", id)
	        .get("https://reqres.in/api/users/{id}").then().log().all();
	}
	
	public void get1(int bookingid)
	{
		 RestAssured.given().accept(ContentType.JSON).pathParam("bookingid", bookingid)
	        .get("https://restful-booker.herokuapp.com/booking/{bookingid}").then().log().all();
	}
	
	public void post() throws FileNotFoundException
	{
		 RestAssured.given().baseUri("https://restful-booker.herokuapp.com").body(getfilecontent("C:\\Users\\DeepanshaNigam\\eclipse-workspace\\BookingAuto\\src\\test\\resources\\Data File\\CreateBooking-POST.txt"))
	        .header("Content-Type","application/json")
	        .header("Accept","application/json").header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log()
	.all().post("/booking").then().log().all();
		 
		 
	}
	public void assertpost()
	{
		 
	//Assertion code 
		 
		 RestAssured.baseURI = "https://restful-booker.herokuapp.com";
		   RequestSpecification httpRequest = RestAssured.given();
		   io.restassured.response.Response response=httpRequest.get("/booking/1063");
		   
    // Retrieve the body of the Response
		   String body= response.getBody().toString();
		   String jsonString = response.asString();
		   RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
		   .body(jsonString).header("ContentType","text/plain")
		   //contentType(ContentType.JSON)
		   .header("Accept","application/json").header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log()
		           .all().post("/booking").then().log().all();
		   System.out.println(response.getBody().path("firstname"));
		   Assert.assertEquals(response.getBody().path("firstname"),"Deepansha");
		 
	}
	
	public void put(int bookingid) throws FileNotFoundException
	{
		 RestAssured.given().baseUri("https://restful-booker.herokuapp.com").body(getfilecontent("C:\\Users\\DeepanshaNigam\\eclipse-workspace\\BookingAuto\\src\\test\\resources\\Data File\\CreateBooking-POST.txt"))
	        .header("Content-Type","application/json")
	        .header("Accept","application/json").header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
	        .pathParam("bookingid",bookingid).when().log().all().put("booking/{bookingid}").then().log().all();
	}
	
	public void patch(int bookingid) throws FileNotFoundException
	{
		 RestAssured.given().baseUri("https://restful-booker.herokuapp.com").body(getfilecontent("C:\\Users\\DeepanshaNigam\\eclipse-workspace\\BookingAuto\\src\\test\\resources\\Data File\\CreateBooking-PATCH.txt"))
	        .header("Content-Type","application/json")
	        .header("Accept","application/json").header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
	        .pathParam("bookingid",bookingid).when().log().all().patch("booking/{bookingid}").then().log().all();
	}

   public static String getfilecontent(String filepath) throws FileNotFoundException
   {
    File file=new File(filepath);
    Scanner sc=new Scanner(file);
    sc.useDelimiter("\\Z");
    return sc.next();
    }
	
   
   
   
}
