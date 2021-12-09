package LinkedList1;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList1 {
    private int number;

    public LinkedList1() {
        this.number = number;
    }

    public LinkedList<Integer> getIntegerList(int number) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < number; i++) {
            linkedList.add((int) (Math.random() * 1000));
        }
        System.out.println(linkedList);
        return linkedList;
    }

    public int getMinimum(LinkedList<Integer> linkedList) {
        int min = linkedList.getFirst();
        for (Integer tmp : linkedList) {
            if (tmp < min) {
                min = tmp;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        LinkedList1 linkedList1 = new LinkedList1();
        System.out.println("Введіть число");
        Scanner input = new Scanner(System.in);
        linkedList1.number = input.nextInt();
        System.out.println(linkedList1.getMinimum(linkedList1.getIntegerList(linkedList1.number)));
    }
}
