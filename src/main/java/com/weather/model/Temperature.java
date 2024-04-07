package com.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Temperature {

	@JsonProperty("min")
	private Integer min;
	@JsonProperty("max")
	private Integer max;
	@JsonProperty("avg")
	private Integer avg;
}
