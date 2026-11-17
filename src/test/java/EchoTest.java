import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class EchoTest {

    @BeforeAll
    static void setup() {
        RestAssured.baseURI = "https://postman-echo.com";
    }

    @Test
    void testGet() {
        given()
                .when()
                .get("/get")
                .then()
                .statusCode(200)
                .body("url", equalTo("https://postman-echo.com/get"))
                .body("args", anEmptyMap())
                .body("headers", notNullValue());
    }

    @Test
    void testPostRawText() {
        String body = "{\n    \"test\": \"value\"\n}";

        given()
                .contentType("text/plain")
                .body(body)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("url", equalTo("https://postman-echo.com/post"))
                .body("headers", notNullValue())
                .body("args", anEmptyMap())
                .body("data", equalTo(body))
                .body("files", anEmptyMap())
                .body("form", anEmptyMap())
                .body("json", nullValue());

    }

    // 3. POST Form Data
    @Test
    void testPostFormData() {
        given()
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("foo1", "bar1")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("url", equalTo("https://postman-echo.com/post"))
                .body("form.foo1", equalTo("bar1"))
                .body("data", equalTo(""))
                .body("json.foo1", equalTo("bar1"))
                .body("headers", notNullValue());
    }

    @Test
    void testPut() {
        String body = "This is expected to be sent back as part of response body";

        given()
                .contentType("text/plain")
                .body(body)
                .when()
                .put("/put")
                .then()
                .statusCode(200)
                .body("url", equalTo("https://postman-echo.com/put"))
                .body("data", equalTo(body))
                .body("json", nullValue())
                .body("headers", notNullValue());
    }

    @Test
    void testPatch() {
        String body = "This is expected to be sent back as part of response body";

        given()
                .contentType("text/plain")
                .body(body)
                .when()
                .patch("/patch")
                .then()
                .statusCode(200)
                .body("url", equalTo("https://postman-echo.com/patch"))
                .body("data", equalTo(body))
                .body("json", nullValue())
                .body("headers", notNullValue());
    }

    @Test
    void testDelete() {
        given()
                .when()
                .delete("/delete")
                .then()
                .statusCode(200)
                .body("url", equalTo("https://postman-echo.com/delete"))
                .body("data", anEmptyMap())
                .body("json", nullValue())
                .body("headers", notNullValue());
    }
}
