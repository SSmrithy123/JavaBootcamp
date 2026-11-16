package org.demo.Day1;

public class PrintNumWithWhile {
    public static void main(String[] args) {
        //declaring num as 1
        int num = 1;
        //checking with condition number less than 100
        while (num < 100) {
            //thn print the number
            System.out.println("Number is " + num);
            //add num +2 , will execute the step when the num reach less than 100
            num=num+2;
        }
    }
}
