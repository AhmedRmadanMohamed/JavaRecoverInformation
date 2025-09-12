package LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LambdaExpressionINTEGERS AddName = () -> {
            List<Integer> list = new ArrayList<>();
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                list.add(i);
                sum = list.get(i);
                for (int j = 1; j < i; j++) {
                    sum = sum + list.get(j);
                }
            }
            System.out.println(sum);
            list.forEach(System.out::println);
            return list;
        };


        AddName.INTEGERS();

        LambdaExpressionVoid aVoid = (i, name) -> System.out.println(i + " " + name);
        aVoid.Pram(1, "Hello");


    }



}