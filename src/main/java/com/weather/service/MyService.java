package com.weather.service;

import com.weather.model.JsonData;
import com.weather.model.JsonData1;


public interface MyService {

	public JsonData getforecastDataByLocationName(String cityName);
	public JsonData1 getforecastDataHourlyByLocationName(String cityName);
}
