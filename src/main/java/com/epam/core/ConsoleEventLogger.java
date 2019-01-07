package com.epam.core;

public class ConsoleEventLogger {

    public ConsoleEventLogger() {
    }

    public void logEvent(final Event event) {
        System.out.println(event);
    }
}
