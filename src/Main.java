import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        comparison();
    }
    public static void comparison(){
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        if (a < b) {
            System.out.println(a);
        }else System.out.println(b);
    }
    public static void print(){
        System.out.println(a);
    }
}
