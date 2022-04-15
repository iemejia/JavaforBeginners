# Java Date/Time APIs

## Concepts

**How would you model time?**

Epoch = A moment in history  
Unix (Epoch) Time: Seconds after 1970-01-01

| Unix Time  | Date/Time            |
|------------|----------------------|
| 0          | 1970-01-01           |
| 1256953732 | 2009-10-31T01:48:52Z |

Java uses Unix Time but in milliseconds to represent timestamps

We can represent similarly periods of time

| Initial Time | Difference |
|--------------|------------|
| 1256953732   | 60000      |

**Is this enough?**

No!

There are time-zones too, usually represented as distance from Coordinated Universal Time (UTC)
A **time-zone offset** is the amount of time that a time-zone differs from Greenwich/UTC.
A **time-zone id** is a name for a corresponding time-zone.

| ZoneOffset | ZoneId       |
|------------|--------------|
| UTC+1      | Europe/Paris |
| UTC+4      | Asia/Dubai   |

but... Countries change time for some periods of the year, or for political/strategic reasons.

luckily Java has APIs that help us deal with this with grace.










