package com.bptn.course._multithreading_self_led;


//things to note:

//if you extend Thread, you can't extend any other class
//java doesn't allow multiple inheritance 

public class MultithreadThing extends Thread{
	
//assigning a number to each thread 
	//create a new constructor 
	
	private int threadNumber;  
	
	public MultithreadThing (int threadNumber) {
		this.threadNumber = threadNumber; 
	}
	
@Override
public void run() {
	for(int i = 0; i <= 5; i++){
		System.out.println(i + "from thread " + threadNumber );
		
		
		//we can throw an exception on a particular thread and
		//this wont affect the running of other threads/operations. 
//		if (threadNumber == 3) {
//			throw new RuntimeException(); 
//		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
	

}
