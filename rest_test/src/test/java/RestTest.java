import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import pojos.Person;

import java.util.List;

import static io.restassured.RestAssured.given;

public class RestTest {

    @Test
    public void getUsers() {
        List<Person> names = given().auth()
                .basic("tester@mail.ru", "1995")
                .baseUri("http://api-qa.skillbox.ru/practice1/api")
                .basePath("/users").contentType(ContentType.JSON)
                .when().get()
                .then().statusCode(200)
                .extract().jsonPath().getList("person", Person.class);
        System.out.println(names);
    }
}
