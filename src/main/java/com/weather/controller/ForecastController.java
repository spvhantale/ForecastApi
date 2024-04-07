package com.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weather.exception.RequestException;
import com.weather.model.JsonData;
import com.weather.model.JsonData1;
import com.weather.service.MyService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/forecast")
public class ForecastController {

	@Autowired
	private MyService myService;
	
	@GetMapping("/home")
	public ResponseEntity<String> home(){
		return new ResponseEntity<String>("Hello,Home",HttpStatus.OK);
	}
	
	@GetMapping("/summary")
	public ResponseEntity<JsonData> getforecastDataforCity(@RequestParam String cityName) throws RequestException{
		
		return new ResponseEntity<JsonData>(myService.getforecastDataByLocationName(cityName), HttpStatus.OK);
		
	}
	@GetMapping("/hourly")
	public ResponseEntity<JsonData1> getforecastDataForHourlyforCity(@RequestParam String cityName) throws RequestException{
		
		return new ResponseEntity<JsonData1>(myService.getforecastDataHourlyByLocationName(cityName), HttpStatus.OK);
		
	}
	
}
