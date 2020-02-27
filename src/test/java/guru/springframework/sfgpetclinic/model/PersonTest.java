package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void groupedAssertions() {

        // given
        Person person = new Person(1l, "Jimmy", "Butler");

        // then
        assertAll("Test props set",
                () -> assertEquals("Jimmy", person.getFirstName()),
                () -> assertEquals("Butler", person.getLastName())
        );
    }

    @Test
    void groupedAssertionsMsgs() {

        // given
        Person person = new Person(1l, "Jimmy", "Butler");

        // then
        assertAll("Test props set",
                () -> assertEquals("Jimmy", person.getFirstName(), "First name failed"),
                () -> assertEquals("Butler", person.getLastName(), "Last name failed")
        );
    }
}