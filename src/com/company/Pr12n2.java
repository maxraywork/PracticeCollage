package com.company;

public class Pr12n2 {

    public static void main(String[] args) {
        for(double x = 1; x <=3; x +=0.2) {
            if (x>2) {
                System.out.println("f(x) = " + Math.exp( Math.pow( Math.sin( Math.pow((x-1), 2) ), 3 ) ) );
            }
            if (x<=2) {
                System.out.println("f(x) = " + Math.exp(Math.pow(x, 2) - ((x-1)/(3-x))) );
            }
        }
    }
}