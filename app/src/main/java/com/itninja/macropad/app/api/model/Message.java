package com.itninja.macropad.app.api.model;

public class Message {

    private String action;

    public Message(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

}
