package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class IndexControllerTest {

    IndexController controller;

    @BeforeEach
    void setUp() {
        controller = new IndexController();
    }

    @DisplayName("Test proper view name is returned for index page")
    @Test
    void index() {
        assertEquals("index", controller.index());
        assertEquals("index", controller.index(), "wrong view returned");
        assertEquals("index", controller.index(), () -> "This is some expensive Message to build " +
                "for the test");
    }

    @Test
    @DisplayName("Test Exception")
    void oopsHandler() {
        //  assertTrue("notimplemented".equals(controller.oopsHandler()), () -> "This is some " +
        //         "expensive" + "Message to build" + "for the test");

        assertThrows(ValueNotFoundException.class,
                () -> {
                    controller.oopsHandler();
                }
        );
    }

    @Disabled
    @Test
    void testTimeOut() {
        assertTimeout(Duration.ofMillis(100),
                () -> {
                    Thread.sleep(5000);
                    System.out.println("regular timeout");
                }

        );

    }

    @Disabled
    @Test
    void testTimeOutPreemptively() {
        assertTimeoutPreemptively(Duration.ofMillis(100),
                () -> {
                    Thread.sleep(5000);
                    System.out.println("preemptive timeout");
                }
        );
    }

    @Disabled
    @Test
    void testAssumptionTrue() {
        assumeTrue("TEST".equalsIgnoreCase(System.getenv("TEST_RUNTIME")));
    }

    @Disabled
    @Test
    void testAssumptionTrueAssumptionIsTrue() {
        assumeTrue("TEST".equalsIgnoreCase("TEST"));
    }


}