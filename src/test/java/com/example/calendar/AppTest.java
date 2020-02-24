package com.example.calendar;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.junit.Test;

public class AppTest {
    @Test
    public void addEvent() {
        Calendar cal = new Calendar();
        
        LocalDate testDate = LocalDate.now();
        LocalTime testStartTime = LocalTime.now();
        LocalTime testEndTime = LocalTime.now().plusHours(6);
        String testDescription = "Test addEvent";

        Event retEvent = cal.addEvent(
            testDate,
            testStartTime,
            testEndTime,
            testDescription
        );

        assertTrue(cal.getEvents().contains(retEvent));
    }

    @Test
    public void removeEvent() {
        Calendar cal = new Calendar();
        
        LocalDate testDate = LocalDate.now();
        LocalTime testStartTime = LocalTime.now();
        LocalTime testEndTime = LocalTime.now().plusHours(6);
        String testDescription = "Test removeEvent";

        Event retEvent = cal.addEvent(
            testDate,
            testStartTime,
            testEndTime,
            testDescription
        );

        cal.removeEvent(retEvent);

        assertFalse(cal.getEvents().contains(retEvent));
    }

    @Test
    public void removeEventById() {
        Calendar cal = new Calendar();
        
        LocalDate testDate = LocalDate.now();
        LocalTime testStartTime = LocalTime.now();
        LocalTime testEndTime = LocalTime.now().plusHours(6);
        String testDescription = "Test removeEventById";

        Event retEvent = cal.addEvent(
            testDate,
            testStartTime,
            testEndTime,
            testDescription
        );

        cal.removeEventById(retEvent.getId());

        assertFalse(cal.getEvents().contains(retEvent));
    }

    public void testEndOfWeek() {
        //
    }
}
