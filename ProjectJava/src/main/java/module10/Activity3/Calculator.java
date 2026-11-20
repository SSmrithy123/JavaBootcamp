package module10.Activity3;

public class Calculator {
    // 3.1.1 First add method (2 parameters)
    public int add(int a, int b) {
        return a + b;  //// Return sum of two integers
    }

    // 3.1.1 Overloaded add method (3 parameters) so method name is same
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // 3.1.2 Subtract method
    public int subtract(int a, int b) {
        return a - b;
    }

    // 3.1.3 Divide method , handle divison by zero- try-catch
    public int divide(int a, int b) {
        //initializing result as 0
        int result = 0;
        try {  // Start try block for division error handling
            //throw exception if divide by 0
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero"); // Throw exception on divide by zero
            }
            result = a / b;
        } catch (ArithmeticException e) { // Catch division by zero exception
            System.out.println("Divide error: " + e.getMessage()); // Print error message
            throw e; // Re-throw  exception
        } //catch ended here
        return result; // Return division result
    }

    // 3.1.4 Multiply method with custom exception, throws, and compulsory try-catch
    public int multiply(int a, int b) throws InvalidMultiplyInputException {
        int result = 0;// Initialize result variable
        try {
            if (a <= 0 || b <= 0) {  // Check if either input is zero or negative
                throw new InvalidMultiplyInputException("Inputs must be greater than zero");
            }
            result = a * b;
        } catch (InvalidMultiplyInputException e) { // Catch custom invalid input exception
            System.out.println("Multiply error: " + e.getMessage()); //Error message print
            throw e; // Re-throw so unit tests can verify the custom exception
        }
        return result;
    }
}
