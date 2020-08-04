package com.example.mygroup;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class contactus extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);

        button = (Button) findViewById(R.id.about);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                            Aboutus();
            }

        });
    }

    public void Aboutus()

    {
        Intent intent = new Intent(this, Aboutus.class);
        startActivity(intent);

    }
}