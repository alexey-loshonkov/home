package eu.senla.task4;

/**
 * Создать программу, которая будет вычислять и выводить на экран простые множители
 * из которых состоит целое число, введенное пользователем.
 * Если введено не целое число, то сообщать ему об ошибке.
 */
public class multiRunner {
    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier();
        int number = 22;

        multiplier.multiplier(number);
    }

}
