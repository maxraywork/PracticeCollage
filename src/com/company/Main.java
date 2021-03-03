package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вводите последовательность чисел! Чтобы закончить, введите '0'!");
        double i = sc.nextDouble();
        while (i != 0) {
            if (i >= -5 && i <= 5) {
                System.out.println("Цифра: " + i + ", входит в диапозон от -5 до 5.");
            }
            else {
                System.out.println("Цифра: " + i + ", НЕ входит в диапозон от -5 до 5.");
            }
            i = sc.nextDouble();
        }
    }
}