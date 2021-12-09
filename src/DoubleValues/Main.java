package DoubleValues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Введіть слово № " +(i+1));
            Scanner input = new Scanner(System.in);
            String string = input.nextLine();
            list.add(string);
        }
        System.out.println(list.toString());

        DoubleValues doubleValues = new DoubleValues();
        doubleValues.doubleValues(list);
        System.out.println(list.toString());
    }
}
