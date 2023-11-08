package practice5;

public class task3 {
    public static void main(String[] args) {
        int[] prices = {500, 754, 567, 1450, 2350, 232, 123, 2, 3, 109, 1090, 3000};
        int sum = sumProductWithPriceMore1000(prices);
        System.out.println("Загальна сума = " + sum);
    }

    public static int sumProductWithPriceMore1000(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 1000) {
                sum = sum + array[i];
            }
        }
        return sum;
    }
}
