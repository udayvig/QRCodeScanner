package com.example.android.qrcodescanner;

public class ComplaintDetails {
    public String feedback, name, room, date;
    public boolean resolved;

    public ComplaintDetails(String feedback, boolean resolved, String name, String room, String date) {
        this.feedback = feedback;
        this.resolved = resolved;
        this.name = name;
        this.room = room;
        this.date = date;
    }

    public ComplaintDetails() {

    }
}
