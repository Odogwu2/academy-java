package com.bptn.course._27_lambdas._01_lambda_basics;

interface Sayable{
	String say();
}


//class MyClass implements Sayable{
//	@Override 
//	public String say() {
//		return "I love Java"; 
//		
//	}
//}


public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Sayable obj = new MyClass(); 
//		System.out.println(obj.say());
		
		
		Sayable obj2 = () -> {
			return "I love Java"; 
			
		};
		System.out.println(obj2.say());

	}

}
