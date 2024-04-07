package com.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WindData {

	@JsonProperty("speed")
	private double speed;
	@JsonProperty("deg")
	private int deg;
	@JsonProperty("gust")
	private double gust;
}
