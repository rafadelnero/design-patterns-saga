package com.designpatternsaga.singleton;

public class Logger {
	
	private static Logger logger = null;
	
	private Logger() {
		super();
	}

	public static Logger getInstance() {
		if (logger == null) {
			synchronized (Logger.class) {
				if (logger == null) {
					logger = new Logger();
				}
			}
		}
		
		return logger;
	}

}
