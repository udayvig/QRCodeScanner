package com.example.android.qrcodescanner;

import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ComplaintActivity extends AppCompatActivity {

    EditText firstEditText, secondEditText, thirdEditText, feedbackEditText, resolvedEditText;
    Button saveButton;

    FirebaseUser firebaseUser;
    FirebaseAuth firebaseAuth;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    String pgId1, myId, myName, myRoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint);

        firstEditText = findViewById(R.id.firstEditText);
        secondEditText = findViewById(R.id.secondEditText);
        thirdEditText = findViewById(R.id.thirdEditText);
        feedbackEditText = findViewById(R.id.feedbackEditText);
        resolvedEditText = findViewById(R.id.resolvedEditText);

        saveButton = findViewById(R.id.saveButton);

        firebaseAuth = FirebaseAuth.getInstance();
        firebaseUser = firebaseAuth.getCurrentUser();
        firebaseDatabase = FirebaseDatabase.getInstance();


        databaseReference = firebaseDatabase.getReference().child("Tenants/").child(firebaseUser.getUid());


        databaseReference.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull final DataSnapshot dataSnapshot) {

                myRoom = dataSnapshot.child("room").getValue(String.class);
                myName = dataSnapshot.child("name").getValue(String.class);
                pgId1 = dataSnapshot.child("pgId").getValue(String.class);


            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        myId = firebaseUser.getUid();
        databaseReference = firebaseDatabase.getReference("PG/");

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Date date = new Date();
                String dateString = dateFormat.format(date);

                String firstLevel = firstEditText.getText().toString();
                String secondLevel = secondEditText.getText().toString();
                String thirdLevel = thirdEditText.getText().toString();
                String feedBack = feedbackEditText.getText().toString();
                boolean resolved = Boolean.parseBoolean(resolvedEditText.getText().toString());

                ComplaintDetails complaintDetails = new ComplaintDetails(feedBack, resolved, myName, myRoom, dateString);
                databaseReference.child(pgId1).child("Complaints").child(firstLevel).child(secondLevel).child(thirdLevel).setValue(complaintDetails);

            }
        });
    }
}
