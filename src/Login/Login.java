package Login;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Login {
   static private String login;
    static private String password;

    public Login(String login, String password) {
        this.login = login;
        this.password = password;
    }

   static boolean login() {
       Scanner input = new Scanner(System.in);
       System.out.println("Введість логін (only latin letters) ");
       login = input.nextLine();
       Pattern pattern = Pattern.compile("[a-zA-Z]");
       char[] arr = login.toCharArray();
       for (char tmp : arr) {
           Matcher matcher = pattern.matcher("" + tmp);
           if (!matcher.matches()) {
               return false;
           }
        } return true;
   }

    static boolean password(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введість ПАРОЛЬ (ЦИФРИ ТА СИМВОЛИ) ");
        password = input.nextLine();
        Pattern pattern = Pattern.compile("[0-9+!@#$%^&*]");
        char[] arr = password.toCharArray();
        for (char tmp : arr) {
            Matcher matcher = pattern.matcher("" + tmp);
            if (!matcher.matches()) {
                return false;
            }
        } return true;
    }

    public static void main(String[] args) {

        while (!login()) {
        login();
        }
        while (!password()){
            password();
        }
        System.out.println("Вітаємо!");
    }
}
