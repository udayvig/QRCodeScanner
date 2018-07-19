package com.example.android.qrcodescanner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ComplaintActivity extends AppCompatActivity {

    EditText firstEditText, secondEditText, thirdEditText, feedbackEditText, resolvedEditText;
    Button saveButton;

    /*FirebaseUser firebaseUser;
    FirebaseAuth firebaseAuth;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;*/

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

        /*firebaseAuth = FirebaseAuth.getInstance();
        firebaseUser = firebaseAuth.getCurrentUser();
        firebaseDatabase = FirebaseDatabase.getInstance();
*/
      //  databaseReference = firebaseDatabase.getReference("PG/")
    }
}
