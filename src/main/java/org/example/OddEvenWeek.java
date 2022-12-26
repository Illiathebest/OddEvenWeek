package org.example;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class OddEvenWeek {

    int week1 = 0;
    int week2 = 0;
    int year1 = 0;
    int year2 = 0;


    public OddEvenWeek(int week1, int week2, int year1, int year2) {
        this.week1 = week1;
        this.week2 = week2;
        this.year1 = year1;
        this.year2 = year2;

    }

    public int Check () {
        if(year1 != year2)
            return 0;
        if(week1 >= week2)
            return 0;
        if (((week2 - week1) %2) == 0)
            return 2;
        else return 1;
    }
}
