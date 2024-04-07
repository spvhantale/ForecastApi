package com.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Weather {

	@JsonProperty("state")
	private Integer state;
	@JsonProperty("text")
	private String text;
	@JsonProperty("icon")
	private String icon;
	
}
