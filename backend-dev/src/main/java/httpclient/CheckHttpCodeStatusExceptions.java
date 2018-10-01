package httpclient;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;

public class CheckHttpCodeStatusExceptions {
	
	private CheckHttpCodeStatusExceptions() {}

	public static void checkHttpResponse(HttpResponse<JsonNode> httpResponse) throws Exception {
		HttpStatusCode httpStatusCode = HttpStatusCode.getHttpStatusCodeThroughStatusCode(httpResponse.getStatus());
		
		if (httpStatusCode != null) {
			throw httpStatusCode.getException();
		}
	}
}
