// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 2 * n - 1; j++) {
                if (j >= n - i - 1 && j <= n + i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < 2 * n - 1; j++) {
                if (j >= i + 1 && j < 2 * n - i - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
