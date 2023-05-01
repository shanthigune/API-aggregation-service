package com.api.aggregation.results;

import com.api.aggregation.Exception.ResourceNotFoundException;
import com.api.aggregation.domain.ResponseDto;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Resultset<T>
{
	private HttpStatus status;

	private ResponseDto responseDto;

	public Resultset(ResponseDto o, HttpStatus status ) throws ResourceNotFoundException
	{
		this.status = status;
		this.responseDto = o;
	}

	public Resultset(HttpStatus status ) throws ResourceNotFoundException
	{
		this.status = status;
	}

}
