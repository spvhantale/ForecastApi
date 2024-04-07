package com.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weather.model.JsonData;
import com.weather.model.Location;
import com.weather.model.ResultDTO;
import com.weather.service.MyService;

@RestController
@RequestMapping("/forest")
public class ForecastController {

	@Autowired
	private MyService myService;
	
	@GetMapping("/{cityName}")
	public ResponseEntity<ResultDTO> getforecastDataforCity(@PathVariable("cityName") String cityName){
		
		return new ResponseEntity<ResultDTO>(myService.getforecastDataByLocationName(cityName), HttpStatus.OK);
		
	}
	
}
