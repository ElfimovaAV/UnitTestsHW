package seminar3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MainHWTest {
    MainHW test;
    @BeforeEach
    void setUp() {
        test = new MainHW();
    }

    @Test
    public void evenOddNumberTestWithEvenNumber() {
        assertTrue(test.evenOddNumber(2));
    }

    @Test
    public void evenOddNumberTestWithOddNumber() {
        assertFalse(test.evenOddNumber(3));
    }

    @Test
    public void numberInIntervalTrueTest(){
        assertTrue(test.numberInInterval(40));
    }

    @Test
    public void numberInIntervalFalseTest(){
        assertFalse(test.numberInInterval(4));
    }

}
