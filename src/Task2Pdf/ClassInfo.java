package Task2Pdf;

import java.lang.reflect.*;
import java.util.Arrays;

public class ClassInfo {

    static void print(Constructor[] method) {
        System.out.println("All Constructors:");
        Arrays.stream(method).forEach(System.out::println);
        System.out.println("");
    }

    static void print(Field[] method) {
        System.out.println("All Fields:");
        Arrays.stream(method).forEach(System.out::println);
        System.out.println("");
    }

    static void print(Method[] method) {
        System.out.println("All Methods:");
        Arrays.stream(method).forEach(System.out::println);
        System.out.println("");
    }

    public static void main(String[] args) throws ClassNotFoundException {

        Class cl = Class.forName("java.lang.String");
        print(cl.getConstructors());
        print(cl.getFields());
        print(cl.getMethods());
    }
}
