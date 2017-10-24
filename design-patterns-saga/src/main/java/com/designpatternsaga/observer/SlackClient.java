package com.designpatternsaga.observer;

public class SlackClient extends Observer {

	public SlackClient(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}
	
	public void addMessage(String message) {
		subject.setState(message + " - sent from Slack");
	}
	
	@Override
	void update() {
		System.out.println("Slack Stream: " + subject.getState());
	}

}
