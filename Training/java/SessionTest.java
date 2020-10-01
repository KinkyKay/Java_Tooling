package be.abis.test;

import be.abis.demo.Session;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class SessionTest {
    Session s;
    @BeforeEach
    void setUp()
    {
        s = new Session(234, LocalDate.of(2020,10,10), "C");
    }

    @Test
    void getSessionKind() {
        assertEquals("P", s.getSessionKind(), "sessionkind is not C?");
    }
}