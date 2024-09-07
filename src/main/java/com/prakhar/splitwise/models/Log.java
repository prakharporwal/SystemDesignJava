package com.prakhar.splitwise.models;

import java.util.Date;

public class Log {
    Date time;
    String text;

    public Log(){}

    public Log(String text){
        this.time = new Date();
        this.text = text;
    }
}
