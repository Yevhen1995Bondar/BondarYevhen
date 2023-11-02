public class Dz_24_Task3 {

    public static void main(String[] args) {

        int number1 = 13;
        int number2 = 28;


        // проверка
        boolean isEvenNumber1 = isEven(number1);
        boolean isEvenNumber2 = isEven(number2);

        System.out.println(number1 + " є парним числом: " + isEvenNumber1);
        System.out.println(number2 + " є парним числом: " + isEvenNumber2);





    }
    public static boolean isEven(int number){
        return number % 2 == 0;
    }
}

