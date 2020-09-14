package com.example.ml_heroescounters;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hide Actiona bar just for Main activity
        getSupportActionBar().hide();

        //Title action bar
        ((TextView) findViewById(R.id.main_toolbar_title)).setText("HEROES COUNTERS");

    }

    //Activity to go to role tank activity
    public void TANK(View view) {
        Intent activity_tank = new Intent(MainActivity.this, activity_role_tank.class);
        startActivity(activity_tank);
    }

    //Activity to go to role assassin activity
    public void ASSASSIN(View view) {
        Intent activity_assassin = new Intent(MainActivity.this, activity_roleassassin.class);
        startActivity(activity_assassin);
    }
    //Activity to go to role fighter activity
    public void FIGHTER(View view) {
        Intent activity_rolefighter = new Intent(MainActivity.this, activity_rolefighter.class);
        startActivity(activity_rolefighter);
    }
    //Activity to go to role mage activity
    public void MAGE(View view) {
        Intent activity_rolemage = new Intent(MainActivity.this, activity_rolemage.class);
        startActivity(activity_rolemage);
    }
//    //Activity to go to role marksman activity
//    public void MARKSMAN(View view) {
//        Intent activity_rolemarksman = new Intent(MainActivity.this, activity_rolemarksman.class);
//        startActivity(activity_rolemarksman);
//    }
//    //Activity to go to role mage activity
//    public void MAGE(View view) {
//        Intent activity_rolesupport = new Intent(MainActivity.this, activity_rolesupport.class);
//        startActivity(activity_rolesupport);
//    }
}