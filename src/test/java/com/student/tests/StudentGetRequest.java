package com.student.tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import com.student.base.TestBase;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

/**
 * @author: Shikhar Joshi
 */
public class StudentGetRequest extends TestBase{

    public void styles() {
        /*
            In order to run this test remove static and star from RestAssured Import
        RestAssured.given()
                    .queryParam("", "")
                    .when()
                    .get("https://www.google.com/")
                    .then();

        RestAssured.given()
                    .expect()
                    .when();
        */
    }

    @DisplayName("Getting all the user from the DB")
    @Test
    void getAllStudents() {
        // RequestSpecification reqSpec = RestAssured.given();
        // Response res = reqSpec.get("/users");

        // //print response in console
        // res.prettyPrint();
        // ValidatableResponse validatableResponse = res.then();
        // validatableResponse.statusCode(200);

        /*
         * In order to run this test remove static and star from RestAssured Import
        RestAssured.given()
                    .queryParam("", "")
                    .when()
                    .get("/users")
                    .then()
                    .statusCode(200);

        //this test will fail
        RestAssured.given()
                    .expect()
                    .statusCode(201)
                    .when()
                    .get("/users");
       */             
        given()
            .when()
            .get("/users")
            .then()
            .statusCode(200);
    }

    @Disabled
    @DisplayName("Get a single user from List")
    @Test
    void getSinglePost() {
        /* Can use this
         .queryParam("userId", "1")
         .queryParam("limit", 1)
         .queryParams("userId", 1, "limit", 1)
        */
        
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", "1");
        params.put("limit", 1);

        Response res = given()
                        .queryParams(params)
                        .when()
                        .get("/users");
        res.prettyPrint();
    }

    @DisplayName("PathParameterExample: Get the firstUser")
    @Test
    void getFirstPost() {
        Response res = given()
                        .pathParam("id", 2)
                        .when()
                        .get("/users/{id}");
        res.prettyPrint();

        /* To reset all RestAssured Values
            RestAssured.reset();

            Response res2 = given()
                            .pathParam("id", 2)
                            .when()
                            .get("/{id}")
        */
    }
}
