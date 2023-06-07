package com.coderetreat;

import static org.fest.assertions.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {


    private Account account;


    @Before
    public void setUp() {
        account = new Account();
    }


    @Test
    public void testOneDeposite() {
        account.deposite(500);

        assertThat(account.getEntries().size()).isEqualTo(1);
        assertThat(account.getEntries().get(0).getAmount()).isEqualTo(500);
        assertThat(account.getEntries().get(0).getBalance()).isEqualTo(500);
    }

    @Test
    public void testOneDepositeAndOneWithdraw() {
        account.deposite(500);
        account.withdraw(200);

        assertThat(account.getEntries().size()).isEqualTo(2);

        assertThat(account.getEntries().get(0).getAmount()).isEqualTo(500);
        assertThat(account.getEntries().get(0).getBalance()).isEqualTo(500);

        assertThat(account.getEntries().get(1).getAmount()).isEqualTo(-200);
        assertThat(account.getEntries().get(1).getBalance()).isEqualTo(300);

    }

}
