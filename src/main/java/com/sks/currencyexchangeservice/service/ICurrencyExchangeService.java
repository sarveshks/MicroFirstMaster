package com.sks.currencyexchangeservice.service;

import com.sks.currencyexchangeservice.beans.CurrencyExchangeValueResponse;

public interface ICurrencyExchangeService {

	CurrencyExchangeValueResponse findExchangeValue(String from, String to);

}
