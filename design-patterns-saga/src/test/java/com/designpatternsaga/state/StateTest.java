package com.designpatternsaga.state;

import org.junit.Assert;
import org.junit.Test;

import com.designpatternsaga.state.badexample.AutomaticWindow;

public class StateTest {
	
	@Test
	public void stateTest() {
		TrafficLight trafficLight = new TrafficLight();
		
		trafficLight.changeState();
		
		trafficLight.changeState();
		
		trafficLight.changeState();
		
		trafficLight.changeState();
		
		Assert.assertEquals(trafficLight.state.getClass(), 
				GreenTrafficLightState.class);
	}
	
	@Test
	public void badExampleStateTest() {
		AutomaticWindow automaticWindow = new AutomaticWindow();
		
		automaticWindow.openWindow();
		
		automaticWindow.closeWindow();
		
		Assert.assertEquals(automaticWindow.toString(), 
				"Window is closed");
	}
	
}
