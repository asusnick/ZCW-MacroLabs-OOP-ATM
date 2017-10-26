package susnick.andrea.oop_atm;

import org.junit.Assert;
import org.junit.Test;

public class CheckingAccountTest {
    CheckingAccount checkingAccount = new CheckingAccount();

    @Test
    public void depositTest(){
        //: Given
        double expected = 40;
        checkingAccount.deposit(expected);

        //: When
        double actual = checkingAccount.getBalance();

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void withdrawTest(){
        //: Given
        double expected = 20;
        checkingAccount.deposit(40);
        checkingAccount.withdraw(20);

        //: When
        double actual = checkingAccount.getBalance();

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }
}
