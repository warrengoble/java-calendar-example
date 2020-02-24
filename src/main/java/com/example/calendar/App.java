package com.example.calendar;

import java.time.*;

public class App {
    public static void main(String[] args) {
        Calendar cal = new Calendar();

        cal.addEvent(LocalDate.now().minusDays(1), LocalTime.of(23, 15, 0), LocalTime.of(23, 59, 0),
                "One day before");

        cal.addEvent(LocalDate.now(), LocalTime.now().plusHours(1), LocalTime.now().plusHours(2),
                "An hour later");

        cal.addEvent(LocalDate.now().plusDays(1), LocalTime.of(1, 0, 0), LocalTime.of(16, 0, 30),
                "A day later");

        cal.addEvent(LocalDate.now().plusDays(2), LocalTime.of(9, 0, 0), LocalTime.of(12, 15, 15),
                "Five days later");

        cal.addEvent(LocalDate.now().plusDays(6), LocalTime.of(8, 0, 0), LocalTime.of(10, 15, 0),
                "Six days later");
        
        cal.addEvent(LocalDate.now().plusDays(6), LocalTime.of(23, 0, 0), LocalTime.of(23, 59, 0),
                "One hour before end of week");

        cal.addEvent(LocalDate.now().plusDays(7), LocalTime.of(0, 0, 0),
                LocalTime.of(1, 0, 0), "Seven days later");

        cal.addEvent(LocalDate.now().plusWeeks(2), LocalTime.of(16, 0, 0),
                LocalTime.of(20, 0, 0), "Two weeks later");

        cal.printRemainingAgendaForTheWeek();
    }
}
