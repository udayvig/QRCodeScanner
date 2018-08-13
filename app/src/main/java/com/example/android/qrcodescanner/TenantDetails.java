package com.example.android.qrcodescanner;

public class TenantDetails {

    public String id, name, phone, email, room, dateOfJoining, rentAmount, pgId;

    public TenantDetails(String id, String pgId, String name, String phone, String email, String room, String dateOfJoining, String rentAmount) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.room = room;
        this.dateOfJoining = dateOfJoining;
        this.rentAmount = rentAmount;
        this.pgId = pgId;
    }

    public TenantDetails() {

    }
}
