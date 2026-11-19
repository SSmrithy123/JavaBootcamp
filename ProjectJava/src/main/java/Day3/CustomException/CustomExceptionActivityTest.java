package Day3.CustomException;

public class CustomExceptionActivityTest {
    // Needs to be completed

// This program accepts a user name and checks user's validity

// The user name is checked against an array of names.


// 1 - Type main method and call validateUser() from it.

    public static void main(String[] args) {
        CustomExceptionActivityTest customExceptionActivityTest = new CustomExceptionActivityTest();
        try {
            customExceptionActivityTest.validateUser("John");
            customExceptionActivityTest.validateUser("Sam"); // Not in validUsers -> throws CustomExceptionActivity
        } catch (CustomExceptionActivity e) {
            System.out.println(e.getMessage());
        }

    }

// Call this method with different names to test it.

    void validateUser(String name) throws CustomExceptionActivity {
// Array of names
        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};

        // Flag stores 1 if a match is found else it should remain 0
        int flag = 0;

        for (int i = 0; i < 4; i++) {
            // 2 - Write code to check if parameter name contains a value which is found in validUsers array and change flag's value accordingly
            if (name != null && name.equals(validUsers[i])) {
                flag = 1;
                break;
            }
        }

        // 3 - Check if flag is zero, throw CustomExceptionActivity Exception.
        // You may also have to declare this exception in the method signature using throws.
        if (flag == 0) {
            throw new CustomExceptionActivity();
        }

        // 4 - Else if flag is one, print a message "Welcome to Payroll program".
        else if (flag == 1) {
            System.out.println("Welcome to Payroll program");
        }
    }

    }

