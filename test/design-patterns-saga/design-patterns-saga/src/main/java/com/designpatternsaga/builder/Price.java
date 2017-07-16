package com.designpatternsaga.builder;

import java.math.BigDecimal;

public class Price {

	private long idPrice;

	private long idCurrency;
	
	private BigDecimal priceValue;
	
	private Price() {
		super();
	}
	
	public static class Builder {
		
		private Price price = new Price();
		
		public Builder(long idPrice) {
			price.setIdPrice(idPrice);
		}

		public Builder withPrice(long idCurrency, BigDecimal value) {
			price.setIdCurrency(idCurrency);
			price.setPriceValue(value);
			
			return this;
		}
		
		public Price build() {
			return this.price;
		}

	}

	private final void setIdPrice(long idPrice) {
		this.idPrice = idPrice;
	}

	private final void setIdCurrency(long idCurrency) {
		this.idCurrency = idCurrency;
	}

	private final void setPriceValue(BigDecimal priceValue) {
		this.priceValue = priceValue;
	}

	public final long getIdPrice() {
		return idPrice;
	}

	public final long getIdCurrency() {
		return idCurrency;
	}

	public final BigDecimal getPriceValue() {
		return priceValue;
	}
	
}
