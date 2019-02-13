package com.iamyasas.basics;

/**
 * Find the maximum number in an array
 *
 */
public class Max
{
    static int[] input = {2, 13, 1, 7, 11};
    static int max;

    public static void main( String[] args )
    {
        max  = input[0];
        System.out.format("Max using a loop is %d \n", findMax());

        max  = input[0];
        System.out.printf("Max using recursive method is %d \n", findMaxRecursive(1));

    }

    private static int findMax(){

        for (int i = 1; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
            }
        }

        return max;
    }

    private static int findMaxRecursive(int index){
        if (index == input.length) {
            return max;
        }

        if (input[index] > max) {
            max = input[index];
        }

        return findMaxRecursive(index + 1);
    }
}
