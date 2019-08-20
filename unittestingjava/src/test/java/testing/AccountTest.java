package testing;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumingThat;


class AccountTest {
    @Test
    void newAccountShouldNotBeActiveAfterCreation() {
        //given
        Account newAccount = new Account();

        //then
       assertFalse(newAccount.isActive());

    }
    @Test
    void accountShouldBeActiveAfterActivation() {
        //given
        Account newAccount = new Account();
        assertFalse(newAccount.isActive());

        //when
        newAccount.activate();

        //then
        assertTrue(newAccount.isActive());

    }

    @Test
    void newlyCreatedAccountShouldNotHaveDefaultDeliveryAddressSet(){

        //given
        Account account = new Account();

        //when
        Address address = account.getDefaultDeliveryAddress();

        //then
        assertNull(address);


    }

    @Test
    void defaultDeliveryAddressShouldNotBeNullAfterBeingSet(){
        //given
        Address address = new Address("Krakowska", "121");
        Account account = new Account();
       account.setDefaultDeliveryAddress(address);

        //when
        Address  defaultAddress = account.getDefaultDeliveryAddress();

        //then
        assertNotNull(defaultAddress);


    }

    @RepeatedTest(25)
    void newAccountWithNotNullAddressShouldBeActive(){
        //given
        Address address = new Address("Puławska", "46/6");

        //when
        Account account = new Account(address);

        //then
        assumingThat(address != null, () -> {
            assertTrue(account.isActive());
        });

    }
}
