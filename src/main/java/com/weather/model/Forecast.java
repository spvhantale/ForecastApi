package com.weather.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Forecast {

	@JsonProperty("items")
	private List<Item> items;
	@JsonProperty("forecastDate")
	private String forecastDate;
	@JsonProperty("nextUpdate")
	private String nextUpdate;
	@JsonProperty("source")
	private String source;
	@JsonProperty("point")
	private String point;
	@JsonProperty("fingerprint")
	private String fingerprint;
}
