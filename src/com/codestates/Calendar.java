package com.codestates;

import java.util.Scanner;

public class Calendar {

    private static final int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int getMaxDaysOfMonth (int month) {
        return days[month - 1];
    }

    public void printCalendar(int month) {
    System.out.println("일  월  화  수  목  금  토");
    System.out.println("----------------------");

    Calendar cal = new Calendar();
    int maxDate = cal.getMaxDaysOfMonth(month);

        for(int i = 1; i <= maxDate; i++) {
        System.out.printf(" %2d", i);
        if(i % 7 == 0) {
            System.out.println();
        }
    }
    }
}
