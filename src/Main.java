import java.util.Scanner;

public class Main {
    int c;
    int a;
    int b;

    public static void main(String[] args){
        getNumber();
        comparison();

    }
    public static void getNumber(){
        a = new Scanner(System.in).nextInt();
        b = new Scanner(System.in).nextInt();
    }
    public static void comparison(){
        if (a < b) {
            printFirst();
        }else printSecond();
    }
    public static void printFirst(){
        System.out.println(a);
    }
    public static void printSecond(){
        System.out.println(b);
    }
}
