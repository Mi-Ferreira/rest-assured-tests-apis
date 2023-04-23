package testsrestassured;

import io.restassured.RestAssured;
import org.junit.Test;

public class TestRestAssured {

    @Test
    public void shouldNamesOfGames(){
        RestAssured.given()
                .when()
                .get("https://zelda.fanapis.com/api/games?limit=20&page=3")
                .then()
                .statusCode(200);
    }

}
