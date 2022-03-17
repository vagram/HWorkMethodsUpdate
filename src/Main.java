import java.util.Scanner;

public class Main {
    static int a;
    static int b;

    public static void main(String[] args) {
        getNumber();
        comparison();

    }

    public static void getNumber() {
        System.out.println("Введите первое число ");
        a = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число ");

        b = new Scanner(System.in).nextInt();
    }

    public static void comparison() {
        if (a < b) {
            printFirst();
        } else {
            printSecond();
        }
    }

    public static void printFirst() {
        System.out.println(a);
    }

    public static void printSecond() {
        System.out.println(b);
    }
}
