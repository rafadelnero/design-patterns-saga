package com.designpatternsaga.composite;

public class InputText extends UIComponent {
	
	String name;
	String value;
	
	public InputText(String name, String value) {
		this.name = name;
		this.value = value;
	}

	@Override
	public String toString() {
		return new StringBuilder("<inputText name='").append(name)
				.append("' value='").append(value)
				.append("'/>").toString();
	}
}

