package StringEnd;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        String last = "end";

        do {
            String word;
            System.out.println("Введіть слово:");
            Scanner input = new Scanner(System.in);
            word = input.nextLine();
            list.add(word);
            last = (String) list.getLast();
        } while (!last.equals("end"));

        for (String tmp : list) {
            if (!tmp.equals("end"))
                System.out.println(tmp);
        }
    }
}
