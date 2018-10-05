package httpclient;

import httpclient.exceptions.GoneException;
import httpclient.exceptions.NotFoundException;
import httpclient.exceptions.TooManyRequestsException;
import httpclient.exceptions.UnauthenticationException;

public enum HttpStatusCode {

	BADREQUEST(400, new IllegalArgumentException("Status Code 400: Bad Request. Check your syntax and make sure it is correct")),
	UNAUTHORIZED(401, new UnauthenticationException("Status Code 401: Unauthorized. Check your autentication and make sure it is correct")),
	FORBIDDEN(403, new IllegalAccessException("Status Code 403: Forbidden. You do not have authorization to access what you have requested")),
	NOTFOUND(404, new NotFoundException("Status Code 404: Not Found. Your request was not found")),
	GONE(410, new GoneException("Status Code 410: Gone. The content you've requested has been deleted")),
	TOOMANYREQUESTS(429, new TooManyRequestsException("Status Code 429: You have requested too many times"));
	
	private int statusCode;
	private Exception exception;
	
	HttpStatusCode(int statusCode, Exception exception) {
		this.statusCode = statusCode;
		this.exception = exception;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public Exception getException() {
		return exception;
	}
	
	public static HttpStatusCode getHttpStatusCodeThroughStatusCode(int statusCode) {
		for (HttpStatusCode httpStatusCode : HttpStatusCode.values()) {
			if (statusCode == httpStatusCode.getStatusCode()) {
				return httpStatusCode;
			}
		}
		return null;
	}
}