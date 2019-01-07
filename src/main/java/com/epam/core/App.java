package com.epam.core;

public class App {

    private Client client;
    private ConsoleEventLogger eventLogger;

    public App() {

    }

    public App(Client client, ConsoleEventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public void modifyLog(final String msg) {

        final String message = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(message);
    }

    ;

    public void setClient(Client client) {
        this.client = client;
    }

    public void setEventLogger(ConsoleEventLogger eventLogger) {
        this.eventLogger = eventLogger;
    }

    public Client getClient() {
        return client;
    }

    public ConsoleEventLogger getEventLogger() {
        return eventLogger;
    }
}
