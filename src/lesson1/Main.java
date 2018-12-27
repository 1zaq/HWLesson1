package lesson1;


public class Main {

    public static void main(String[] args) {
        // Прописал метод main
        byte a = 10;
        short b = 1000;
        int c = 50000;
        int d = 50000;
        long k = 1000000L;
        float f = 200.3f;
        double g = 20.12345;
        boolean j = false;
        char h = 'B';
        int number1 = 3;
        int number2 = 10;
        int number3 = 7;
        int number4 = -15;
        String name = "Alex";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(k);
        System.out.println(f);
        System.out.println(g);
        System.out.println(j);
        System.out.println(h);
        System.out.println(calculate(a, b, c, d));
        System.out.println(task4(number1,number2));
        System.out.println(positivornegativ(number3));
        System.out.println(negativ(number4));
        System.out.println(Hello(name));
    }
        //Создал переменные всех типов данных и инициализировал их значения с выводом в консоль

        public static int calculate ( int a, int b, int c, int d){
            int i = a * (b + (c / d));
            return i;
        }
        //Метод вычисляющий выражение и возвращающий результат

        public static int task4 (int number1, int number2){
            int sum = number1 + number2;
            if (sum >= 10 && sum <= 20) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
            return sum;

        }
        // Задали значения переменных, после проверки получили результат

        public static int positivornegativ (int number3) {
            if (number3 >= 0) {
                System.out.println("Число положительное");
            } else {
                System.out.println("Число отрицвтельное");
            }

            return number3;
        }
        // Задали значение переменной и проверили является ли оно положительным

        public static boolean negativ(int number4){
        if (number4 < 0) {
            return true;
        } else { return false;
        }

        }
        // При отрицательном числе выводим true

        public static String Hello (String name) {
                System.out.println("Привет!!!!! " + name);
                return name;

        }
        // Выводим имя

 }