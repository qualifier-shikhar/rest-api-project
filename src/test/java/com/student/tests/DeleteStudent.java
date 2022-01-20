package com.student.tests;


import static io.restassured.RestAssured.*;

import com.student.base.TestBase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.restassured.http.ContentType;

public class DeleteStudent extends TestBase{
    
    @DisplayName("Delete student from the system")
    @Test
    void deleteStudent() {
        given()
        .when()
        .contentType(ContentType.JSON)
        .when()
        .delete("/101")
        .then()
        .statusCode(204);

    }
}
