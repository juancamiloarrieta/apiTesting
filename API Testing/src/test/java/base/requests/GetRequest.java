package base.requests;

import base.models.BankTransactionPojo;
import base.models.Endpoints;

import java.util.List;

import static io.restassured.RestAssured.given;

public class GetRequest {

    public static List<BankTransactionPojo> metodoget(){
        List<BankTransactionPojo> bankTransactionPojoList = given()
                .when()
                .get(Endpoints.ENDPOINT)
                .then()
                .extract()
                .body()
                .jsonPath().getList("", BankTransactionPojo.class);
        return bankTransactionPojoList;
    }

}
