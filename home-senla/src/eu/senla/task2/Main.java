package eu.senla.task2;

import java.util.Scanner;

public class Main {
    /**
     * Напишите программу, которая возвращает сумму цифр, присутствующих в данной строке.
     * Если цифр нет, возвращаемая сумма равна 0.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Number number = new Number();

        int inputNumber = scanner.nextInt();

        int result = number.result(inputNumber);
        System.out.println(result);
    }

}
