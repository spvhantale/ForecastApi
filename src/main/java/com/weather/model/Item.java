package com.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {

	@JsonProperty("date")
	private String date;
	@JsonProperty("dateWithTimezone")
	private String dateWithTimezone;
	@JsonProperty("freshSnow")
	private Integer freshSnow;
	@JsonProperty("snowHeight")
	private Integer snowHeight;
	@JsonProperty("weather")
	private Weather weather;
	@JsonProperty("prec")
	private Prec prec;
	@JsonProperty("sunHours")
	private Integer sunHours;
	@JsonProperty("rainHours")
	private Integer rainHours;
	@JsonProperty("temperature")
	private Temperature temperature;
	@JsonProperty("wind")
	private Wind wind;
	@JsonProperty("windchill")
	private Windchill windchill;
	@JsonProperty("snowLine")
	private SnowLine snowLine;
	@JsonProperty("astronomy")
	private Astronomy astronomy;
}
