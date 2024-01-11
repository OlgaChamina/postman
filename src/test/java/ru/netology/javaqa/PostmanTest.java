package ru.netology.javaqa;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class PostmanTest {

    @Test
    void shouldReturnSomeData(){

        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("good morning") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data",equalTo("good morning"))
        ;
    }
}
