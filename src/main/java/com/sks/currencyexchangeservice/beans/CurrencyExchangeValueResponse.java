package com.sks.currencyexchangeservice.beans;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyExchangeValueResponse {

	private int id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private int port;

}// class
