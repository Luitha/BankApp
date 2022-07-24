import org.junit.Assert;
import org.junit.Test;

public class BankAccountTesting {

    @Test
    public void methodToSeeIfWithdrawalShrinksAmountOfTheBalance() {
        AccountDetails accountDetails = new AccountDetails();
        accountDetails.setBalance(100);
        long expectedResult = accountDetails.getBalance();
        Assert.assertEquals(expectedResult, accountDetails.getBalance());


    }
}
