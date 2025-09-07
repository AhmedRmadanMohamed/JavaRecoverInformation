package SwitchAndYieldkayWord;

import java.util.Scanner;

public class SwitchAndYield {


    public String SwitchWithYield(String word) {


        return switch (word) {

            case "string lowercase" -> {
                System.out.println(word + " is lowercase");
                yield "This Value Is Done";
            }
            case "STRING  UPPERCASE" -> {
                System.out.println(word + " is uppercase");
                yield "This Value Is Done";
            }
            default -> "Not Found String Value";
        };
    }


    public int SwitchShepOne(int Number) {
        switch (Number) {
            case 10:
                System.out.println("This number is 10");
                break;
            case 20:
                System.out.println("This number is 20");
                break;
            case 30:
                System.out.println("This number is 30");
                break;
            case 40:
                System.out.println("This number is 40");
                break;
            default:
                System.out.println("This number is not in range");

        }

        return Number;
    }


    public String SwitchShepTwo() {
        String StringOfCondition;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number Of the condition");
        int Number = scanner.nextInt();
        StringOfCondition = switch (Number) {
            case 10 -> "This number is 10";
            case 20 -> "This number is 20";
            case 30 -> "This number is 30";
            case 40 -> "This number is 40";
            case 50 -> "This number is 50";
            case 60 -> "This number is 60";
            default -> "This number is not in range";
        };

        return StringOfCondition;
    }


}
