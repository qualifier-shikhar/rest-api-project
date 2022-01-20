package com.student.loggingexamples;

/**
 * @author: Shikhar Joshi
 */

import com.student.base.TestBase;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class LoggingRequestValues extends TestBase {
    /**
     * This test will print out all the request headers
     */
    @Test
    public void test001() {
        System.out.println("-------------Printing Request Headers----------------");
        given()
        .log()
        .headers()
        .when()
        .get("/1")
        .then()
        .statusCode(200);
    }

    /**
     * This test will print out all the request parameters
     */
    @Test
    public void test002() {
        System.out.println("-------------Printing Request Parameters----------------");
        given()
        .param("id", 1)
        .param("limit", 1)
        .log()
        .params()
        .when()
        .get("/users")
        .then()
        .statusCode(200);
    }
}
