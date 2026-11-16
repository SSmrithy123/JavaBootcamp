package org.demo.Day1;

public class MultiplicationTable {
    public static void main(String[] args) {
        //loop for number 11 to 20
        for (int i = 11; i <= 20; i++)
            //loop for number 1 to 10
            for (int j = 1; j <= 10; j++) {
                //multipication result declared here
                int result = i * j;
                //printing
                System.out.println(+i+ "*" +j+ "=" +result);
             //   System.out.println();
            }

    }
}
