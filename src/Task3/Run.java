package Task3;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Run {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class cl = MyClass.class;
        MyClass myClass = new MyClass();
        System.out.println("Filds:");
        System.out.println(Arrays.toString(cl.getFields()));
        Field field = cl.getDeclaredField("age");
        Field field1 = cl.getDeclaredField("surName");
        field.setAccessible(true);
        field1.setAccessible(true);
        System.out.println("Private file: "+field.getType().toGenericString()+" , "+field.getInt(myClass));
        System.out.println("Private file: \n"+field1.getType().toGenericString()+" , "+field1.get(myClass));
        System.out.println("\nConstructors: \n"+Arrays.toString(cl.getConstructors()));
        System.out.println("\nMethods: \n"+ Arrays.toString(cl.getMethods()));
        System.out.println("\nMethods: second try \n");
        Arrays.stream(cl.getMethods()).forEach(System.out::println);

    }
}
