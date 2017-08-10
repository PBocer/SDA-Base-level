package Fibonacci;

import java.util.Scanner;

/**
 * Created by Johny on 10.08.2017.
 */
public class Fibonacci {
    public static int fib(int n) {
        if (n > 2) {
            return fib(n-2)+fib(n-1);
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ktory wyraz ciagu chcesz uzyskac");
        byte x = sc.nextByte();

        System.out.println(fib(x));
    }
}


