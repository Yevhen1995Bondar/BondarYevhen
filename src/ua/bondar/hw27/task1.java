package ua.bondar.hw27;

    public class task1 {
        public static void main(String[] args) {
            int rows = 4; // Кількість рядків
            int cols = 3; // Кількість стовпців

            int[][] array = fillArray(rows, cols);

            // Друк заповненого масиву для перевірки
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static int[][] fillArray(int rows, int cols) {
            int[][] array = new int[rows][cols];
            int value = 1;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    array[i][j] = (i % 2 == 0) ? value : -value;
                    value++;
                }
            }

            return array;
        }
    }


