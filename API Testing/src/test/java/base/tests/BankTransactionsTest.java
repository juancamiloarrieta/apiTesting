package base.tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

@Test
public class BankTransactionsTest {

    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void getTest() {
        String endpoint = "https://6220fc62afd560ea69a3f9f5.mockapi.io/api/testing/BankTransactions";

        //given
        Response response = given().when().get(endpoint);

        response.then().extract().response();

        //the
        response.prettyPrint();

        System.out.println(response.jsonPath().getString("name"));
    }


    @Test
    public void postTest() {
        String endpoint = "https://6220fc62afd560ea69a3f9f5.mockapi.io/api/testing/BankTransactions";

        Response response;

        Map<String, Object> user = new HashMap<String, Object>();
        user.put("name", "pepito");
        user.put("lastName", "perex");
        user.put("accountNumber", "49463532");
        user.put("id", "900");
        user.put("transactionType", "deposit");
        user.put("email", "Josue.Howe@yahoo.com");
        user.put("active", false);
        user.put("country", "Bouvet Island");
        user.put("telephone", "1-584-424-6722 x3567");

        //when
        response = given().contentType("application/json").body(user).when().post(endpoint);


        //then
        response.prettyPrint();
        response.then().assertThat().statusCode(201);

        System.out.print(response.statusCode());

    }

    @Test
    public void updateTest() {
        //given
        String endpoint = "https://6220fc62afd560ea69a3f9f5.mockapi.io/api/testing/BankTransactions/10";

        Response response;

        Map<String, String> user = new HashMap<String, String>();
        user.put("name", "pepito");
        user.put("lastName", "perez");
        user.put("telephone", "1-387-236-1051 x6589");
        user.put("id", "900");

        //when
        response = given().contentType("application/json").body(user).when().put(endpoint);

        //then
        response.prettyPrint();

        response.then().assertThat().statusCode(200);
    }

    @Test
    public void deleteTest() {
        //given
        String endpoint = "https://6220fc62afd560ea69a3f9f5.mockapi.io/api/testing/BankTransactions/10";

        //when
        Response response = given().when().delete(endpoint);

        response.then().extract().statusCode();

        //then
        response.prettyPrint();
        response.then().assertThat().statusCode(200);

    }

}
