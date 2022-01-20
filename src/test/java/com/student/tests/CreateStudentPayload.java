package com.student.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import com.student.base.TestBase;


public class CreateStudentPayload extends TestBase{
    
    @DisplayName("Create a new Student by sending payload as String")
    @Test
    void createNewStudent() {
        String payload = "{\"id\":2,\"name\":\"Leanne Graham\",\"username\":\"Bret\",\"email\":\"Sincere1@april.biz\",\"address\":{\"street\":\"Kulas Light\",\"suite\":\"Apt. 556\",\"city\":\"Gwenborough\",\"zipcode\":\"92998-3874\",\"geo\":{\"lat\":\"-37.3159\",\"lng\":\"81.1496\"}}";
        
        given()
            .when()
            .contentType(ContentType.JSON)
            .when()
            .body(payload)
            .post()
            .then()
            .statusCode(201);
    }
}
