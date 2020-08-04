package com.example.mygroup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    /* Define the UI elements */
    private EditText eName;
    private EditText ePassword;

    String userName = "";
    String userPassword = "";

    /* Class to hold credentials */
    static class Credentials {
        String name = "Admin";
        int password = 123456;
    }

    boolean isValid = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        /* Bind the XML views to Java Code Elements */
        eName = findViewById(R.id.username);
        ePassword = findViewById(R.id.password);
        Button eLogin = findViewById(R.id.go);

        /* Describe the logic when the login button is clicked */
        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /* Obtain user inputs */
                userName = eName.getText().toString();
                userPassword = ePassword.getText().toString();

                /* Check if the user inputs are empty */
                if (userName.isEmpty() || userPassword.isEmpty()) {
                    /* Display a message toast to user to enter the details */
                    Toast.makeText(login.this, "Please enter name and password!", Toast.LENGTH_LONG).show();

                } else {

                    /* Validate the user inputs */
                    isValid = validate(userName, userPassword);
                    startActivity(new Intent(login.this, contactus.class));
                    /* Validate the user inputs */

                    /* If not valid */


                }
            }
        });
    }

    /* Validate the credentials */
    private boolean validate(String userName, String userPassword) {
        /* Get the object of Credentials class */
        Credentials credentials = new Credentials();

        /* Check the credentials */
        return userName.equals(credentials.name) && userPassword.equals(credentials.password);
    }

}
