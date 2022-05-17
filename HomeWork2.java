// ___Author___ = Манаков Василий Владимирович;
package HomeWork2;

public class HomeWork2 {

    public static void main(String[] args) {
        System.out.println(interval(10, 2));            //1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
        positiveandnegative(0);                            //2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
        System.out.println(isnegative(1));                 //3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        print("Hello world", 7);                        //4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
        System.out.println(year(2000));                    //5. Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    }

    public static boolean interval(int a, int b) {
        int d = a + b;
        return d >= 10 && d <= 20;
}

    public static void positiveandnegative(int a) {
        if (a<0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is positive");
        }

    }

    public static boolean isnegative(int a) {
        return a<0;

    }

    public static void print(String b, int a) {
        while (a!=0) {
            a--;
            System.out.println(b);
        }

    }

    public static boolean year(int a) {

        if (a % 400 == 0) {
            return true;
        } else return a % 4 == 0 && a % 100 != 0;
    }
}

