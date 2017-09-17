package com.designpatternsaga.state.badexample;

public class AutomaticWindow {

	final static int CLOSED = 0;
	final static int OPEN = 1;

	int state = CLOSED;

	public AutomaticWindow() {
		super();
	}

	public void openWindow() {
		if (state == OPEN) {
			System.out.println("Window is already open");
		} else if (state == CLOSED) {
			System.out.println("Opening window.");
			state = OPEN;
		}
	}

	public void closeWindow() {
		if (state == OPEN) {
			System.out.println("Closing window.");
			state = CLOSED;
		} else if (state == CLOSED) {
			System.out.println("Window is already closed.");
		}
	}

	public String toString() {
		if (state == OPEN) {
			return "Window is open";
		} else {
			return "Window is closed";
		}
	}
}
