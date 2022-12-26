package org.example;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        int month = in.nextInt();
        int year = in.nextInt();
        int day2 = in.nextInt();
        int month2 = in.nextInt();
        int year2 = in.nextInt();
        OddEvenWeek week = new OddEvenWeek(day, month, year, day2, month2, year2);

    }
}