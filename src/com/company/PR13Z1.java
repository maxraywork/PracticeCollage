package com.company;

import java.util.Arrays;
import java.util.OptionalInt;

public class PR13Z1 {
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

            for(int i = array.length-1; i >=0; i--){
                System.out.print(array[i] + " ");
            }
            System.out.println();
            OptionalInt min = Arrays.stream(array).min();
            OptionalInt max = Arrays.stream(array).max();
            System.out.println("Максимальное значение: " + min.getAsInt());
            System.out.println("Минимальное значение: " +  max.getAsInt());
        }

}
