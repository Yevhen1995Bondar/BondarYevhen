import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        int[] array = new int[400];
        fillArray(array);

        double arithmeticMean = calculateArithmeticMean(array);
        double geometricMean = calculateGeometricMean(array);

        System.out.println("Середнє арифметичне: " + arithmeticMean);
        System.out.println("Середнє геометричне: " + geometricMean);
    }

    public static void fillArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(3) + 1; // Генеруємо випадкове ціле число від 1 до 10.
        }
    }

    public static double calculateArithmeticMean(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (double) sum / array.length;
    }

    public static double calculateGeometricMean(int[] array) {
        double product = 1.0;
        for (int value : array) {
            product *= value;
        }
        return Math.pow(product, 1.0 / array.length);
    }
}
