package com.student.tests;

import static io.restassured.RestAssured.*;

import com.student.base.TestBase;
import com.student.model.UserPojo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.restassured.http.ContentType;

public class CreateStudentPOJOPayload extends TestBase{
    
    @DisplayName("Create a user  by sending payload as an object")
    @Test
    void createNewStudent() {

        UserPojo user = new UserPojo();
        user.setId(5);
        user.setName("Cate");
        user.setEmail("cate@gmail.com");
        user.setUserName("CateU");
        
        given()
            .when()
            .contentType(ContentType.JSON)
            .when()
            .body(user)
            .post()
            .then()
            .statusCode(201);
    }
}
