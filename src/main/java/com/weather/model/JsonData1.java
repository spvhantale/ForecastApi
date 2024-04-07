package com.weather.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonData1 {

	@JsonProperty("cod")
	private String cod;
	@JsonProperty("message")
	private Integer message;
	@JsonProperty("cnt")
	private Integer cnt;
	@JsonProperty("list")
	private List<ListData> list; 
}
