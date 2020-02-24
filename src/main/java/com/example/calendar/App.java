package com.example.calendar;

import java.time.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Calendar example");
        CalendarExample cal = new CalendarExample();

        Event firstEvent = cal.addEvent(LocalDate.now().minusDays(1), LocalTime.of(12, 15, 0), LocalTime.of(12, 17, 0),
                "Test Event 1");

        Event secondEvent = cal.addEvent(LocalDate.now(), LocalTime.of(1, 0, 0), LocalTime.of(12, 17, 20),
                "Test Event 2");

        Event thirdEvent = cal.addEvent(LocalDate.now().plusDays(1), LocalTime.of(1, 0, 0), LocalTime.of(16, 0, 30),
                "Test Event 3");

        Event forthEvent = cal.addEvent(LocalDate.now().plusDays(2), LocalTime.of(9, 0, 0), LocalTime.of(12, 15, 15),
                "Test Event 4");

        Event fifthEvent = cal.addEvent(LocalDate.now().plusDays(6), LocalTime.of(8, 0, 0), LocalTime.of(10, 15, 0),
                "Test Event 4");

        Event aheadOneWeekEvent = cal.addEvent(LocalDate.now().plusWeeks(1), LocalTime.of(16, 0, 0),
                LocalTime.of(20, 0, 0), "Test Event 4");

        cal.printRemainingAgendaForTheWeek();
    }
}
