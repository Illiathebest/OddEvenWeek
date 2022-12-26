package org.example;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class OddEvenWeek {

    private Calendar cal1;
    private Calendar cal2;

    public OddEvenWeek(int day1, int month1, int year1, int day2, int month2, int year2) {
        cal1 = new GregorianCalendar(day1, month1, year1);
        cal2 = new GregorianCalendar(day2, month2, year2);

    }

    public int Check () {
        if (cal1.get(Calendar.YEAR) != cal2.get(Calendar.YEAR))
            return 0;
        if (cal1.get(Calendar.WEEK_OF_YEAR) >= cal2.get(Calendar.WEEK_OF_YEAR))
            return 0;
        if ((cal2.get(Calendar.WEEK_OF_YEAR) - cal1.get(Calendar.WEEK_OF_YEAR)) % 2 == 0)
            return 2;
        else
            return 1;
    }
}
