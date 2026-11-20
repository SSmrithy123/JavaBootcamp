package module10.Activity2;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    // --- 4 Tests for overloaded add methods ---

    @Test
    public void testAddTwoPositiveNumbers() {
        Assert.assertEquals(calculator.add(5, 3), 8); //checking actual and expected
    }

    @Test
    public void testAddTwoNegativeNumbers() {
        Assert.assertEquals(calculator.add(-4, -6), -10); //checking actual and expected
    }

    @Test
    public void testAddThreePositiveNumbers() {
        Assert.assertEquals(calculator.add(2, 4, 6), 12);//checking actual and expected
    }

    @Test
    public void testAddThreeMixedNumbers() {
        Assert.assertEquals(calculator.add(10, -3, 5), 12); //checking actual and expected
    }

    // --- 2 Tests for subtract method ---

    @Test
    public void testSubtractPositiveResult() {
        Assert.assertEquals(calculator.subtract(10, 4), 6);
    }

    @Test
    public void testSubtractNegativeResult() {
        Assert.assertEquals(calculator.subtract(3, 9), -6);
    }

    // --- 2 Tests for divide method (including exception handling) ---

    @Test
    public void testDivideValidNumbers() {
        Assert.assertEquals(calculator.divide(20, 4), 5);
    }


    // Test division by zero throws ArithmeticException
    // JUnit to catch an ArithmeticException during this test
    @Test(expected = ArithmeticException.class)
    public void testDivideByZeroException() {
        calculator.divide(10, 0);
        /*try {
            calculator.divide(10, 0);
            Assert.fail("Expected ArithmeticException to be thrown");
        } catch (ArithmeticException e) {
            Assert.assertEquals("Cannot divide by zero", e.getMessage());
        }*/ // End of catch block
    }


    // --- 2 Tests for multiply method (including custom exception handling) ---
    // Test multiplication with valid positive numbers
    @Test
    public void testMultiplyValidNumbers() throws InvalidMultiplyInputException {
        Assert.assertEquals(calculator.multiply(6, 7), 42);
    }
    // Test multiplication with zero throws custom exception
    // Custom exception needed because Java has no built-in exception for invalid multiply inputs
    @Test(expected = InvalidMultiplyInputException.class)
    public void testMultiplyInvalidInputException() throws InvalidMultiplyInputException {
        calculator.multiply(5, 0); // Pass 0 for  InvalidMultiplyInputException
    }
}
