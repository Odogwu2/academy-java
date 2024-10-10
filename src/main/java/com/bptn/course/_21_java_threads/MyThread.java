package com.bptn.course._21_java_threads;



class A extends Thread{
	@Override
	public void run() {
		for (int i = 0; i<100; i++) {
			System.out.println("Hi Java");
		}
	}
	
}


class B extends Thread{
	@Override
	public void run() {
		for (int i = 0; i<100; i++) {
			System.out.println("Hello Java");
		}
	}
	
	
	
	
}
public class MyThread {

	public static void main(String[] args) {
		
		//create an object of class A
		A myObj = new A(); 
		myObj.start(); 
		
		B myObj1 = new B(); 
		myObj1.start(); 

	}

}


//Major takeaways 

//class A and B are running within the context of the main thread 
//hence it's not executed as a separate thread.

//class A and B are extending the Thread class and will override it's run method. 
//the start() method executes it as a separate method 
//its not recommended to call the .run method directly because this runs within the context of the main thread. 