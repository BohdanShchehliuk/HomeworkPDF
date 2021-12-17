package Colections;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NotInputError {
        User user = new User();
        Registration registration = new Registration();
        registration.registration(user);
        LocalDateTime localDateTime = LocalDateTime.now();
        user.setDateOfReg(localDateTime);
        System.out.println("Введіть дату свого народження");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        Optional<String> dateO = Optional.of(date);
        user.setDayOfBirth(dateO.orElse("28 грудня 1987"));
        System.out.println(user);
    }
}

