package br.cs.wbarbosa.rest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.hamcrest;
import org.hamcrest.Matchers;
import org.hamcrest.Matchers.*;
import org.hamcrest.collection.HasItemInArray;
import org.hamcrest.core.StringContains;
import org.hamcrest.text.StringContainsInOrder;

import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.regex.Matcher;

import org.junit.Assert;
import org.junit.Test;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;

import io.restassured.RestAssured;
import io.restassured.assertion.BodyMatcher;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class OlaMundoTest {

	@Test
	public void testOlaMundo() {
		Response response = RestAssured.request(Method.GET, "http://restapi.wcaquino.me:80/ola");
		Assert.assertTrue(response.getBody().asString().equals("Ola Mundo!"));
		Assert.assertTrue(response.statusCode() == 200);
		Assert.assertTrue("O status code deveria ser 200", response.statusCode() == 200);
		Assert.assertEquals(200, response.statusCode());

		ValidatableResponse validacao = response.then();
		validacao.statusCode(200);

	}

	@Test
	public void devoConheceOutrasFormasRestAssured() {

		Response response = RestAssured.request(Method.GET, "http://restapi.wcaquino.me/ola");
		ValidatableResponse validacao = response.then();
		validacao.statusCode(200);

		get("http://restapi.wcaquino.me/ola").then().statusCode(200);

		given() // Pré condições

				.when() // ação

				.get("http://restapi.wcaquino.me/ola").then() // verificações ou assertivas

				.assertThat().statusCode(200);

	}

	@Test //exemplos de tipos de acertivas
	public void devoConhecerMatchersHamcrest() {
		assertThat("Maria", Matchers.is ("Maria")); //assertThat faz comparação de resultado atual com esperado
		assertThat("128", Matchers.is ("128"));//assertThat faz comparação de resultado atual com esperado
		assertThat("128", Matchers.isA(Integer.class));//assertThat faz comparação de resultado atual com esperado
		assertThat("128d", Matchers.isA(Double.class));
		assertThat("128d", Matchers.greaterThan(120d));
		assertThatt("128d", Matchers.lessThan(130d));
		
		
		List<Integer>impares =Arrays.asList(1,3,5,7,9);
		 assertThat(impares, hasSize(5));
	     assertThat(impares, contains(1,3,5));
	     assertThat(impares, ContainsInOrder(1,3,5));
	     assertThat(impares, hasItem(1,3,5));
	     assertThat(impares, hasItem(1,5));
	     
	     assertThat("Maria", is(not("João")));
	    		    assertThat("Maria",not("João")));
	     assertThat("Joaquina,anyOf(is("Maria"),is("Joaquina")));"
         assertThat("Joaquina,allOf(startsWith("joa"),endswith("ina"), containString("qui")));
	     	
	    	
	    		 
	}	  		 
	
		
	}

	@Test
	public void devovalidarBody() {
		
		given()   //Pré condições 		  
		.when()     //ação
		     get("http://restapi.wcaquino.me/ola")		 
		
		 .then()   //verificações ou assertivas
		       .statusCode(200);
		       .body(is("Ola Mundo!"))
		       .body(containsString("Mundo"))
		       .body(is(not(nullValue())
		       
		       
		
	;	
	
	}

}
