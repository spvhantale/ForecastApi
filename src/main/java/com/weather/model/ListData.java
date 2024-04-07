package com.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListData {
	@JsonProperty("dt")
	private Long dt;
	@JsonProperty("main")
	private MainData main;
	@JsonProperty("weather")
	private WeatherData[] weather;
	@JsonProperty("clouds")
	private Cloud clouds;
	@JsonProperty("wind")
	private WindData wind;
	@JsonProperty("visibility")
	private int visibility;
	@JsonProperty("pop")
	private int pop;
	@JsonProperty("sys")
	private SysData sys;
	@JsonProperty("dt_txt")
	private String dateTimeText;
	
}
