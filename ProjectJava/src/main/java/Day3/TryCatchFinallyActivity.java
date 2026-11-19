package Day3;

public class TryCatchFinallyActivity {
    public static void main(String[] args) {
        TryCatchFinallyActivity obj = new TryCatchFinallyActivity();
        obj.catchMeIfYouCan();
    }

    void catchMeIfYouCan() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // TODO: Use try
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(arr[i]);
            }


        // TODO: Create catch for try and use IndexOutOfBoundsException
        } catch (IndexOutOfBoundsException e) {
            // TODO: Add custom System.out.println message here
            System.out.println("Tried to access an index outside the array bounds: " +e.getMessage());
        }
        // TODO: Add a finally block so this message prints whether or not an exception occurs
        finally {
            System.out.println("This should get printed even if there is an exception");
        }
    }
}
