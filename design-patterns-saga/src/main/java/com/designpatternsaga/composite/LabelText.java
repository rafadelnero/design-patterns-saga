package com.designpatternsaga.composite;

public class LabelText extends UIComponent {
	
	String value;
	
	public LabelText(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return new StringBuilder("<label value='").append(value)
				.append("'/>").toString();
	}
}

