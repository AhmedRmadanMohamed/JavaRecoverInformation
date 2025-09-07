package SwitchAndYieldkayWord;

public class Main {


    public static void main(String[] args) {
        SwitchAndYield switchClass = new SwitchAndYield();
        switchClass.SwitchShepOne(90);
        System.out.println();
        String Index = switchClass.SwitchShepTwo();
        System.out.println(Index);
        System.out.println();
        String Yield = switchClass.SwitchWithYield("STRING  UPPERCASE");
        System.out.println(Yield);
    }
}
