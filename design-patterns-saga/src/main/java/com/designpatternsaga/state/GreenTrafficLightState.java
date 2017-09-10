package com.designpatternsaga.state;

public class GreenTrafficLightState extends State {

	private TrafficLight trafficLight;
	
	public GreenTrafficLightState(TrafficLight trafficLight) {
		this.trafficLight = trafficLight;
	}
	
	@Override
	public void handleRequest() {
		System.out.println("Turning traffic light to yellow.");
		trafficLight.setState(trafficLight.getYellowLightState());
	}
	
	public String toString() {
		return "Traffic light is green.";
	}
}
