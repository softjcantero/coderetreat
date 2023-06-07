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
    public void test() {
        account.deposite(500);

        assertThat(account.getEntries().size()).isEqualTo(1);
        assertThat(account.getEntries().get(0).getAmount()).isEqualTo(500);
        assertThat(account.getEntries().get(0).getBalance()).isEqualTo(500);
    }

}
