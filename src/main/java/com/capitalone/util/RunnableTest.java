package com.capitalone.util;

public class RunnableTest implements Runnable{
	
	private Thread t;
	private String threadName;
	

	public RunnableTest(String name) {
		// TODO Auto-generated constructor stub
		threadName = name;
		System.out.println("Creating: " +threadName);
	}
	
	

	@Override
	public void  run() {
		// TODO Auto-generated method stub
	System.out.println("Running the thread: " + threadName);
	   try {
		for(int i = 0; i<=5; i++) {
			System.out.println("Thread: "+ threadName + " i " +i );
			Thread.sleep(100);		
			
		}
	   }catch(InterruptedException e) {
		   System.out.println("Thread: " +threadName + " interrued. ");
	   }
		System.out.println("Thread "+threadName+ "exiting. ");
	}
	
	public void start() {
		System.out.println("Starting: "+threadName);
		if(t == null) {
		  t = new Thread(this, threadName);
		  t.start();
		}
	}
	
	
	public static void main(String[] args) {
		RunnableTest t1 = new RunnableTest("Thread - 1");
		t1.start();
		
		RunnableTest t2 = new RunnableTest("Thread - 2");
		t2.start();
	}

}
