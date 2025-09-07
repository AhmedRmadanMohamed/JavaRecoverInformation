package JavaException.TryAndCatchAndFinallyKayWords;

public class TryAndCatchAndFinallyClass {


    public String[] ArrayForString() {
        String[] Add = new String[2];
        Add[0] = "string lowercase";
        Add[1] = "STRING  UPPERCASE";

        return Add;
    }

    public String[] TryAndCatchAndFinallyMethodSheepOne(String[] ArryOfString) {
        try {

            for (int i = 0; i < ArryOfString.length; i++) {

                String Temp = switch (ArryOfString[i]) {
                    case "string lowercase" -> ArryOfString[i].toUpperCase();
                    case "STRING  UPPERCASE" -> ArryOfString[i].toLowerCase();
                    default -> "This Value is Not Found";
                };
                System.out.println(Temp);
            }
        } catch (ArrayIndexOutOfBoundsException Error) {
            System.out.println(Error.getMessage().toString());

        } finally {
            System.out.println("Return Finally Any Way on TryAndCatchAndFinallyMethodSheepOne");
        }
        return ArryOfString;
    }


    public int[] TryAndCatchAndFinallyMethodSheepTow(int NumberOfArray) {
        int[] arr = new int[NumberOfArray];
        {
            try {
                for (int i = 0; i < arr.length + 1; i++) {
                    arr[i] = i;
                }
            } catch (ArrayIndexOutOfBoundsException | ArithmeticException Error) {
                System.out.println("Error in TryAndCatchMethod");
                System.out.println();
                System.out.println("Have Exception ----->  " + Error.getMessage());
            } finally {
                System.out.println("Return Finally Any Way on TryAndCatchAndFinallyMethodSheepTow");
            }
        }
        return arr;
    }


}
