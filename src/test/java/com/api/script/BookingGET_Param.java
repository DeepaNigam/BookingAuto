package com.api.script;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BookingGET_Param {
public static void pathgetparam(int id)
    {
	   //pathParam = if u want to get details of specific user
	   //https://reqres.in/api/users/2
        RestAssured.given().accept(ContentType.JSON).pathParam("id", id)
        .get("https://reqres.in/api/users/{id}").then().log().all();
    }

public static void queryParamcell(int id)
{
	//queryParam = if u want to get the api data page wise
	//Example : https://reqres.in/api/users/?page=2
	RestAssured.given().accept(ContentType.JSON).queryParam("page", id)
    .get("https://reqres.in/api/users/").then().log().all();
}
    
    public static void main(String args[])
    {
    	System.out.println("----------Start of Path Param--------------");
        pathgetparam(2);
        System.out.println("----------End of Path Param--------------");
        
        System.out.println("----------Start of Query Param--------------");
        queryParamcell(3);
        System.out.println("----------End of Query Param--------------");
        
}
}
