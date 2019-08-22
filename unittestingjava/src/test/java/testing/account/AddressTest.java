package testing.account;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


class AddressTest {
    @ParameterizedTest
    @CsvSource({"Fabryczna, 10", "Armii Krajowej, 57/11", "'Romka, Tomka, Atomka', 40"})
    void givenAddressShouldNotBeEmptyAndHaveProperNames(String street, String number){
        assertThat(street, notNullValue());
        assertThat(street, containsString("a"));
        assertThat(number, notNullValue());
        assertThat(number.length(), lessThan(6));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/addresses.csv")
    void givenAddressFromFileShouldNotBeEmptyAndHaveProperNames(String street, String number){
        assertThat(street, notNullValue());
        assertThat(street, containsString("a"));
        assertThat(number, notNullValue());
        assertThat(number.length(), lessThan(6));
    }
}