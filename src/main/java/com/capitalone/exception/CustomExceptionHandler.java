//package com.capitalone.exception;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//@RestControllerAdvice
//public class CustomExceptionHandler {
//
//	@ResponseStatus(HttpStatus.BAD_REQUEST)
//	@ExceptionHandler(MethodArgumentNotValidException.class)
//	public Map<String, String> handleInvalidArgument(MethodArgumentNotValidException exception) {
//		 Map<String, String> map =  new HashMap()<>();
//	        exception.getBindingResult().getFieldErrors().forEach(fieldError -> {
//	            map.put(fieldError.getField(), fieldError.getDefaultMessage());
//	        });
//
//	        return map;
//	}
//}