
## Representing Dates

Time can be represented in multiple ways:

- '20111203'
- '2011-12-03'
- '2011-12-03+01:00'
- '2011-12-03T10:15:30+01:00[Europe/Paris]'
- 'Tue, 3 Jun 2008 11:05:30 GMT'

A locale is a set of parameters that defines the user's language, region and any special variant preferences that the user wants to see in their user interface.

## Java APIs

Old APIs in the *java.util* package were not Immutable / Thread-safe, and
they were also verbose and hard to use so people created new APIs e.g.
`joda-time, java.time, ...`.

The new and **recommended API** we follow in this presentation is **`java.time`**.

- It is Immutable / Thread-safe.
- It has better design (Easier to understand).
- It is time-zone ready.

Tips on using different Date APIs

It is common that you find different Date/Time APIs in older projects or in
your dependencies, if so:

- Prefer the java.time API in your public API.
- Avoid mixing different Date APIs.
