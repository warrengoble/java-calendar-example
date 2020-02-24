package com.example.calendar;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public class Event {
    private UUID id;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private String description;

    public Event(LocalDate date, LocalTime startTime, LocalTime endTime, String description) {
        this.id = UUID.randomUUID();
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
    }

    public UUID getId() {
        return this.id;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public LocalTime getStartTime() {
        return this.startTime;
    }

    public LocalTime getEndTime() {
        return this.endTime;
    }

    public String getDescription() {
        return this.description;
    }
}