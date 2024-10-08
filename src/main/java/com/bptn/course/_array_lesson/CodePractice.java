package com.bptn.course._array_lesson;

import java.util.ArrayList;

public class CodePractice {
    
    public static ArrayList<Integer> reverse(ArrayList<Integer> list) {
        ArrayList<Integer> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i)); 
        }
        return reversed;
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<>();
        int[] nums = {1, 5, 7, 9, -2, 3, 2};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        ArrayList<Integer> result = reverse(values);
        System.out.println("Expected Result:\t [2, 3, -2, 9, 7, 5, 1]");
        System.out.println("Your Result:\t\t " + result);
    }
}