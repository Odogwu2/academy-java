package com.bptn.course._challenge;

import java.util.Arrays;

public class Main {

    public void Start(){
        
        int[] array = {3, 6, 1, 4, 2, 9, 7, 8, 5, 0};
        int key = 1;


        Arrays.sort(array);

        //sort array
        int result = binarySearch(array,key);

        //Print values in array after sort
        System.out.println(result);

    }

    int binarySearch(int arr[], int key){
       // put your code here.
    	int low = 0; 
    	int high = arr.length - 1; 
    	
    	while(low<=high) {
    		int mid = (low + high)/2; 
    		
    		if(arr[mid] == key) {
    			System.out.println("The key is present in the given array");
    			return mid; //key found, return key. 
    		}else if (arr[mid] > key) {
    			high = mid - 1; 
    		}else if (arr[mid] < key) {
    			low = mid + 1; 
    		}
    	} System.out.println("The key is not present in the given array");
    	return -1;
    	//ELement x not present in the given array. 
       
    }
    
       public static void main(String[] args) {
        Main main = new Main();
        main.Start();
    }
}