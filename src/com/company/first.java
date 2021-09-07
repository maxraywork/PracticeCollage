package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random(); //instance of random class
        int upperbound = 51;
        int random;


        int cols,
                rows;

        System.out.println("Write the number of rows");
        rows = sc.nextInt();

        System.out.println("Write the number of columns");
        cols = sc.nextInt();

        int[][] array = new int[rows][cols];


        //Set the values
        int max = 0;
        int[] maxIndex = new int[2];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                random = rand.nextInt(upperbound);
                array[i][j] = random;

                if (array[i][j] > max) {
                    max = array[i][j];
                    maxIndex[0] = i;
                    maxIndex[1] = j;
                }

            }
        }

        System.out.println("Max number is " + max + ". It located in the " + maxIndex[0] + " row and " + maxIndex[1] + " column");

        System.out.println(Arrays.deepToString(array));

    }
}
