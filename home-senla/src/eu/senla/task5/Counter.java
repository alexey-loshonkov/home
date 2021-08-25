package eu.senla.task5;


import java.util.Arrays;

public class Counter {

    private static final String STR_RUS = "ауоыиэяюеё";

    public void counter(String str) {
        System.out.println(str);
        str = str.toLowerCase();
        System.out.println(str);
        String[] words = str.split(" ");

        System.out.println();

        String vowel = "aeiouyауоыиэяюеё";

        int[] count = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                int index = vowel.indexOf(words[i].charAt(j));
                if (index > 0) {
                    count[i] += 1;
                }
            }
        }

        //Сумма всех гласных
        int summ = 0;
        for (int i = 0; i < count.length; i++) {
            summ += count[i];
        }

        //Сортировка

        for (int i = 0; i < count.length - 1; i++) {

            for (int j = i+1; j < count.length; j++) {

                if (count[i] < count[j]) {

                    int buf = count[i];
                    count[i] = count[j];
                    count[j] = buf;

                    String sbuf = words[i];
                    words[i] = words[j];
                    words[j] = sbuf;
                }
            }
        }
        System.out.println();
        System.out.println("Количество глассных: " + summ);
        System.out.println("отсортированые слова:");
        System.out.println(Arrays.toString(words));
    }
}
