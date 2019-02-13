package com.iamyasas.basics;

/**
 * Print star patterns
 *   *
 *   **
 *   ***
 *   ****
 *   *****
 */
public class PrintStar {

    static int size;

    public static void main(String[] args) {

        size = 6;
        System.out.println("=== With loop ===");
        printStarWithLoops(size);
        System.out.println("=== With loop ===\n");
        System.out.println("=== Using recursive ===");
        printStarRecursively(1, 1);
        System.out.print("\n=== Using recursive ===");
    }

    private static void printStarWithLoops(int size){
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    private static void printStarRecursively(int x, int y){

        System.out.print("*");
        if (x == y) {
            if (y < size) {
                System.out.println("\n");
                printStarRecursively(1, y + 1);
            }
            else {
                return;
            }
        }
        else {
            printStarRecursively(x + 1, y);
        }
    }
}
