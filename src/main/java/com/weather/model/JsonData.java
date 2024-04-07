package com.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonData {

	@JsonProperty("location")
	private Location location;
	@JsonProperty("forecast")
	private Forecast forecast;
	
	
}
