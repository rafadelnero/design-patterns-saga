package com.designpatternsaga.state;

public class YellowTrafficLightState extends State {

	private TrafficLight trafficLight;

	public YellowTrafficLightState(TrafficLight trafficLight) {
		this.trafficLight = trafficLight;
	}

	@Override
	public void handleRequest() {
		System.out.println("Turning traffic light to red.");
		trafficLight.setState(trafficLight.getRedLightState());
	}

	public String toString() {
		return "Traffic light is yellow.";
	}
}
