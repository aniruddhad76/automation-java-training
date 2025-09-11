package com.aw.automationtraining.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

/**
 * Sample Rest Assured test to demonstrate API testing functionality
 * This test calls https://reqres.in/api/users?page=2 and verifies the response
 */
public class ReqResApiTest {
    
    @BeforeClass
    public void setUp() {
        // Set base URI for the API
        RestAssured.baseURI = "https://reqres.in";
    }
    
    @Test
    public void testGetUsersPage2() {
        // Make GET request to /api/users with page=2 parameter
        Response response = given()
            .queryParam("page", 2)
            .when()
            .get("/api/users")
            .then()
            .statusCode(200)  // Verify status code is 200
            .extract()
            .response();
        
        // Assert that the response contains page=2
        int page = response.jsonPath().getInt("page");
        Assert.assertEquals(page, 2, "Page number should be 2");
        
        // Additional assertions to verify response structure
        int perPage = response.jsonPath().getInt("per_page");
        int total = response.jsonPath().getInt("total");
        int totalPages = response.jsonPath().getInt("total_pages");
        
        Assert.assertTrue(perPage > 0, "Per page should be greater than 0");
        Assert.assertTrue(total > 0, "Total should be greater than 0");
        Assert.assertTrue(totalPages > 0, "Total pages should be greater than 0");
        
        // Verify that data array exists and has items
        int dataSize = response.jsonPath().getList("data").size();
        Assert.assertTrue(dataSize > 0, "Data array should contain items");
        
        // Print response for debugging (optional)
        System.out.println("Response: " + response.asString());
    }
    
    @Test
    public void testGetUsersPage2WithJsonPath() {
        // Alternative approach using JSON path assertions
        given()
            .queryParam("page", 2)
            .when()
            .get("/api/users")
            .then()
            .statusCode(200)
            .body("page", org.hamcrest.Matchers.equalTo(2))
            .body("per_page", org.hamcrest.Matchers.greaterThan(0))
            .body("total", org.hamcrest.Matchers.greaterThan(0))
            .body("data", org.hamcrest.Matchers.notNullValue())
            .body("data.size()", org.hamcrest.Matchers.greaterThan(0));
    }
}
