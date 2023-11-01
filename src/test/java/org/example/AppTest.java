package org.example;

import io.restassured.RestAssured;
import org.testng.annotations.Test;


public class AppTest {


    @Test
    public void getRequestping() {


        //GET Request
        //Fetch URL

        RestAssured.given().baseUri("https://restful-booker.herokuapp.com/ping").when().get().then().log().all().statusCode(201);

    }
}

