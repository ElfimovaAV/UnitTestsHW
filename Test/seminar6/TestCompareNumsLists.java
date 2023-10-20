package seminar6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class TestCompareNumsLists {
    private ListOfNumbers listOfNumbers1;
    private ListOfNumbers listOfNumbers2;

    @BeforeEach
    void setUp() {
        listOfNumbers1 = new ListOfNumbers();
        listOfNumbers2 = new ListOfNumbers();
    }

    @Test
    public void testAddNumbersInList() {
        listOfNumbers1.addNumbersInList(10);
        assertEquals(10, listOfNumbers1.getNumbers().get(0));
    }

    @Test
    public void testListSize() {
        listOfNumbers1.addNumbersInList(10);
        listOfNumbers1.addNumbersInList(12);
        listOfNumbers1.addNumbersInList(25);
        assertEquals(3, listOfNumbers1.listSize());
    }

    @Test
    public void testCalculateOfAverage() {
        listOfNumbers1.addNumbersInList(9);
        listOfNumbers1.addNumbersInList(12);
        listOfNumbers1.addNumbersInList(27);
        Calculation calculation = new Calculation();
        assertEquals(16, calculation.calculateOfAverage(listOfNumbers1));
    }

    @Test
    public void testReturnResultOfCompareWhenFirstListMoreSecondList() {
        listOfNumbers1.addNumbersInList(100);
        listOfNumbers1.addNumbersInList(12);
        listOfNumbers1.addNumbersInList(25);
        listOfNumbers1.addNumbersInList(4);
        listOfNumbers2.addNumbersInList(10);
        listOfNumbers2.addNumbersInList(25);
        listOfNumbers2.addNumbersInList(12);
        listOfNumbers2.addNumbersInList(4);

        Calculation calculation = new Calculation();
        assertEquals("Первый список имеет большее среднее значение",
                calculation.returnResultOfCompare(listOfNumbers1, listOfNumbers2));

    }

    @Test
    public void testReturnResultOfCompareWhenSecondListMoreFirstList() {
        listOfNumbers1.addNumbersInList(10);
        listOfNumbers1.addNumbersInList(12);
        listOfNumbers1.addNumbersInList(25);
        listOfNumbers1.addNumbersInList(4);
        listOfNumbers2.addNumbersInList(10);
        listOfNumbers2.addNumbersInList(250);
        listOfNumbers2.addNumbersInList(12);
        listOfNumbers2.addNumbersInList(4);

        Calculation calculation = new Calculation();
        assertEquals("Второй список имеет большее среднее значение",
                calculation.returnResultOfCompare(listOfNumbers1, listOfNumbers2));

    }

    @Test
    public void testReturnResultOfCompareWhenListIsEquals() {
        listOfNumbers1.addNumbersInList(10);
        listOfNumbers1.addNumbersInList(12);
        listOfNumbers1.addNumbersInList(25);
        listOfNumbers1.addNumbersInList(4);
        listOfNumbers2.addNumbersInList(10);
        listOfNumbers2.addNumbersInList(25);
        listOfNumbers2.addNumbersInList(12);
        listOfNumbers2.addNumbersInList(4);

        Calculation calculation = new Calculation();
        assertEquals("Средние значения равны",
                calculation.returnResultOfCompare(listOfNumbers1, listOfNumbers2));

    }
}
