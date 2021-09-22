import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b, c;
        double u, square;

        System.out.print("1. kenarı giriniz:");
        a = inp.nextInt();

        System.out.print("2. kenarı giriniz:");
        b = inp.nextInt();

        System.out.print("3. kenarı giriniz:");
        c = inp.nextInt();

        u = (a + b + c) / 2;

        square = Math.sqrt(u * (u - a)* (u - b) * (u - c));

        System.out.print("Üçgenin Alanı:" + square);

    }
}
