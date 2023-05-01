package com.api.aggregation.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;



@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler
{
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Object> resourceEntityNotFound(ResourceNotFoundException ex )
	{
		ApiError apiError = createError( ex.getLocalizedMessage(), HttpStatus.BAD_REQUEST, ex );
		return new ResponseEntity<>( apiError, apiError.getStatus() );
	}


	private ApiError createError( String msg, HttpStatus status, Exception e )
	{
		ApiError apiError = new ApiError( status );
		apiError.setMessage( msg );
		apiError.setDebugMessage( e.getMessage() );
		return apiError;
	}

}
