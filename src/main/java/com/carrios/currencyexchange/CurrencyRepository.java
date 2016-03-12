package com.carrios.currencyexchange;

import org.springframework.data.repository.CrudRepository;

public interface CurrencyRepository extends CrudRepository<Currency, Long> {

    public Currency findCurrencyByCode(String code);

}
