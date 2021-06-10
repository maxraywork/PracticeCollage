package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pr24 {

    public static void main(String[] args) {
        String regex = "[+]";
        Pattern pl = Pattern.compile(regex);

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        Matcher m = pl.matcher(a);
       if (m.find()) {
        System.out.println("Есть плюсик");
        } else {
        System.out.println("Нету плюсиков");
       }
    }
}
