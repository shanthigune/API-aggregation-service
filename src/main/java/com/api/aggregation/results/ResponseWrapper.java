package com.api.aggregation.results;

import com.api.aggregation.domain.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SuppressWarnings("unchecked")
public class ResponseWrapper<T> extends ResponseEntity<T>
{
	public ResponseWrapper(ResponseDto t, HttpStatus status )
	{
		super( ( T ) new Resultset<>( t, status ), status );
	}
	public ResponseWrapper(HttpStatus status )
	{
		super( ( T ) new Resultset<>( status ), status );
	}

}
