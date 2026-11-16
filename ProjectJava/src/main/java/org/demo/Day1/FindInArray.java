package org.demo.Day1;

public class FindInArray {
    public static void main(String[] args) {

        //declaring array
        int[] nums = {100, 1, 4, 15};
        //now the largest is in num[0]
        int largest = nums[0];
        //looping using array length
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
            System.out.println("Number is "+largest);
        }
    }
