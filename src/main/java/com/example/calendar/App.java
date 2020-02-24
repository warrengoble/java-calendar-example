package com.example.calendar;

import java.time.*;

public class App {
    public static void main(String[] args) {
        Calendar cal = new Calendar();

        LocalDate selectedDate = LocalDate.now();
        //LocalDate selectedDate = LocalDate.now().plusDays(2); // Test Shift a few days in advance.

        cal.addEvent(selectedDate.minusDays(6), LocalTime.of(0, 0, 0), LocalTime.of(12, 59, 0),
                "Six days before");

        cal.addEvent(selectedDate.minusDays(2), LocalTime.of(23, 15, 0), LocalTime.of(23, 59, 0),
                "Two days before");

        cal.addEvent(selectedDate.minusDays(1), LocalTime.of(23, 15, 0), LocalTime.of(23, 59, 0),
                "One day before");

        cal.addEvent(selectedDate, LocalTime.now().plusHours(1), LocalTime.now().plusHours(2),
                "An hour later");

        cal.addEvent(selectedDate.plusDays(1), LocalTime.of(1, 0, 0), LocalTime.of(16, 0, 30),
                "A day later");

        cal.addEvent(selectedDate.plusDays(2), LocalTime.of(9, 0, 0), LocalTime.of(12, 15, 0),
                "Two days later");

        cal.addEvent(selectedDate.plusDays(3), LocalTime.of(9, 0, 0), LocalTime.of(12, 15, 0),
                "Three days later");

        cal.addEvent(selectedDate.plusDays(4), LocalTime.of(9, 0, 0), LocalTime.of(12, 15, 0),
                "Four days later");

        cal.addEvent(selectedDate.plusDays(5), LocalTime.of(9, 0, 0), LocalTime.of(12, 15, 0),
                "Five days later");

        cal.addEvent(selectedDate.plusDays(6), LocalTime.of(8, 0, 0), LocalTime.of(10, 15, 0),
                "Six days later");
        
        cal.addEvent(selectedDate.plusDays(6), LocalTime.of(23, 0, 0), LocalTime.of(23, 59, 0),
                "One hour before end of week");

        cal.addEvent(selectedDate.plusDays(7), LocalTime.of(0, 0, 0),
                LocalTime.of(1, 0, 0), "Seven days later");

        cal.addEvent(selectedDate.plusWeeks(2), LocalTime.of(16, 0, 0),
                LocalTime.of(20, 0, 0), "Two weeks later");

        //cal.printRemainingAgendaForTheWeek();      
        cal.printRemainingAgendaForTheWeek(selectedDate.atStartOfDay());
    }
}
