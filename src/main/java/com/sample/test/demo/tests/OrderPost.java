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

public class OrderPost extends BaseTest {

    private static final String url = "https://my-json-server.typicode.com/sa2225/demo/orders";


    @Test
    public void orderPost() throws JsonParseException, JsonMappingException, IOException {
    	
    	Order orders = null;
        ObjectMapper mapper = new ObjectMapper();    
        String filePath = new File("").getAbsolutePath();
        
        try
	        {
	        	orders =  mapper.readValue(new File(filePath+"/src/test/resources/payloads/orders.json"), Order.class);} 
        catch (JsonGenerationException e)
	        {
	           e.printStackTrace();
	         } 
        catch (JsonMappingException e)
	        {
	           e.printStackTrace();
	         } 
        catch (IOException e)
	        {
	           e.printStackTrace();
	     }

    	
        given().
        when().
        		header("Content-Type","application/json").
        		body(orders).
        		post(url).
        then().
        		assertThat().statusCode(201);
    }


}
