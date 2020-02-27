package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

    IndexController controller;

    @BeforeEach
    void setUp() {
        controller = new IndexController();
    }

    @Test
    void index() {
        assertEquals("index", controller.index());
        assertEquals("index", controller.index(), "wrong view returned");
        assertEquals("index", controller.index(), () -> "This is some expensive Message to build for the test");
    }

    @Test
    void oupsHandler() {
        assertTrue("notimplemented".equals(controller.oupsHandler()), () -> "This is some expensive" + "Message to build" + "for the test");
    }
}