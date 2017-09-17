package com.designpatternsaga.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class UIComponent {
	
	List<UIComponent> uiComponents = new ArrayList<>();
	
	public UIComponent add(UIComponent uiComponent) {
		throw new UnsupportedOperationException
			("Feature not implemented at this level");
	}

	public UIComponent remove(UIComponent uiComponent) {
		throw new UnsupportedOperationException
			("Feature not implemented at this level");
	}
	
	public abstract String toString();
	
}
