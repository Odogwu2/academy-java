package com.bptn.course._multithreading_self_led;

public class Multithreading {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			MultithreadThing test1 = new MultithreadThing(i);
			
			//when implementing the Runnable interface, you will make one small change to the code here
			//Thread myThread = new Thread(test1) //you pass the object in the ()
			//then instead of the objName.start(); you'll say myThread.start(); 
			test1.start();
			
//			try {
//				test1.join();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} 
		}
		//throw new RuntimeException(); 
		
		
		//creating new object of my multithread class. 
//		MultithreadThing test1 = new MultithreadThing(); 
//		MultithreadThing test2 = new MultithreadThing();
		
		//syntax for having a thread start running an operation. 
//		test1.start();
//		test2.start();

	}

}
