package com.trello;

import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

public class boards {

    @Test

    public void test_practice(){
        //System.out.println("this a test");
        RestAssured.given().log().all()
                .when()
                       .get("https://api.trello.com/1/boards/662f010b0358495d3c85a84c?key=983e0f5be8a9f094c812339dee988284&token=ATTAc568720cc104cb87ec98e52f31b7f7f904be4cfedb15347b819731dafeeee79a0A5F92E7")
                            .then().assertThat().statusCode(200);

    }
}
