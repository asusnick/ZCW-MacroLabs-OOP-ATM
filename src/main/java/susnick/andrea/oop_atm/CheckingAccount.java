package susnick.andrea.oop_atm;

public class CheckingAccount extends BankAccount {

    BankAccount bankAccount = new BankAccount();

    public CheckingAccount(){}

    public CheckingAccount(int acctNumber, double balance, String acctType){
        this.acctNumber = getAcctNumber();
        this.balance = getBalance();
        this.acctType = getAcctType();
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);

    }
    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
    }
}



