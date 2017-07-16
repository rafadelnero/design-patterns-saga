package com.designpatternsaga.command;

public class ThreadCommandExample {

	public static void main(String[] args) {
		TaskCommand command = new TaskCommand(10, 12); 
	
		Thread invoker = new Thread(command);
		invoker.start(); 
	}
	
	static class TaskCommand implements Runnable {
		
		int num1;
		int num2;
		
		TaskCommand(int num1, int num2) {
			this.num1 = num1;
			this.num2 = num2;
		}
		
		@Override
		public void run() { //execute method
			System.out.println(num1 * num2); //receiver
		}
	}
}


