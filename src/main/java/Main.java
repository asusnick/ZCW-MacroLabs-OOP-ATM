import susnick.andrea.oop_atm.UserFactory;

import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        System.out.println("Welcome to da bank! To create a login, please type: CREATE.");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        userInput = "CREATE";

        UserFactory userFactory= new UserFactory();
        userFactory.UserFactory();


//        Just messing with the code below:
//        new UserValidator();
//        BankAccounts bankAccounts = new BankAccounts();
//        double deposit = bankAccounts.getDeposit();
//        System.out.println(deposit);
//        bankAccounts.setDeposit(10);
//        deposit = bankAccounts.getDeposit();
//        System.out.println(deposit);
        }
    }
//}
