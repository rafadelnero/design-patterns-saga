package com.designpatternsaga.chainofresponsibility;

public abstract class Handler {
	protected Handler successor;
	
	public void setSucessor(Handler successor) {
		this.successor = successor;
	}
	
	public abstract Response handleRequest(Request request);
	
}
