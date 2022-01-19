package com.currency.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.currency.entity.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
	CurrencyExchange findByFromAndTo(String from, String to);
}
