package VarKayWord;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        var ArrayList = new ArrayList<String>();
        ArrayList.add("string lowercase");
        ArrayList.add("STRING  UPPERCASE");
        for (var li : ArrayList) {

            System.out.println(li);
        }

    }
}
