package httpclienttest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class HttpTest {

	@Test
	public void shouldReturnStatusOkay() throws UnirestException {
	    HttpResponse<JsonNode> jsonResponse 
	      = Unirest.get("http://www.mocky.io/v2/5a9ce37b3100004f0ab5154")
	      .asJson();
	 
	    assertNotNull(jsonResponse.getBody());
	    assertEquals(200, jsonResponse.getStatus());
	}
}
