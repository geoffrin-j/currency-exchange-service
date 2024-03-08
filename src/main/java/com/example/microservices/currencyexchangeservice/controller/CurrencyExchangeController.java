package com.example.microservices.currencyexchangeservice.controller;

import com.example.microservices.currencyexchangeservice.controller.entity.CurrencyExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private Environment environment;
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchangeValue(@PathVariable String from,
                                                  @PathVariable String to){
        CurrencyExchange currencyExchange = new CurrencyExchange(90L, "USD", "INR", BigDecimal.ONE, environment.getProperty("local.server.port"));
        return currencyExchange;
    }
}
