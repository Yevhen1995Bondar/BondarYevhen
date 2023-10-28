public class DZ_24_Task2 {
    public static void main(String[] args) {
        double xA = 1, yA = 5;
        double xB = 3, yB = 5;
        double xC = 6, yC = 7;

        System.out.println("До обчислення:");
        System.out.println("xA = " + xA + ", yA = " + yA);
        System.out.println("xB = " + xB + ", yB = " + yB);
        System.out.println("xC = " + xC + ", yC = " + yC);

        double area = calculateTriangleArea(xA, yA, xB, yB, xC, yC);

        System.out.println("Площа трикутника: " + area);
    }

    public static double calculateTriangleArea(double xA, double yA, double xB, double yB, double xC, double yC) {
        double area = Math.abs((xA * (yB - yC) + xB * (yC - yA) + xC * (yA - yB)) / 2);
        return area;
    }
}

