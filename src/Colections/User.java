package Colections;

import java.time.LocalDateTime;

public class User {
    private String name;
    private String login;
    private String password;
    private int age;
    private LocalDateTime dateOfReg;
    private String  dayOfBirth;

    public User() {
        this.name = name;
        this.login = login;
        this.password = password;
        this.age = age;
        this.dateOfReg = dateOfReg;
        this.dayOfBirth = dayOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateOfReg(LocalDateTime dateOfReg) {
        this.dateOfReg = dateOfReg;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", dateOfReg=" + dateOfReg +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                '}';
    }
}

