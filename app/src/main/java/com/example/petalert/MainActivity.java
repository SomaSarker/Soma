package com.example.petalert;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void openLost(View view) {
        Intent intent = new Intent(this, LostActivity.class);
        startActivity(intent);
    }

    public void openFound(View view) {
        Intent intent = new Intent(this, FoundActivity.class);
        startActivity(intent);
    }
    public void viewLostDetails(View view) {
        Intent intent = new Intent(this, LostDetailsActivity.class);
        startActivity(intent);
    }

    public void viewFoundDetails(View view) {
        Intent intent = new Intent(this, FoundDetailsActivity.class);
        startActivity(intent);
    }

}