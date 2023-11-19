import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[1000];
        fillArray(array);

        int primeCount = countPrimes(array);

        System.out.println("Кількість простих чисел у масиві: " + primeCount);
    }

    public static void fillArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1; // Генеруємо випадкове ціле число від 1 до 100.
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrimes(int[] array) {
        int count = 0;
        for (int value : array) {
            if (isPrime(value)) {
                count++;
            }
        }
        return count;
    }
}
