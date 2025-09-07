package JavaException.CustomException;

public class CustomUnCheckedExceptionClass {

    private CustomUnCheckedExceptionClass() {
    }


    public static class NegativeNumberException extends RuntimeException {

        public NegativeNumberException(String message) {
            super(message);
        }

    }
}
