package com.spring.exceptions;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(DataNotFoundException.class)
	@ResponseBody
	public Map<String, String> handleDataNotFoundException(HttpServletResponse res, DataNotFoundException e) {
		Map<String, String> errorMap = new LinkedHashMap<String, String>();

		errorMap.put("Error-Code", "1404");
		errorMap.put("Error-Message", e.getMessage());
		
		res.setHeader("error", errorMap.toString());
		return errorMap;
	}
}
