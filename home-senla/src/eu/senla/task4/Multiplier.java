package eu.senla.task4;

public class Multiplier {
    public void multiplier(int number) {
        int multiplier = 2;
        int temp = number;
        if(isEmpty(number)) {
            System.out.print("Простые множители: ");
            while (temp > 1) {
                if (temp % multiplier == 0) {
                    System.out.print(multiplier + " ");
                    temp /= multiplier;
                } else {
                    multiplier++;
                }
            }
        }else{
            System.out.println("Введено не целое число!");
        }
    }

    private boolean isEmpty(int number) {
        boolean result;
        String word = String.valueOf(number);
        int index = word.indexOf('.');
        if(index == -1) result = true;
        else result = false;
        return result;
    }
}
