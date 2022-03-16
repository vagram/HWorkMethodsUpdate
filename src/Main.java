import java.util.Scanner;

public class Main {
    int c;
    int a;
    int b;

    public static void main(String[] args){
        comparison();
    }
    public static void getNumber(){
        int firstNumber = new Scanner(System.in).nextInt();
        int secondNumber = new Scanner(System.in).nextInt();
    }
    public static void comparison(){
        if (a < b) {
            System.out.println(a);
        }else System.out.println(b);
    }
    public static void print(){
        System.out.println(a);
    }
}
