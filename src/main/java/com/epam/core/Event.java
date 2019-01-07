package com.epam.core;

import java.util.Date;

public class Event {

    private String id;
    private String msg;
    private Date date;

    public Event() {
    }

    public Event(Date date) {
        this.date = date;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id='" + id + '\'' +
                ", msg='" + msg + '\'' +
                ", date=" + date +
                '}';
    }
}
