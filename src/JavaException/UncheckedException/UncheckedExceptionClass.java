package JavaException.UncheckedException;

public class UncheckedExceptionClass {


    public void MethodUncheckedException(int Number) {
        if (Number < 1) {throw new ArithmeticException("Number is less than 1");} else System.out.println("Number is > than 1");

    }


}

