package com.codestates;

import java.util.Scanner;

public class Calendar {

    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapyear (int year) {
        if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
            return true;
        } else if(year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return false;
    }

    public int getMaxDaysOfMonth (int year, int month) {
        if(isLeapyear(year) == true) {
            return LEAP_MAX_DAYS[month - 1];
        } else {
            return MAX_DAYS[month - 1];
        }
    }

    public void printCalendar(int year, int month) {
    System.out.println("일  월  화  수  목  금  토");
    System.out.println("----------------------");


    int maxDate = getMaxDaysOfMonth(year, month);

        for(int i = 1; i <= maxDate; i++) {

            System.out.printf(" %2d", i);
            if(i % 7 == 0) {
                System.out.println();
            }
        }
    }
}
