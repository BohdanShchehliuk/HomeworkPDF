package Colections;

import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

public class Registration {

    boolean registration(User user) throws NotInputError {
        Optional<String> loginO;
        Optional<String> nameO;
        Optional<String> passwordO;
        Optional<Integer> ageO;

        do {
            System.out.println("Введіть Логін:");
            Scanner sc = new Scanner(System.in);
            String login = sc.nextLine();
            loginO = Optional.of(login);
            System.out.println(loginO);
            try {
                user.setLogin(loginO.orElseThrow(() -> new NotInputError()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (loginO.isEmpty());

        System.out.println("Введіть імя:");
        Scanner sc = new Scanner(System.in);
        nameO = Optional.of(sc.nextLine());
        user.setName(nameO.orElse("defoult"));

        do {
            System.out.println("Введіть пароль:");
            Scanner scanner = new Scanner(System.in);
            passwordO = Optional.of(scanner.nextLine());
            try {
                user.setPassword(passwordO.orElseThrow(() -> new NotInputError()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (passwordO.isEmpty());

        do {
            System.out.println("Введіть Ваш вік (за бажанням):");
            Scanner scan = new Scanner(System.in);
            int age;
            try {
                age = scan.nextInt();
                ageO = Optional.of(age);
            } catch (InputMismatchException e) {
                e.printStackTrace();
                ageO = Optional.of(0);
            }
        } while (ageO.get() == 0);
        user.setAge(ageO.orElse(999));
        return true;
    }
}
