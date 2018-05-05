package com.example.android.userprofile;

import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView profilePicture = findViewById(R.id.profile_picture);
        profilePicture.setImageResource(R.drawable.example_pic);
        //Image from CC0 Creative Commons
        //Free for commercial use
        //No attribution required

        TextView name = findViewById(R.id.name);
        name.setText("Jasmine");

        TextView birthday = findViewById(R.id.birthday);
        birthday.setText("03.10.1991");

        TextView country = findViewById(R.id.country);
        country.setText("USA");
    }
}
