package com.sks.currencyexchangeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sks.currencyexchangeservice.beans.CurrencyExchangeValueResponse;
import com.sks.currencyexchangeservice.service.ICurrencyExchangeService;

@RestController
@RequestMapping("/currency-exchange")
public class CurrencyExchangeServiceController {

	@Autowired
	private ICurrencyExchangeService service;

	@GetMapping("/from/{from}/to/{to}")
	public CurrencyExchangeValueResponse getExchangeValue(@PathVariable String from, @PathVariable String to) {

		return service.findExchangeValue(from, to);
	}

}// class
