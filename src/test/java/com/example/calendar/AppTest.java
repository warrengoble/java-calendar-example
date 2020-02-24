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
    // Test will try and add end time before start time which will throw.
    public void addEventWithError() {
        Calendar cal = new Calendar();
        
        LocalDate testDate = LocalDate.now();
        LocalTime testStartTime = LocalTime.of(10, 0, 0);
        LocalTime testEndTime = LocalTime.of(0, 0, 0);
        String testDescription = "Test addEventWithError";

        Event retEvent = cal.addEvent(
            testDate,
            testStartTime,
            testEndTime,
            testDescription
        );

        assertEquals(null, retEvent);
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

    // TODO Can use application for testing
    // public void testEventRestOfWeek() {
    //     // TODO Will Have to Test formatted output?.
    // }
}
