package com.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherData {
	@JsonProperty("id")
	private int id;
	@JsonProperty("main")
    private String main;
	@JsonProperty("description")
    private String description;
	@JsonProperty("icon")
    private String icon;
}
