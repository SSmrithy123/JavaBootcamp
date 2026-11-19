package Day3.CustomException;
// 1 - Extend this class from Exception class
public class CustomExceptionActivity extends Exception {

@Override
// 2 - Override getMessage() and provide the following message:


// "You are not allowed to use this program"
public String getMessage() {
    return "You are not allowed to use this program";
}



    }
