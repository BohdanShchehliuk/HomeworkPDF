package TaskAdd;

import java.lang.reflect.Field;

public class Cat extends Animal {
    public static void main(String[] args) throws NoSuchFieldException {
        Class cl = Animal.class;
        Animal animal = new Cat();
        try {
            Field field1 = cl.getDeclaredField("name");
            field1.setAccessible(true);
            Field field2 = cl.getDeclaredField("length");
            field2.setAccessible(true);
            Field field3 = cl.getDeclaredField("weight");
            field3.setAccessible(true);
            field1.set(animal, "Murka");
            field2.setInt(animal, 100);
            field3.set(animal, 200);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(animal.getClass().getName() + " is " + animal);
    }
}
