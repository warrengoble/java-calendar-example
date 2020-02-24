package com.example.calendar;

import java.util.*;
import java.time.*;

public class CalendarExample {
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

            if (event.id == id) {
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
        } while (endOfWeekDate.getDayOfWeek() != DayOfWeek.SUNDAY);

        Iterator<Event> listIterator = this.events.iterator();
        while (listIterator.hasNext()) {
            Event event = listIterator.next();
            LocalDateTime startDateTime = LocalDateTime.of(event.date, event.startTime);

            // Check if in range of rest of week
            if (startDateTime.isBefore(endOfWeekDate.atStartOfDay()) && startDateTime.isAfter(currentDateTime)) {
                System.out.format("Date: %s\nStart Time: %s\nEnd Time: %s\nDescription: %s\n\n", event.date,
                        event.startTime, event.endTime, event.description);
            }
        }
    }

    public void printAllEvents() {
        ListIterator<Event> listIterator = this.events.listIterator();

        while (listIterator.hasNext()) {
            Event event = listIterator.next();

            System.out.format("%s\n%s\n%s\n%s\n\n", event.date, event.startTime, event.endTime, event.description);
        }
    }
}
