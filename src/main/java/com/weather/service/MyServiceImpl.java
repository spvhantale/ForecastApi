package com.weather.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import com.weather.model.JsonData;
import com.weather.model.Location;
import com.weather.model.ResultDTO;

@Service
public class MyServiceImpl implements MyService{

	@Autowired
	private RestTemplate restTemplate;
	private static String url="https://forecast9.p.rapidapi.com/rapidapi/forecast/";
	private static String xRapidApi="8cfec7ed71msh5171ae94d556119p1514a6jsnec75adf16030";
	private static String xRapidHost="forecast9.p.rapidapi.com";
	

	@Override
	public ResultDTO getforecastDataByLocationName(String cityName) {
		try {
			HttpHeaders header=new HttpHeaders();
			header.set("X-RapidAPI-Key",xRapidApi);
			header.set("X-RapidAPI-Host", xRapidHost);
			url=url+cityName+"/summary/";
			ResponseEntity<JsonData> response=restTemplate.exchange(url, HttpMethod.GET,new HttpEntity<>(header),JsonData.class);
			JsonData jsonData= response.getBody();
			ResultDTO resultDTO=new ResultDTO(jsonData.getLocation());
			return resultDTO;
		}catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"Exception while getting information",e);
		}
	}

}
