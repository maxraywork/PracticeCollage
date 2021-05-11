package com.company;
import java.util.Scanner;

public class Pr15 {

        int flightNumber;
        double time;
        String destination, planeType, dayOfWeek;

        public void getFulllClass() {
            System.out.println(flightNumber + " " + time + " " + destination + " " + planeType + " " + dayOfWeek);
        }

        public int getFlyNum() {
            return flightNumber;
        }

        public String getDestination() {
            return destination;
        }

        public String getPlaneType() {
            return planeType;
        }

        public String getDayOfWeek() {
            return dayOfWeek;
        }

        public double getTime() {
            return time;
        }

        static Pr15[] AirArr = new Pr15[5];

        public static void main(String[] args) {
            Pr15 eleven = new Pr15();
            eleven.destination = "Moscow";
            eleven.flightNumber = 11;
            eleven.dayOfWeek = "Monday";
            eleven.planeType = "Boeing";
            eleven.time = 20.20;

            Pr15 ten = new Pr15();
            ten.destination = "Kaliningrad";
            ten.flightNumber = 10;
            ten.dayOfWeek = "Tuesday";
            ten.planeType = "Boeing";
            ten.time = 21.00;

            Pr15 twelve = new Pr15();
            twelve.destination = "Moscow";
            twelve.flightNumber = 12;
            twelve.dayOfWeek = "Wednesday";
            twelve.planeType = "Boeing";
            twelve.time = 19.50;

            Pr15 thirteen = new Pr15();
            thirteen.destination = "Kaluga";
            thirteen.flightNumber = 13;
            thirteen.dayOfWeek = "Monday";
            thirteen.planeType = "Boeing";
            thirteen.time = 22.30;

            Pr15 fourteen = new Pr15();
            fourteen.destination = "Kaliningrad";
            fourteen.flightNumber = 14;
            fourteen.planeType = "Boeing";
            fourteen.dayOfWeek = "Monday";
            fourteen.time = 15.10;


            AirArr[0] = ten;
            AirArr[1] = eleven;
            AirArr[2] = twelve;
            AirArr[3] = thirteen;
            AirArr[4] = fourteen;

            int a;
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите пункт назначения");
            String city = sc.nextLine();
            for (a = 0; a < AirArr.length; a++) {
                if (AirArr[a].destination.equals(city)) {
                    AirArr[a].getFulllClass();
                }
            }

            System.out.println("Введите день недели");
            String day = sc.nextLine();
            for (a = 0; a < AirArr.length; a++) {
                if (AirArr[a].dayOfWeek.equals(day)) {
                    AirArr[a].getFulllClass();
                }
            }

            System.out.println("Введите день недели и минимальное время полета");
            String dayTwo = sc.nextLine();
            double timetwo = sc.nextDouble();
            for (a = 0; a < AirArr.length; a++) {
                if (AirArr[a].dayOfWeek.equals(day)) {
                    if (AirArr[a].time > timetwo) {
                        AirArr[a].getFulllClass();
                    }
                }
            }


        }
    }

