package JavaException.CustomException;

public class CustomCheckedExceptionClass {
    private CustomCheckedExceptionClass() {
    }

    public static class NumberIsLessThanValue extends Exception {
        public NumberIsLessThanValue(String Message) {
            super(Message);
        }

    }

}



