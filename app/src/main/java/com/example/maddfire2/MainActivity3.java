package com.example.maddfire2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity3 extends AppCompatActivity {

    EditText etEID, etName, etEmail, etConNo;
    Button btnSave;
    Emp emp;
    DatabaseReference dbRef;

    //method to clear all user inputs
    private void clearControls(){
        etEID.setText("");
        etName.setText("");
        etEmail.setText("");
        etConNo.setText("");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        etEID = findViewById(R.id.etEId);
        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etConNo = findViewById(R.id.etContact);

        btnSave = findViewById(R.id.btnSave);

        emp = new Emp();

        /*
        btnA.setOnClickListener(view -> {
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference myRef = database.getReference("message");

            myRef.setValue("Hello, World!");
        });*/



        btnSave.setOnClickListener(view -> {
            dbRef = FirebaseDatabase.getInstance().getReference().child("Employee");

            try {
                if(TextUtils.isEmpty(etEID.getText().toString()))
                    Toast.makeText(getApplicationContext(), "Please enter an EID", Toast.LENGTH_SHORT).show();
                else if (TextUtils.isEmpty(etName.getText().toString()))
                    Toast.makeText(getApplicationContext(), "Please enter a Name", Toast.LENGTH_SHORT).show();
                else if (TextUtils.isEmpty(etEmail.getText().toString()))
                    Toast.makeText(getApplicationContext(), "Please enter an Email", Toast.LENGTH_SHORT).show();
                else {
                    emp.setEID(etEID.getText().toString().trim());
                    emp.setName(etName.getText().toString().trim());
                    emp.setEmail(etEmail.getText().toString().trim());
                    emp.setConNo(Integer.parseInt(etConNo.getText().toString().trim()));

                    //insert into the database
                    //dbRef.push().setValue(std);
                    dbRef.child("emp1 ").setValue(emp);

                    //feedback to the user via toast
                    Toast.makeText(getApplicationContext(), "Data saved successfully", Toast.LENGTH_SHORT).show();
                    clearControls();
                }
            }
            catch(NumberFormatException e){
                Toast.makeText(getApplicationContext(), "Invalid Contact Number", Toast.LENGTH_SHORT).show();
            }
        });
    }


}