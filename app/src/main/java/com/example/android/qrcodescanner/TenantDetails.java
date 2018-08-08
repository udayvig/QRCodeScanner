package com.example.android.qrcodescanner;

public class TenantDetails {

    public String id, name, phone, room, dateOfJoining, rentAmount, pgId;

    public TenantDetails(String id, String pgId, String name, String phone, String room, String dateOfJoining, String rentAmount) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.room = room;
        this.dateOfJoining = dateOfJoining;
        this.rentAmount = rentAmount;
        this.pgId = pgId;
    }

    public TenantDetails() {

    }
}
