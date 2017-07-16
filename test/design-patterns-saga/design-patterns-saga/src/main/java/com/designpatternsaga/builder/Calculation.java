package com.designpatternsaga.builder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Calculation {
	
	private long idCalculation;
	
	private long idPeriodicity;
	
	private List<Price> prices;
	
	private Date dtCalculation;
	
	private Calculation() {
		prices = new ArrayList<>();
	}
	
	public static class Builder {
		
		private Calculation calculation = new Calculation();
		
		public Builder(long idCalculation, long idPeriodicity) {
			calculation.setIdCalculation(idCalculation);
			calculation.setIdPeriodicity(idPeriodicity);
		}
		
		public Builder withDate(Date dtCalculation) {
			calculation.setDtCalculation(dtCalculation);
			
			return this;
		}
		
		public Builder withPrice(long idCurrency, BigDecimal priceValue) {
			Price price = new Price.Builder(new Random().nextLong()).withPrice(idCurrency, priceValue).build();
			calculation.prices.add(price);
			
			return this;
		}
		
		public Calculation build() {
			return calculation;
		}
		
	}

	private final void setIdCalculation(long idCalculation) {
		this.idCalculation = idCalculation;
	}

	private final void setIdPeriodicity(long idPeriodicity) {
		this.idPeriodicity = idPeriodicity;
	}

	private final void setDtCalculation(Date dtCalculation) {
		this.dtCalculation = dtCalculation;
	}

	public final long getIdCalculation() {
		return idCalculation;
	}

	public final long getIdPeriodicity() {
		return idPeriodicity;
	}

	public final Date getDtCalculation() {
		return dtCalculation;
	}

	public final Collection<Price> getPrices() {
		return Collections.unmodifiableCollection(prices);
	}
	
}
