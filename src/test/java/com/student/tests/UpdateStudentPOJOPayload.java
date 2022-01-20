package com.student.tests;

import com.github.javafaker.Faker;
import com.student.model.UserPojo;

import static io.restassured.RestAssured.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.restassured.http.ContentType;

public class UpdateStudentPOJOPayload {
    
    @DisplayName("Update student name by sending oject as payload")
    @Test
    void updateStudent() {
        UserPojo user = new UserPojo();
        Faker fake = new Faker();
        user.setId(5);
        user.setName(fake.name().firstName());
        user.setEmail(fake.internet().emailAddress());
        user.setUserName("CateU");
        
        given()
            .when()
            .contentType(ContentType.JSON)
            .when()
            .body(user)
            .put("/101")
            .then()
            .statusCode(200);
    }
}
