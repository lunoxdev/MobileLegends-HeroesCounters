package com.example.ml_heroescounters;

import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class activity_heroe_selected extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroe_selected);

        //Turn on back button on actionbar before activate in Androidmanifest.xml
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Show activity name
        ((TextView) findViewById(R.id.main_toolbar_title)).setText("BEST TEAMMATES");

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.tvName);


        Intent intent = getIntent();

        if(intent.getExtras() != null){
            String selectedName = intent.getStringExtra("name");
            //int selectedImage = intent.getIntExtra("image",0);

            //Here I can control the image to show
            if(selectedName.equals("Baxia")){
                textView.setText(selectedName);
                imageView.setImageResource(R.drawable.johnson);
            }else if(selectedName.equals("Khufra")){
                textView.setText(selectedName);
                imageView.setImageResource(R.drawable.uranus);
            }
        }
        //set value;
    }
}