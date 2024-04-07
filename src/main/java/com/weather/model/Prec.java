package com.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prec {

	@JsonProperty("sum")
	private Integer sum;
	@JsonProperty("probability")
	private Integer probability;
	@JsonProperty("sumAsRain")
	private Integer sumAsRain;
	@JsonProperty("class")
	private Integer precClass;
	
}
