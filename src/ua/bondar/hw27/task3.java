package ua.bondar.hw27;

public class task3 {
    public static void main(String[] args) {
        int[][] originalArray = {
                {1, 2, 1, 3},
                {3, 4, 2, 4}
        };

        int[][] transposedArray = transposeArray(originalArray);

        System.out.println("До:");
        printArray(originalArray);
        System.out.println("Після:");
        printArray(transposedArray);
    }

    public static int[][] transposeArray(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int[][] transposedArray = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedArray[j][i] = array[i][j];
            }
        }

        return transposedArray;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
