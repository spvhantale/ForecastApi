package com.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weather.model.JsonData;
import com.weather.model.JsonData1;
import com.weather.service.MyService;

@RestController
@RequestMapping("/forest")
public class ForecastController {

	@Autowired
	private MyService myService;
	
	@GetMapping("/{cityName}")
	public ResponseEntity<JsonData> getforecastDataforCity(@PathVariable("cityName") String cityName){
		
		return new ResponseEntity<JsonData>(myService.getforecastDataByLocationName(cityName), HttpStatus.OK);
		
	}
	@GetMapping("/hourly/{cityName}")
	public ResponseEntity<JsonData1> getforecastDataForHourlyforCity(@PathVariable("cityName") String cityName){
		
		return new ResponseEntity<JsonData1>(myService.getforecastDataHourlyByLocationName(cityName), HttpStatus.OK);
		
	}
	
}
