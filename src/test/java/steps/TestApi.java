package steps;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static pojo.BulkRequestFactory.getBulkRequestForBody;
import static utils.StartParameters.apiKey;
import static utils.StartParameters.url;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import java.util.List;

public class TestApi {

  private List<String> weathers;
  public int code;

  @When("Отправили запрос на {string}")
  public void verifyCode(String arg0) {
    Response response = given()
        .queryParam("key", apiKey)
        .queryParam("q","bulk")
        .contentType(ContentType.JSON).body(getBulkRequestForBody())
        .when()
        .post(arg0)
        .then()
        .statusCode(200)
        .extract().response();
    JsonPath jsonPath = response.jsonPath();
    weathers = jsonPath.get("bulk.query.current.condition.text");
  }

  @Then("Фиксируем, что во всех городах ясно")
  public void getCode() {
    assertTrue(weathers.stream().allMatch(x -> x.equals("Clear")));
  }

  @When("Оправили запрос без ключа")
  public void оправилиЗапросБезКлюча() {
    code = given()
        .queryParam("q", "London")
        .when()
        .get(url)
        .then()
        .extract().response().getStatusCode();
  }

  @Then("Получаем ошибку с кодом {string}")
  public void получаемОшибкуСКодом(String arg0) {
    assertEquals(arg0, code);
  }
}
