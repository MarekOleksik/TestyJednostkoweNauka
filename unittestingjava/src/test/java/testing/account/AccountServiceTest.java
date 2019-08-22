package testing.account;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;

class AccountServiceTest {

    @Test
    void getAllActiveAccounts() {
        //given
        AccountRepository accountRepositoryStab = new AccountRepositoryStab();
        AccountService accountService = new AccountService(accountRepositoryStab);

        //when
        List<Account> accountList = accountService.getAllActiveAccounts();

        //then
        assertThat(accountList, hasSize(2));
    }
}