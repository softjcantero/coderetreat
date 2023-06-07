package com.coderetreat;

import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.Mockito.when;
import java.util.Arrays;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class AccountPrinterTest {

    private AccountPrinter accountPrinter;

    private Account account;

    @Before
    public void setUp() {
        account = Mockito.mock(Account.class);

        accountPrinter = new AccountPrinter(account);
    }

    @Test
    public void testHeader() {
       String statement = accountPrinter.printStatement();

       assertThat(statement.equals("Date\t\tAmount\t\tBalance")).isEqualTo(true);
    }

    @Test
    public void testOneDeposite() {
       when(account.getEntries()).thenReturn(Arrays.asList(new AccountEntry(new Date(), 500, 500)));

       String statement = accountPrinter.printStatement();

       assertThat(statement.contains("Date\t\tAmount\t\tBalance\n")).isEqualTo(true);
       assertThat(statement.contains("+500")).isEqualTo(true);
       assertThat(statement.contains("500")).isEqualTo(true);
    }

}
