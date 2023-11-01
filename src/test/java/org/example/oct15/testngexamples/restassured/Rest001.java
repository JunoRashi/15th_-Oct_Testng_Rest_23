package org.example.oct15.testngexamples.restassured;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Rest001 {



    @Test(groups = {"postivietestcase"})
    public void get_Request_postive() {
        RestAssured.
                given().baseUri("https://restful-booker.herokuapp.com/ping")
                .when().get().
                then().log().all().statusCode(201);
    }



    @Test(groups = {"negativetestcase"})
    public void get_Request_negative() {
        RestAssured.
                given().baseUri("https://restful-booker.herokuapp.com/ping")
                .when().get().
                then().log().all().statusCode(200);
    }


}
