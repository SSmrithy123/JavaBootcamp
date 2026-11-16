package org.demo.Day1;

public class AddWholeNum {
    public static void main(String[] args) {
        //declaring total as 0
        int total = 0;
        //starting for loop  counts upto 100
        for (int i = 50; i <= 100; i++) {
            //add the current number with total
            total=total+i;
        }
        //printing the total
        System.out.println("Sum is  "  +total);
    }
}
