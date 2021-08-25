package eu.senla.task2;

public class Number {

    public int result(int number) {
        int result = 0;
        for (int currentValue = number; currentValue != 0; currentValue /= 10) {
            result += currentValue % 10;
        }
        return result;
    }

}
