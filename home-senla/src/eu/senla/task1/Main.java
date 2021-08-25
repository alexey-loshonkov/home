package eu.senla.task1;

/**
 * Напишите программу, которая возвращает количество "троек" в заданной строке.
 * Тройка - это символ, появляющийся три раза подряд в строке.
 */

public class Main {
    public static void main(String[] args) {

        ThreeRow threeRow = new ThreeRow();
        String word = "Zzz...   ..";

        System.out.println(threeRow.check(word));
    }



}
