package com.sks.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sks.currencyexchangeservice.entity.CurrencyExchangeValueEntity;

public interface CurrencyExchangeServiceRepository extends JpaRepository<CurrencyExchangeValueEntity, Long> {
	
	CurrencyExchangeValueEntity findByFromAndTo(String from, String to);

}
