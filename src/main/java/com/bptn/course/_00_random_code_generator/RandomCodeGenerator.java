package com.bptn.course._00_random_code_generator;

import java.util.Random;

public class RandomCodeGenerator {

	public static void main(String[] args) {
		Random rand = new Random(); //similar utility used to Scanner. 
        int min = 1; //declaring the minimum random number that can be generated.
        int max = 100; //declaring the maximum random number that can be generated. 

        for (int i = 0; i < 100; i++) // 
        {
        	//return type of the method which determines what type of variable to use.
        	//(100 - 1+1)+1
            int randomNum = rand.nextInt(max - min + 1) + min;   
            System.out.println(randomNum);
        }

	}

}
