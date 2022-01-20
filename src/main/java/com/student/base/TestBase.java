package com.student.base;


import org.junit.jupiter.api.BeforeAll;

import io.restassured.RestAssured;

public class TestBase {
    
    @BeforeAll
    public static void intit() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        // RestAssured.basePath = "/users";
    }    
}
