package seminar6;


public class Calculation {
    private ListOfNumbers listOfNumbers;

    public double calculateOfAverage(ListOfNumbers listOfNumbers) {
        int sum = 0;
        for (int i = 0; i < listOfNumbers.listSize(); i++) {
            sum += listOfNumbers.getNumbers().get(i);
        }
        return (double) sum / listOfNumbers.listSize();
    }

    public String returnResultOfCompare(ListOfNumbers listOfNumbers1, ListOfNumbers listOfNumbers2) {

        double average1 = calculateOfAverage(listOfNumbers1);
        double average2 = calculateOfAverage(listOfNumbers2);

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average1 < average2) {
            return "Второй список имеет большее среднее значение";
        }
        return "Средние значения равны";
    }

}

