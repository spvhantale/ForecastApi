package com.weather.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.weather.exception.RequestException;
import com.weather.model.JsonData;
import com.weather.model.JsonData1;


@Service
public class MyServiceImpl implements MyService{

	@Autowired
	private RestTemplate restTemplate;
	private static String url="https://forecast9.p.rapidapi.com/rapidapi/forecast/";
	private static String xRapidApi="8cfec7ed71msh5171ae94d556119p1514a6jsnec75adf16030";
	private static String xRapidHost="forecast9.p.rapidapi.com";
	private static String apiHourly="bc8013730a8cc2152a4e7606fd3ec087";
	private static String urlHourly="https://api.openweathermap.org/data/2.5/forecast?q=";

	@Override
	public JsonData getforecastDataByLocationName(String cityName) throws RequestException{
		
			HttpHeaders header=new HttpHeaders();
			header.set("X-RapidAPI-Key",xRapidApi);
			header.set("X-RapidAPI-Host", xRapidHost);
			url=url+cityName+"/summary/";
			ResponseEntity<JsonData> response=restTemplate.exchange(url, HttpMethod.GET,new HttpEntity<>(header),JsonData.class);
			JsonData jsonData= response.getBody();
			if(jsonData==null) {
				throw new RequestException("Not found");
			}else {
				return jsonData;
			}
			
		
	}


	@Override
	public JsonData1 getforecastDataHourlyByLocationName(String cityName) throws RequestException{
		urlHourly=urlHourly+cityName+"&appid="+apiHourly;
		ResponseEntity<JsonData1> response= restTemplate.getForEntity(urlHourly, JsonData1.class);
		JsonData1 jsonData1= response.getBody();
		if(jsonData1==null) {
			throw new RequestException("Not found");
		}else {
			return jsonData1;
		}
	}

}
