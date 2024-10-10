package com.bptn.course._21_java_threads;

public class MyRunnable implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			
			//put the thread.sleep in the loop/method body. 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Interrupted exception has occurred: "+ e.getMessage());
			}
		}
		
	}

	public static void main(String[] args) {
		//step2:
		
		MyRunnable myObj = new MyRunnable(); 
		
		//step3:
		Thread thread = new Thread(myObj);
		
		//step4:
		
		thread.start();
		
		

	}



}


//steps to create a thread using Runnable interface. 
//1. create a class that implements Runnable interface. 
//2. create an object of this MyRunnable class, which is the class that implements the Runnable interface. 
//3. create an object from the Thread class & pass the object created in step 2 into the constructor 
//4. start the thread using start(); 

//sleep() is a static method 
//sleep() throws 2 exceptions, one is a checked exception and the other is unchecked 
//because of the exceptions, especially the checked exception, we need to surround it with a try/catch 