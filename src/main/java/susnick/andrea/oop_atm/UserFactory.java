package susnick.andrea.oop_atm;

import java.util.Scanner;

public class UserFactory {

    public static void UserFactory() {
        Scanner scanner = new Scanner(System.in);
        String userName;
        String userPass;

        System.out.println("Enter your username");
        userName = scanner.nextLine();

        System.out.println("Enter your password");
        userPass = scanner.nextLine();

        if (userName.equals("Doctor") && (userPass.equals("Dre"))) {
//            UserManager userManager = new UserManager();
        }
    }
}


