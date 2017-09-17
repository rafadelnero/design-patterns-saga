package com.designpatternsaga.composite;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class CompositeTest {
	
	public static final int EXPECTED_MAP_SIZE = 3;

	@Test
	public void compositeTest() {
		Form mainForm = new Form("frmCustomer");
		
		LabelText lblCustomerName = new LabelText("Customer name:");
		InputText txtCustomerName = new InputText("txtCustomerName", 
				"Juggy");

		LabelText lblCustomerProduct = new LabelText("Product:");
		InputText txtCustomerProduct = new InputText("txtCustomerProduct", 
				"Alienware laptop");

		mainForm.add(lblCustomerName);
		mainForm.add(txtCustomerName);
		mainForm.add(lblCustomerProduct);
		mainForm.add(txtCustomerProduct);
		
		Assert.assertEquals("<label value='Customer name:'/>",
				lblCustomerName.toString());
		Assert.assertEquals("<inputText name='txtCustomerName'"
				+ " value='Juggy'/>",
				txtCustomerName.toString());
		Assert.assertEquals("<inputText name='txtCustomerProduct'"
				+ " value='Alienware laptop'/>",
				txtCustomerProduct.toString());
		Assert.assertEquals("<label value='Product:'/>",
				lblCustomerProduct.toString());
	}
	
	@Test
	public void javaAPICompositeTest() {
		Map<String, String> topWebComponents = new HashMap<>();
		
		topWebComponents.put("Component1", "HTML");
		topWebComponents.put("Component2", "InputText");
		
		Map<String, String> normalWebComponents = new HashMap<>();
		
		normalWebComponents.put("Component3", "LabelText");
		
		Map<String, String> container = new HashMap<>();
		
		container.putAll(topWebComponents);
		container.putAll(normalWebComponents);
		
		Assert.assertEquals(EXPECTED_MAP_SIZE, container.size());
	}

}
