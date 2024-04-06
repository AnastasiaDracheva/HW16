import java.lang.reflect.Array;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 5;
        int[] array = new  int[ARRAY_LENGTH];

        double[] arrayDouble = new double[ARRAY_LENGTH];
        array[1] = 55;
        array[0] = 99;
        arrayDouble[3] = 33;

        int[]arrayWithValues = {2,4,5,6,7,99,22};
        char[]characters = {'b','f','f',121};

        String[] arrayOfString = new String[2];
        String[] arrayOfStringValue = {"Hello","World"};
        arrayOfString[1] = "first String";

        System.out.println(arrayOfStringValue[0]);
        System.out.println(arrayOfStringValue[1]);
        System.out.println(arrayWithValues[6]);
        System.out.println(characters[0]);

        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.length;
        System.out.println("Среднее арифметическое: " + average);

        numbers = new int[]{1, 5, 3, 7, 2};
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Наибольший элемент: " + max);

        numbers = new int[] {1, 6, 3, 2, 4, 5};
        boolean foundDuplicate = false;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    foundDuplicate = true;
                    System.out.println("Повторяющийся элемент: " + numbers[i]);
                }
            }
        }
        if (!foundDuplicate) {
            System.out.println("Повторяющихся элементов нет");
        }

        numbers = new int[]{1, 2, 3, 4, 5};
        int sumNum = 0;
        for (int number : numbers) {
            sumNum  += number;
        }
        System.out.println("Сумма элементов: " + sumNum );

        for (int i = 10; i >= 1; i--) {
            System.out.print(i + ". ");
        }

        String str = "Hello, World!";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println("Количество символов (без пробелов): " + count);

        count = 0;
        str = "All of The Times";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Количество пробелов: " + count);

        numbers = new int[]{1, 2, 3, 4, 5};
        int sumNumb = 0;
        int i = 0;
        while (i < numbers.length) {
            sumNumb += numbers[i];
            i++;
        }
        System.out.println("Сумма элементов: " + sumNumb);
            // Длина массива

        final int LENGTH = 10;
        int[] numbersU = new int[LENGTH];
        Random rd = new Random();
        for (i = 0; i < LENGTH; i++) {

        }    // Генерация случайного числа

            numbers[i] = rd.nextInt();
            System.out.println("Элемент " + i + ": " + numbers[i]);
            numbers  = new int[10];for (i = 0; i < numbers.length; i++)
                numbers[i] = i + 1;
            i = 0;
                   while (i < numbers.length) {
                       if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i]);
                }
                       i++;
            }




    }
}