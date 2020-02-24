package com.example.calendar;

import java.time.*;
import java.util.UUID;

public class Event {
    UUID id;
    LocalDate date;
    LocalTime startTime;
    LocalTime endTime;
    String description;

    public Event(LocalDate date, LocalTime startTime, LocalTime endTime, String description) {
        this.id = UUID.randomUUID();
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
    }
}