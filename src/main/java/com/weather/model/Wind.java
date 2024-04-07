package com.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wind {

	@JsonProperty("unit")
	private String unit;
	@JsonProperty("direction")
	private String direction;
	@JsonProperty("text")
	private String text;
	@JsonProperty("avg")
	private Integer avg;
	@JsonProperty("min")
	private Integer min;
	@JsonProperty("max")
	private Integer max;
	@JsonProperty("gusts")
	private Gusts gusts;
	@JsonProperty("significationWind")
	private Boolean significationWind;
}
