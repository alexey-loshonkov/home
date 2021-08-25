package eu.senla.task5;


import java.util.*;

/**
 * Создать программу, которая будет:
 * - подсчитывать количество гласных в словах
 * - выводить слова отсортированные по кол-ву гласных (сперва те у которых больше гласных)
 * - делать первую гласную букву в слове заглавной
 * - Предложение вводится вручную. Разделитель пробел (“ ”).
 */


public class Main {
    public static void main(String[] args) {

        Counter counter = new Counter();

        String str = "OAHUI NHURE IONM QEW ПРОДЙЮ.., енг";

        counter.counter(str);


    }
}



