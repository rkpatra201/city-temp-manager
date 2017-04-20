package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.command.CityTemp;
import com.spring.service.CityTempService;

@Controller
public class CityTempController {

	@Autowired
	CityTempService service;

	@RequestMapping("/citytemp")
	public ResponseEntity<String> getIndex() {
		ResponseEntity<String> response = new ResponseEntity<String>("cityTempIndexPage", HttpStatus.OK);
		return response;
	}

	@RequestMapping(value="/get-city-{inputPrefix}-temp-list")
	public ResponseEntity<List<CityTemp>> getTempList(@PathVariable("inputPrefix") String prefix) {
		List<CityTemp> list=service.loadAll(prefix);
		ResponseEntity<List<CityTemp>> response = new ResponseEntity<List<CityTemp>>(list,
				HttpStatus.OK);
		return response;
	}
}
