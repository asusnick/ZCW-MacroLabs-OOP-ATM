package susnick.andrea.oop_atm;

import org.junit.Assert;
import org.junit.Test;

public class BankAccountTest {
    BankAccount bankAccount = new BankAccount();

    @Test
    public void getAcctNumberTest(){
        //: Given
        int expected = 1;
        bankAccount.setAcctNumber(1);

        //: When
        int actual = bankAccount.getAcctNumber();

        //: Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getBalanceTest(){
        //: Given
        double expected = 0;
        bankAccount.setBalance(0);

        //: When
        double actual = bankAccount.getBalance();

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getAcctTypeTest(){
        //: Given
        String expected = "Checking";
        bankAccount.setAcctType(expected);

        //: When
        String actual = bankAccount.getAcctType();

        //: Then
        Assert.assertEquals(expected, actual);
    }

    public void depositTest() {
        //: Given
        double expected = 20;
        bankAccount.deposit(20);

        //: When
        double actual = bankAccount.getBalance();

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void withdrawTest(){
        //: Given
        double expected = 15;
        bankAccount.deposit(20);
        bankAccount.withdraw(5);

        //: When
        double actual = bankAccount.getBalance();

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }
}
