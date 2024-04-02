import static io.restassured.RestAssured.given;
import static pojo.BulkRequestFactory.getBulkRequestForBody;
import static utils.StartParameters.*;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

  @Test(description = "Checks clear weather for 4 cities")
  public void checkWeatherForLocations() {
    Response response = given()
        .queryParam("key", apiKey)
        .queryParam("q","bulk")
        .contentType(ContentType.JSON).body(getBulkRequestForBody())
        .when()
        .post(url)
        .then()
        .statusCode(200)
        .extract().response();
    JsonPath jsonPath = response.jsonPath();
    List<String> weathers = jsonPath.get("bulk.query.current.condition.text");
    Assert.assertTrue(weathers.stream().allMatch(x -> x.equals("Clear")));
  }

  @Test
  public void checkErrors() {
    given()
        .queryParam("q", "London")
        .when()
        .get(url)
        .then()
        .statusCode(401);
  }
}
