package susnick.andrea.oop_atm;

public class BankAccount {
    protected int acctNumber;
    protected double balance;
    protected String acctType;


    public BankAccount(){}

    public BankAccount(String title){
        this.acctNumber = 0;
        this.balance = 0;
        this.acctType = title;

    }

    public int getAcctNumber() {
        return acctNumber;
    }

    public void setAcctNumber(int number){
        this.acctNumber = number;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getAcctType(){
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }
}
