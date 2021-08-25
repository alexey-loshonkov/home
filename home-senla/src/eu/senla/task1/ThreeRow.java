package eu.senla.task1;

import java.util.Locale;

public class ThreeRow {

    public String check(String value) {
        value = value.toUpperCase(Locale.ROOT); //Если регистр не важен.
        int result = 0;
        for (int i = 0; i < value.length() - 2; i++) {
            if(value.charAt(i) == value.charAt(i+1)  && value.charAt(i) == value.charAt(i+2)) {
                result++;
                i += 2;
            }

        }
        return String.valueOf(result);
    }
}
