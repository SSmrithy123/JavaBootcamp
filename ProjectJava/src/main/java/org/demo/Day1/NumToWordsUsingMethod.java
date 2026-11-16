package org.demo.Day1;

public class NumToWordsUsingMethod {

    public String printword(int num) {
        String numToWords;
        //switch method for number 1 to 10 text
        switch (num) {

            case 1:
                numToWords = "One";
                // Exit the switch statement
                break;
            case 2:
                numToWords = "Two";
                break;
            case 3:
                numToWords = "Three";
                break;
            case 4:
                numToWords = "Four";
                break;
            case 5:
                numToWords = "Five";
                break;
            case 6:
                numToWords = "Six";
                break;
            case 7:
                numToWords = "Seven";
                break;
            case 8:
                numToWords = "Eight";
                break;
            case 9:
                numToWords = "Nine";
                break;
            case 10:
                numToWords = "Ten";
                break;
            //default for if the number doesnt match
            default:
                numToWords = "Number not present";
                break;
        }

        return numToWords;
    }

        public static void main(String[]args){
NumToWordsUsingMethod numToWordsUsingMethod=new NumToWordsUsingMethod();
// Call the method with different numbers and print the results
            System.out.println("number is" +numToWordsUsingMethod.printword(5));  // Should print: Five
            System.out.println(numToWordsUsingMethod.printword(10));
            System.out.println(numToWordsUsingMethod.printword(3));
        }
    }
