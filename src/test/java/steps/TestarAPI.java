package steps;
import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.module.jsv.JsonSchemaValidator.*;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestarAPI {


		
		public TestarAPI(){
			baseURI = "https://jsonplaceholder.typicode.com/todos/1";
		}
		@Test
		/*Chama o servi�o pelo metodo GET*/
		public void testConsultaUrl() {
			 
			given()
			 .when()
			    .get("/1")
			 .then()
			    .statusCode(404)
			    .body("userId", is(1))
			    .body("id", is(1))
			    .body("title", equalTo("delectus aut autem"))
			    .body("completed", equalTo(false))
			    .assertThat()
			       .body(matchesJsonSchemaInClasspath("schema_exemplo.json"));
		}
		@Test
		/*Chama o servi�o pelo metodo POST*/
		public void testConsultaMensagem() {
			String myJson = "{\"userId\":\"id\",\"title\": \"completed\"}";
	    	
	         given()
	           .contentType("application/json")
	    	   .body(myJson)
	    	 .when()
	    	   .post("/")
	    	 .then()
	    	   .statusCode(500)
	    	   .body("message", containsString(""));	 
		}
}
