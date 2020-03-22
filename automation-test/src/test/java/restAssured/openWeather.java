package restAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class openWeather {

    String uriBase = "http://samples.openweathermap.org/data/2.5/";

    private Integer idCity;

    private Response response;

    @Before
    public void before() {
        RestAssured.baseURI = uriBase;
        //useRelaxedHTTPSValidation();
    }

    @Test
    public void getWeatherByCity() {
        response = given()
                .when()
                .queryParam("q", "London")
                .queryParam("appid","b6907d289e10d714a6e88b30761fae22")
                .get("/weather");

        Assert.assertEquals(response.getStatusCode(),200);
        Assert.assertEquals(response.jsonPath().get("name"), "London");
        idCity = response.jsonPath().get("id");
    }

    @Test
    public void getWeatherById() {
        response = given()
                .when()
                .queryParam("id", 2172797)
                .queryParam("appid","b6907d289e10d714a6e88b30761fae22")
                .get("/weather");

        Assert.assertEquals(response.getStatusCode(),200);
        Assert.assertEquals(response.jsonPath().get("id").toString(), "2172797");
    }
}
