package com.weather.exception;

import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {

	@ExceptionHandler(RequestException.class)
	public ResponseEntity<MyError> getAddressException(RequestException re,WebRequest req){
		
		MyError mr=new MyError(LocalTime.now(), re.getMessage(), req.getDescription(false));
		return new ResponseEntity<MyError>(mr, HttpStatus.BAD_REQUEST);
	}
}
