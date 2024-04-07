package com.weather.service;

import com.weather.model.JsonData;
import com.weather.model.ResultDTO;

public interface MyService {

	public ResultDTO getforecastDataByLocationName(String cityName);
}
