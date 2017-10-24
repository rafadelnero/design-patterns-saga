package com.designpatternsaga.observer;

public class WhatsAppClient extends Observer {

	public WhatsAppClient(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}
	
	public void addMessage(String message) {
		subject.setState(message + " - sent from WhatsApp");
	}
	
	@Override
	void update() {
		System.out.println("WhatsApp Stream: " + subject.getState());
	}
}
