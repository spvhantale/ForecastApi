package com.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Astronomy {

	@JsonProperty("dawn")
	private String dawn;
	@JsonProperty("sunrise")
	private String sunrise;
	@JsonProperty("suntransit")
	private String suntransit;
	@JsonProperty("sunset")
	private String sunset;
	@JsonProperty("dusk")
	private String dusk;
	@JsonProperty("moonrise")
	private String moonrise;
	@JsonProperty("moontransit")
	private String moontransit;
	@JsonProperty("moonset")
	private String moonset;
	@JsonProperty("moonphase")
	private Integer moonphase;
	@JsonProperty("moonzodiac")
	private Integer moonzodiac;
}
