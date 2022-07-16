package br.cs.wbarbosa.rest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import com.google.gson.Gson;

import Curso.Rest.Entity.UsuarioEntity_v1;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class UserJsonTest {
	
	@Test
	public void deveVerificarPrimeiroNivel() {
		
		given()
		.when()
		
		  .get("http://restapi.wcaquino.me/users/1")
		.then()
		.statusCode(200)
		.body("id", is(1))
		.body("name", containsString("Jo?o da Silva"))
		//.body("age", greaterThan(30))
		//.body("salary",  greaterThan(1234.5678))
		
		
		;
		
	}
	
	
	@Test
	
	public void deverVerificarNivelOutrasFormas() {
		
		Response response = RestAssured.request(Method.GET,"https://restapi.wcaquino.me/users/1");
		
		//Path
		Assert.assertEquals(new Integer(1), response.path("id"));
		Assert.assertEquals(new Integer(1), response.path("%s","id"));
		
		//jsonpath
		
		JsonPath jpath = new JsonPath(response.asString());
		Assert.assertEquals(1, jpath.getInt("id"));
		
		
		
		//from
		
		int id = JsonPath.from(response.asString()).getInt("id");
		Assert.assertEquals(1, id);		
		
		
		
	}
	
	@Test
	public void deverVerficarSegundoNivel() {
		
		given()
		.when()
		
		  .get("http://restapi.wcaquino.me/users/2")
		.then()
		.statusCode(200)
		.body("name", containsString("Joaquina"))
		.body("endereco.rua", is("Rua dos bobos"))
	
		
		;
		
		
	}
	//exemplo de array teste rastassured
	@Test
	public void deveVerifircarLista() {
		

	
		/*given()
		.when()
		 .get("http://restapi.wcaquino.me/users/3")
		 .then()
		 .statusCode(200)
		 .extract()
		 .response()
		.body()
		.jsonPath().getList(".", UsuarioEntity_v1.class);
		//.as(UsuarioEntity_v1.class);
		 
	
		 .body("name", containsString("Ana"))
			.body("filhos", hasSize(2))
			.body("filhos[0].name", is("Zezinho"))
			.body("filhos[1].name", is("Luizinho"))
			.body("filhos,name", hasItem("Zezinho"))
			.body("filhos,name", hasItems("Zezinho","Luizinho"));
			*/
		
		
		 //Exemplo de teste rapido rast assured
		String Jsonn = RestAssured.get("http://restapi.wcaquino.me/users/3").asString();
		UsuarioEntity_v1 usuario = JsonPath.from(Jsonn).getObject("[0]", UsuarioEntity_v1.class);
				
	
				given()
				.when()
				 .get("http://restapi.wcaquino.me/users/3").as(UsuarioEntity_v1.class);
				
		
		System.out.println(usuario.id);
		
		
		Response response = given()
							.get("http://restapi.wcaquino.me/users/3");

		UsuarioEntity_v1 usuario = new Gson().fromJson(response.getBody().asString(),UsuarioEntity_v1.class);
		
		System.out.println(usuario.filhos.get(0));
		
		
		
	}
	
	
	
	@Test
	public void deveRetornarErroUsuarioInexistente() {
		
		
		given()
		.when()
		.get("http://restapi.wcaquino.me/users/4")
		.then()
		.statusCode(404)
		.body("error",is("Usu?rio inexistente"))
		
		;
		
		
	}
		
		
	
	@Test
	public void deveVerficarListaRaiz() {
	given()
	.when()
	.get("http://restapi.wcaquino.me/users/users")
	.then()
	.statusCode(200)
	.body("$", hasSize(3))
	.body("name",hasItems("Jo?o da Silva", "Maria Joaquina", "Ana J?lia"))
	.body("age[1]", is(25))
	.body("filhos.name", hasItem(Arrays.asList("Zezinho", "Luizinho")))
	.body("salary", contains(1234.5678f, 2500, null))

	;
	

}
}
