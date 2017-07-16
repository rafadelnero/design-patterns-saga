package com.designpatternsaga.builder;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

import com.designpatternsaga.builder.Calculation;
import com.designpatternsaga.builder.Price;

public class BuilderTest {

    private static final long ID_CALCULATION = 1L;

    private static final long ID_PERIODICITY = 1L;

    private static final long ID_CURRENCY = 1L;

    private static final Date DT_CALCULATION = new Date();

    private static final BigDecimal PRICE_VALUE_1 = BigDecimal.ONE;
    private static final BigDecimal PRICE_VALUE_2 = BigDecimal.TEN;

    @Test
    public void validateCalculationInformationTest() {
	Calculation calculation = new Calculation.Builder(ID_CALCULATION, ID_PERIODICITY).withDate(DT_CALCULATION)
		.withPrice(ID_CURRENCY, PRICE_VALUE_1).withPrice(ID_CURRENCY, PRICE_VALUE_2).build();

	Assert.assertEquals(ID_CALCULATION, calculation.getIdCalculation());
	Assert.assertEquals(ID_PERIODICITY, calculation.getIdPeriodicity());
	Assert.assertEquals(DT_CALCULATION, calculation.getDtCalculation());

	Iterator<Price> iterator = calculation.getPrices().iterator();
	Price firstPrice = iterator.next();
	Price secondPrice = iterator.next();

	Assert.assertEquals(ID_CURRENCY, firstPrice.getIdCurrency());
	Assert.assertEquals(PRICE_VALUE_1, firstPrice.getPriceValue());

	Assert.assertEquals(ID_CURRENCY, secondPrice.getIdCurrency());
	Assert.assertEquals(PRICE_VALUE_2, secondPrice.getPriceValue());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void validatePricesIsImmutableTest() {
	Calculation calculation = new Calculation.Builder(ID_CALCULATION, ID_PERIODICITY).build();

	calculation.getPrices()
		.add(new Price.Builder(new Random().nextLong()).withPrice(ID_CURRENCY, PRICE_VALUE_1).build());
    }
    
}
