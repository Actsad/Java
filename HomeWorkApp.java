// ___Author___ = Манаков Василий Владимирович;
package HomeWork1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = -4; //Введите значение
        int b = 3;  //Введите значение
        int summa;
        summa = a + b;

        if (summa >= 0) {
            System.out.println("Сумма положительна");
        } else {
            System.out.println("Сумма отрицательна");
        }
    }

    public static void printColor() {
        int value = 101; //Введите значение
        if (value <=0) {
            System.out.println("Красный");
        } else if (value>0 & value <= 100) {
            System.out.println("Жёлтый");
        } else System.out.println("Зелёный");
    }

    public static void compareNumbers() {
        int a = 2;  //Введите значение
        int b = 3;  //Введите значение
        if (a>=b) {
            System.out.println("a>=b");
        } else System.out.println("a<b");
    }
}
