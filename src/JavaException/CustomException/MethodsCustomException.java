package JavaException.CustomException;

public class MethodsCustomException {

    public void MethodCustomCheckedException(int Number) throws CustomCheckedExceptionClass.NumberIsLessThanValue {


        if (Number > 0) {
            System.out.println("Number is " + Number);
        } else {
            throw new CustomCheckedExceptionClass.NumberIsLessThanValue("This CustomCheckedException -> Number is > than 0");
        }


    }


    public void MethodCustomUnCheckedException(int Number) {

        if (Number < 0) {
            System.out.println("Number is " + Number);
            throw new CustomUnCheckedExceptionClass.NegativeNumberException(" This CustomUnCheckedException -> Number is <  than 0");
        }
    }


}
