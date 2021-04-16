package com.perscholas.training;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;

public class Result {
    private final int month;
    private final int day;
    private final int year;

    public String findDay() {
        LocalDate dt = LocalDate.of(year, month, day);
        return dt.getDayOfWeek().toString();
    }

    public Result(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}
