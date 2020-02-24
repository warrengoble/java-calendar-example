package com.example.calendar;

import java.util.LinkedList;
import java.util.UUID;
import java.util.Iterator;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.DayOfWeek;
import java.time.format.FormatStyle;
import java.time.format.DateTimeFormatter;

public class Calendar {
    private LinkedList<Event> events = new LinkedList<Event>();

    public Event addEvent(LocalDate date, LocalTime startTime, LocalTime endTime, String description) {
        Event newEvent = new Event(date, startTime, endTime, description);
        this.events.add(newEvent);

        return newEvent;
    }

    public void removeEvent(Event event) {
        this.events.remove(event);
    }

    public void removeEventById(UUID id) {
        Iterator<Event> listIterator = this.events.iterator();
        while (listIterator.hasNext()) {
            Event event = listIterator.next();

            if (event.getId() == id) {
                this.events.remove(event);
                break;
            }
        }
    }

    public void printRemainingAgendaForTheWeek() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDate endOfWeekDate = LocalDate.now();

        do {
            endOfWeekDate = endOfWeekDate.plusDays(1);
        } while (endOfWeekDate.getDayOfWeek() != DayOfWeek.MONDAY);

        Iterator<Event> listIterator = this.events.iterator();
        while (listIterator.hasNext()) {
            Event event = listIterator.next();
            LocalDateTime startDateTime = LocalDateTime.of(event.getDate(), event.getStartTime());

            // Check if in range of rest of week
            if (startDateTime.isBefore(endOfWeekDate.atStartOfDay()) && startDateTime.isAfter(currentDateTime)) {
                System.out.format("Date: %s\nStart Time: %s\nEnd Time: %s\nDescription: %s\n\n", 
                event.getDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)),
                event.getStartTime().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)), 
                event.getEndTime().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)), 
                event.getDescription());
            }
        }
    }

    public LinkedList<Event> getEvents() {
        return this.events;
    }
}
