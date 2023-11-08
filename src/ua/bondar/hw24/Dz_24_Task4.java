package ua.bondar.hw24;

public class Dz_24_Task4 {

    public static void main(String[] args) {
        double num1 = -5;
        double num2 = 7;
        double num3 = 11;

        double minAbsNum = findMinAbsoluteNumber(num1, num2, num3);

        System.out.println("Менше за модулем число: " + minAbsNum);
    }

    public static double findMinAbsoluteNumber(double num1, double num2, double num3) {
        double absNum1 = Math.abs(num1);
        double absNum2 = Math.abs(num2);
        double absNum3 = Math.abs(num3);

        if (absNum1 <= absNum2 && absNum1 <= absNum3) {
            return num1;
        } else if (absNum2 <= absNum1 && absNum2 <= absNum3) {
            return num2;
        } else {
            return num3;
        }
    }
}
