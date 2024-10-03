package com.bptn.course._13_builtin_exceptions._02_unchecked_exceptions;

//coding 2.9 part 2
public class Main1 {
    
	void method() {
		//outer try catch block 
		
		try {
			
			//inner try catch block 
			try {
				int[]arr = {1,2,3,4}; 
				System.out.println(arr[0]); //this will not fail
				System.out.println(arr[5]);
			}
			catch(ArithmeticException e) {
				System.out.println("ArithmeticException occured");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException is handled in the outer catch block");
		}
		
        
    }

  // main() method to run the program
	
    public static void main(String args[]) {
        Main1 nestedTryBlockSolutionObject = new Main1();
        nestedTryBlockSolutionObject.method();
    }
}
