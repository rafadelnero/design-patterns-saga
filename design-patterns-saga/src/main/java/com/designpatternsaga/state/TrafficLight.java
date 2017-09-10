package com.designpatternsaga.state;

public class TrafficLight {

	State red;
	State yellow;
	State green;
	
	State state;
	
	public TrafficLight() {
		red = new RedTrafficLightState(this);
		yellow = new YellowTrafficLightState(this);
		green = new GreenTrafficLightState(this);
		
		state = red;
	}
	
	public void changeState() {
		state.handleRequest();
	}
	
	public String toString() {
		return state.toString();
	}
	
	public State getGreenLightState() {
		return green;
	}

	public State getYellowLightState() {
		return yellow;
	}
	
	public State getRedLightState() {
		return red;
	}
	
	public void setState(State state) {
		this.state = state;
	}
}


