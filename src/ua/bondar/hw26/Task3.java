import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[2000];
        fillArray(array);

        replaceEvenWithZeros(array);

        // Друк масиву для перевірки
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static void fillArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1; // Генеруємо випадкове ціле число від 1 до 100.
        }
    }

    public static void replaceEvenWithZeros(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }
    }
}