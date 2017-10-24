package com.designpatternsaga.observer;

public abstract class Observer {
	protected Subject subject;
	abstract void update();
}
