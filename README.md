# Java Calendar Example

## Overview

Implements a simple Calendar class that allows events to be added or removed. Event times are only within the day so the fields of an event are `date`, `startTime`, `endTime` and `description`. Also beginning of week starts on Monday.

The data for this example is synthetically generated (See App.java).  A few unit tests are also set up to test the functions of the `Calendar` class.

A function is called `printRemainingAgendaForTheWeek` to print the remaining events for the week as shown below:


```text
Date: Monday, February 24, 2020
Start Time: 2:13 AM
End Time: 3:13 AM
Description: An hour later

Date: Tuesday, February 25, 2020
Start Time: 1:00 AM
End Time: 4:00 PM
Description: A day later

Date: Wednesday, February 26, 2020
Start Time: 9:00 AM
End Time: 12:15 PM
Description: Five days later

Date: Sunday, March 1, 2020
Start Time: 8:00 AM
End Time: 10:15 AM
Description: Six days later
```

Note: Using only local time zone.

## Building and running

Using Maven build system. 
### Building
```bash
mvn package
```

### Running
```bash
java -cp target/calendar-example-1.0.jar com.example.calendar.App
```