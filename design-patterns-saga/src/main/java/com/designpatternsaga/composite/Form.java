package com.designpatternsaga.composite;

public class Form extends UIComponent {
	
	String name;
	
	public Form(String name) {
		this.name = name;
	}
	
	@Override
	public UIComponent add(UIComponent uiComponent) {
		uiComponents.add(uiComponent);
		
		return uiComponent;
	}
	
	@Override
	public UIComponent remove(UIComponent uiComponent) {
		uiComponents.remove(uiComponent);
		
		return uiComponent;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("<form name='")
				.append(name).append("'>");
		
		uiComponents.forEach(e -> builder.append("\n")
				.append(e));
		
		builder.append("\n</form>");
		return builder.toString();
	}
}
