package Task3;

import java.util.Objects;

public class MyClass {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return age == myClass.age && Objects.equals(name, myClass.name) && Objects.equals(surName, myClass.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, surName);
    }

    private int age = 33;
    public String name = "Bohdan";
    private String surName = "Shchehliuk";

    public MyClass() {
        this.age = age;
        this.name = name;
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}

