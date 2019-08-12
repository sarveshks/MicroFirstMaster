package com.sks.currencyexchangeservice.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.sks.currencyexchangeservice.beans.CurrencyExchangeValueResponse;
import com.sks.currencyexchangeservice.entity.CurrencyExchangeValueEntity;
import com.sks.currencyexchangeservice.repository.CurrencyExchangeServiceRepository;
import com.sks.currencyexchangeservice.service.ICurrencyExchangeService;

@Service
public class CurrencyExchangeServiceImpl implements ICurrencyExchangeService {

	@Autowired
	private CurrencyExchangeServiceRepository repository;
	
	@Autowired
	private Environment environment;

	@Override
	public CurrencyExchangeValueResponse findExchangeValue(String from, String to) {
		CurrencyExchangeValueResponse exchangeValue = new CurrencyExchangeValueResponse();
		CurrencyExchangeValueEntity entity = new CurrencyExchangeValueEntity();
		exchangeValue.setFrom(from);
		exchangeValue.setTo(to);
		BeanUtils.copyProperties(exchangeValue, entity);
		CurrencyExchangeValueEntity responseEntity = repository.findByFromAndTo(entity.getFrom(), entity.getTo());
		responseEntity.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		BeanUtils.copyProperties(responseEntity, exchangeValue);
		return exchangeValue;
	}// findExchangeValue(-,-)
}// class
