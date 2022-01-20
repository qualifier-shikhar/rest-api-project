package com.student.tests;

import static io.restassured.RestAssured.*;

import com.github.javafaker.Faker;
import com.student.base.TestBase;
import com.student.model.UserPojo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.restassured.http.ContentType;

public class updateStudentEmail extends TestBase {
    
    @DisplayName("Update Student email")
    @Test
    void updateMail() {
        UserPojo user = new UserPojo();
        Faker fake = new Faker();
    
        user.setEmail(fake.internet().emailAddress());
            
        given()
            .when()
            .contentType(ContentType.JSON)
            .when()
            .body(user)
            .patch("/101")
            .then()
            .statusCode(200);
    }
}
