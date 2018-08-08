package com.example.android.qrcodescanner;

public class ComplaintDetails {
    public String feedback, name, room, date, firstLevel, secondLevel, thirdLevel, newId;
    public boolean resolved;

    public ComplaintDetails(String feedback, String name, String room, String date, String firstLevel, String secondLevel, String thirdLevel, boolean resolved, String newId) {
        this.feedback = feedback;
        this.name = name;
        this.room = room;
        this.date = date;
        this.firstLevel = firstLevel;
        this.secondLevel = secondLevel;
        this.thirdLevel = thirdLevel;
        this.resolved = resolved;
        this.newId = newId;
    }

    public ComplaintDetails(String feedback, String date, String firstLevel, String secondLevel, String thirdLevel, String newId, boolean resolved) {
        this.feedback = feedback;
        this.date = date;
        this.firstLevel = firstLevel;
        this.secondLevel = secondLevel;
        this.thirdLevel = thirdLevel;
        this.newId = newId;
        this.resolved = resolved;
    }
}
