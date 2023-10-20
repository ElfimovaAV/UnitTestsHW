package seminar6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfNumbers {
    private List<Integer> numbers;

    public ListOfNumbers() {
        this.numbers = new ArrayList<>();
    }

    public void addNumbersInList(int number) {
        numbers.add(number);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public int listSize() {
        return numbers.size();
    }
}
