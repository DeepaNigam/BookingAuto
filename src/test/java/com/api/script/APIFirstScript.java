package com.api.script;
import java.io.*;
import java.util.Scanner;
import io.restassured.RestAssured;

public class APIFirstScript {
	public static void main(String[] args) throws FileNotFoundException {
        // TODO Auto-generated method stub
    
    //GET
RestAssured.given().baseUri("https://restful-booker.herokuapp.com").when().log().all().get("/booking/4934")
.then().log().all();
    

//POST
        RestAssured.given().baseUri("https://restful-booker.herokuapp.com").body(getfilecontent("C:\\Users\\DeepanshaNigam\\eclipse-workspace\\BookingAuto\\src\\test\\resources\\Data File\\CreateBooking-POST.txt"))
        .header("Content-Type","application/json")
        .header("Accept","application/json").header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log()
.all().post("/booking").then().log().all();
    
    
}
public static String getfilecontent(String filepath) throws FileNotFoundException
{
    File file=new File(filepath);
    Scanner sc=new Scanner(file);
    sc.useDelimiter("\\Z");
    return sc.next();
}
    }
