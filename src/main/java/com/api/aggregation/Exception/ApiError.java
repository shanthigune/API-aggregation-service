package com.api.aggregation.Exception;

import com.api.aggregation.Constants.ApiConstants;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;


@Data
class ApiError
{

	private HttpStatus status;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = ApiConstants.DATE_FORMAT)
	private LocalDateTime timestamp;
	private String message;
	private String debugMessage;
	private String path;

	private ApiError()
	{
		timestamp = LocalDateTime.now();
	}

	ApiError( HttpStatus status )
	{
		this();
		this.status = status;
	}

	ApiError( HttpStatus status, Throwable ex )
	{
		this(status);
		this.message = "Unexpected error";
		this.debugMessage = ex.getLocalizedMessage();
	}

	ApiError( HttpStatus status, String message, Throwable ex )
	{
		this(status,ex);
		this.message = message;
	}

    ApiError( HttpStatus status, String message,String path, Throwable ex )
    {
        this(status,message,ex);
        this.path = path;

    }
}