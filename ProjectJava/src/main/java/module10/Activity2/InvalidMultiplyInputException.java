package module10.Activity2;

public class InvalidMultiplyInputException extends Exception {

    // Constructor accepting a custom error message
    public InvalidMultiplyInputException(String message) {
        // Pass the error message to the parent Exception class
        super(message);
    }
}
