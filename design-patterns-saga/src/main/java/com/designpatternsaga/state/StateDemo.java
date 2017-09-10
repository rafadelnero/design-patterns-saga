package com.designpatternsaga.state;

public class StateDemo {

	public static void main(String[] args) {
		TrafficLight trafficLight = new TrafficLight();
		
		System.out.println(trafficLight);
		
		trafficLight.changeState();
		
		System.out.println(trafficLight);
		
		trafficLight.changeState();
		
		System.out.println(trafficLight);
		
		trafficLight.changeState();
		
		System.out.println(trafficLight);
		
		trafficLight.changeState();
		
		System.out.println(trafficLight);
	}
}
