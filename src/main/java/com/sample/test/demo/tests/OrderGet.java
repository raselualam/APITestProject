package com.sample.test.demo.tests;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import org.codehaus.jackson.JsonParseException;
import org.hamcrest.core.Is;
import org.testng.annotations.Test;
import com.sample.test.demo.utils.BaseTest;
import com.sample.test.demo.utils.Order;

public class OrderGet extends BaseTest {

    private static final String url = "https://my-json-server.typicode.com/sa2225/demo/orders";
    
    @Test
    public void orderGet() {
    	
        given().
        when().
        		get(url).
        then().
        		assertThat().statusCode(200).
        		body(
        		
	        		"id[0]", Is.is("1"), 
	        		
	        		"items[0].item[0]", Is.is(1),
	        		"items[0].pizza[0]", Is.is("Medium 8 Slices - 2 toppings"),
	        		"items[0].toppings[0][0]", Is.is("Mushrooms"),
	        		"items[0].toppings[0][1]", Is.is("Extra cheese"),
	        		
	        		"items[0].item[1]", Is.is(2),
	        		"items[0].pizza[1]", Is.is("Large 10 Slices - 2 toppings"),
	        		"items[0].toppings[1][0]", Is.is("Italian Ham"),
	        		"items[0].toppings[1][1]", Is.is("Salami"),
	        		
	        		"id[1]", Is.is("2"), 
	        		
	        		"items[1].item[0]", Is.is(1),
	        		"items[1].pizza[0]", Is.is("Small 6 Slices - no toppings"),
	        		
	        		"id[2]", Is.is("3"), 
	        		
	        		"items[2].item[0]", Is.is(1),
	        		"items[2].pizza[0]", Is.is("Small 6 Slices - 1 topping"),
	        		"items[2].toppings[0][0]", Is.is("Mushrooms")
	        		);
        
    }
}
