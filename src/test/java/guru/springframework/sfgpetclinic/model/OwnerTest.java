package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {

    @Test
    void dependentAssertions() {
        Owner owner = new Owner(1l, "Jimmy", "Butler");
        owner.setCity("Miami");
        owner.setTelephone("12345");

        assertAll("Properties test",
                () -> assertAll("Person properties",
                        () -> assertEquals("Jimmy", owner.getFirstName(), "First name did not match"),
                        () -> assertEquals("Butler", owner.getLastName(), "Last name did not match")
                ),
                () -> assertAll("Owner properties",
                        () -> assertEquals("Miami", owner.getCity(), "City did not match"),
                        () -> assertEquals("12345", owner.getTelephone(), "Telephone did not match")
                )
        );
    }

}