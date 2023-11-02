package ua.bondar.practice3;

//Задача
//Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр
//(заранее не известно сколько цифр будет в числе).
public class Task7 {
    public static void main(String[] args) {
        int number = 15_21_28_63;
        int sum = calcSum(number);
        System.out.println(sum);

    }

    public static int calcSum(int number) {

        int sum = 0;

        while (number != 0) {
            int remainder = number % 10;
            sum = remainder + sum;
            number /= 10;

        }
        return sum;
    }
}
