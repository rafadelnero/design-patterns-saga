package com.designpatternsaga.templatemethod;

import java.util.Date;

public abstract class UserActionsLog {
	
	private String userName;
	
	private boolean logCreated;
	
	protected UserActionsLog(String userName) {
		createLogFile();
		this.userName = userName;
	}

	private void generateHeaderLog() {
		System.out.println("Log Date:" +  new Date());
	}
	
	public abstract void generateBodyLog();
	
	private void generateBottomLog() {
		System.out.println("Action executed by:" + userName);
	}
	
	public void generateLog() {
		generateHeaderLog();
		generateBodyLog();
		generateBottomLog();
		verifyLogFile();
	}

	private void createLogFile() {
		System.out.println("Creating log file....");
	}
	
	private void verifyLogFile() {
		System.out.println("Verifying if the file and log was created.");
		logCreated = true;
	}

	public boolean isLogCreated() {
		return logCreated;
	}
	
}
