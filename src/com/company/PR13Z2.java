package com.company;

public class PR13Z2 {
    public static void main(String[] args) {
        int[] arrays = {1, 5, 3, 6, 37, 4, 5};
        for (int i = 0; i < arrays.length; i++) {
            for (int a = i+1; a < arrays.length; a++) {
                if (arrays[i] == arrays[a]){
                    System.out.println("Индексы: " + a + " и " + i);
                }
            }
        }
    }
}
