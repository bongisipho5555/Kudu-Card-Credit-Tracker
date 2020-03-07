package com.example.kuducredittracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity {

    UserAccount userAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void register(View v)
    {
        EditText student_no = (EditText) findViewById(R.id.r_student_no);
        EditText password = (EditText) findViewById(R.id.r_password);
        EditText name = (EditText) findViewById(R.id.r_name);
        EditText surname = (EditText) findViewById(R.id.r_surname);
        EditText contact = (EditText) findViewById(R.id.contact_no);
        EditText email = (EditText) findViewById(R.id.email);
        String [] info = {student_no.getText().toString(), password.getText().toString(), name.getText().toString(), surname.getText().toString(), contact.getText().toString(), email.getText().toString()};

        UserAccount userAccount = new UserAccount(info, this);

        if (userAccount.register(info)){
            this.finish();
        }
    }
}
