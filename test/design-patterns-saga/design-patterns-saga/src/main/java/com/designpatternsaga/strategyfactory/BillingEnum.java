package com.designpatternsaga.strategyfactory;

/**
 * Contains the commands of the Services.
 * @author Rafael Del Nero
 */
public enum BillingEnum {
	
	CALCULATION("744"),
	PRE_CALCULATION("755");
	
	private String code;
	
	private BillingEnum(String code) {
		this.code = code;
	}
	
	public static BillingEnum parse(String code) {
		for (BillingEnum billingEnum : BillingEnum.values()) {
			if (billingEnum.getCode().equals(code)) {
				return billingEnum;
			}
		}
		
		throw new IllegalArgumentException("The code is unknown");
	}

	public String getCode() {
		return code;
	}
	
}
