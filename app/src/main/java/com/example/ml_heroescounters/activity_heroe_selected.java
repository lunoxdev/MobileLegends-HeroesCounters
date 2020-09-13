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

    ImageView imageView2;
    TextView textView2;

    ImageView imageView3;
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroe_selected);

        //Turn on back button on actionbar before activate in Androidmanifest.xml
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Show activity name
        ((TextView) findViewById(R.id.main_toolbar_title)).setText("BEST TEAMMATES");
        ((TextView) findViewById(R.id.main_toolbar_title1)).setText("COUNTER");
        ((TextView) findViewById(R.id.main_toolbar_title2)).setText("COUNTERED BY");

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.tvName);

        imageView2 = findViewById(R.id.imageView2);
        textView2 = findViewById(R.id.tvName2);

        imageView3 = findViewById(R.id.imageView3);
        textView3 = findViewById(R.id.tvName3);


        Intent intent = getIntent();

        if(intent.getExtras() != null){
            String selectedName = intent.getStringExtra("name");
            //int selectedImage = intent.getIntExtra("image",0);

            //Here I can control the image to show
            //1
            if(selectedName.equals("Baxia")){
                textView.setText("Change");
                imageView.setImageResource(R.drawable.change);
                textView2.setText("Eudora");
                imageView2.setImageResource(R.drawable.eudora);
                textView3.setText("Gusion");
                imageView3.setImageResource(R.drawable.gusion);
                //2
            }else if(selectedName.equals("Khufra")){
                textView.setText("Vale");
                imageView.setImageResource(R.drawable.vale);
                textView2.setText("Saber");
                imageView2.setImageResource(R.drawable.saber);
                textView3.setText("Fanny");
                imageView3.setImageResource(R.drawable.fanny);
                //3
            }else if(selectedName.equals("Belerick")){
                textView.setText("Rafaela");
                imageView.setImageResource(R.drawable.rafaela);
                textView2.setText("Gusion");
                imageView2.setImageResource(R.drawable.gusion);
                textView3.setText("Miya");
                imageView3.setImageResource(R.drawable.miya);
                //4
            }else if(selectedName.equals("Uranus")){
                textView.setText("Hanabi");
                imageView.setImageResource(R.drawable.hanabi);
                textView2.setText("Eudora");
                imageView2.setImageResource(R.drawable.eudora);
                textView3.setText("Fanny");
                imageView3.setImageResource(R.drawable.fanny);
                //5
            }else if(selectedName.equals("Hylos")){
                textView.setText("Grock");
                imageView.setImageResource(R.drawable.grock);
                textView2.setText("Diggie");
                imageView2.setImageResource(R.drawable.diggie);
                textView3.setText("Roger");
                imageView3.setImageResource(R.drawable.roger);
                //6
            }else if(selectedName.equals("Grock")){
                textView.setText("Fanny");
                imageView.setImageResource(R.drawable.fanny);
                textView2.setText("Akai");
                imageView2.setImageResource(R.drawable.akai);
                textView3.setText("Odette");
                imageView3.setImageResource(R.drawable.odette);
                //7
            }else if(selectedName.equals("Gatotkaca")){
                textView.setText("Aurora");
                imageView.setImageResource(R.drawable.aurora);
                textView2.setText("Karina");
                imageView2.setImageResource(R.drawable.karina);
                textView3.setText("Roger");
                imageView3.setImageResource(R.drawable.roger);
                //8
            }else if(selectedName.equals("Johnson")){
                textView.setText("Argus");
                imageView.setImageResource(R.drawable.argus);
                textView2.setText("Diggie");
                imageView2.setImageResource(R.drawable.diggie);
                textView3.setText("Miya");
                imageView3.setImageResource(R.drawable.miya);
                //9
            }else if(selectedName.equals("Ruby")){
                textView.setText("Lapu-Lapu");
                imageView.setImageResource(R.drawable.lapulapu);
                textView2.setText("Chou");
                imageView2.setImageResource(R.drawable.chou);
                textView3.setText("Tigreal");
                imageView3.setImageResource(R.drawable.tigreal);
                //10
            }else if(selectedName.equals("Minotaur")){
                textView.setText("Miya");
                imageView.setImageResource(R.drawable.miya);
                textView2.setText("Gord");
                imageView2.setImageResource(R.drawable.gord);
                textView3.setText("Odette");
                imageView3.setImageResource(R.drawable.odette);
                //11
            }else if(selectedName.equals("Franco")){
                textView.setText("Odette");
                imageView.setImageResource(R.drawable.odette);
                textView2.setText("Fanny");
                imageView2.setImageResource(R.drawable.fanny);
                textView3.setText("Gord");
                imageView3.setImageResource(R.drawable.gord);
                //12
            }else if(selectedName.equals("Akai")){
                textView.setText("Saber");
                imageView.setImageResource(R.drawable.saber);
                textView2.setText("Grock");
                imageView2.setImageResource(R.drawable.grock);
                textView3.setText("Karina");
                imageView3.setImageResource(R.drawable.karina);
                //13
            }else if(selectedName.equals("Tigreal")){
                textView.setText("Gord");
                imageView.setImageResource(R.drawable.gord);
                textView2.setText("Eudora");
                imageView2.setImageResource(R.drawable.eudora);
                textView3.setText("Miya");
                imageView3.setImageResource(R.drawable.miya);
                //14
            }else if(selectedName.equals("Atlas")){
                textView.setText("Terizla");
                imageView.setImageResource(R.drawable.terizla);
                textView2.setText("Harith");
                imageView2.setImageResource(R.drawable.harith);
                textView3.setText("Karrie");
                imageView3.setImageResource(R.drawable.karrie);

                //Role Assassin
                //15 Ling
            }else if(selectedName.equals("Ling")){
                textView.setText("Angela");
                imageView.setImageResource(R.drawable.angela);
                textView2.setText("Gord");
                imageView2.setImageResource(R.drawable.gord);
                textView3.setText("Diggie");
                imageView3.setImageResource(R.drawable.diggie);
                //16 Hanzo
            }else if(selectedName.equals("Hanzo")){
                textView.setText("Angela");
                imageView.setImageResource(R.drawable.angela);
                textView2.setText("Johnson");
                imageView2.setImageResource(R.drawable.johnson);
                textView3.setText("Kimmy");
                imageView3.setImageResource(R.drawable.kimmy);
                //17 Selena
            }else if(selectedName.equals("Selena")){
                textView.setText("Kaja");
                imageView.setImageResource(R.drawable.kaja);
                textView2.setText("Saber");
                imageView2.setImageResource(R.drawable.saber);
                textView3.setText("Layla");
                imageView3.setImageResource(R.drawable.layla);
                //18 Gusion
            }else if(selectedName.equals("Gusion")){
                textView.setText("Angela");
                imageView.setImageResource(R.drawable.angela);
                textView2.setText("Lolita");
                imageView2.setImageResource(R.drawable.lolita);
                textView3.setText("Pharsa");
                imageView3.setImageResource(R.drawable.pharsa);
                //19 Helcurt
            }else if(selectedName.equals("Helcurt")){
                textView.setText("Hayabusa");
                imageView.setImageResource(R.drawable.hayabusa);
                textView2.setText("Akai");
                imageView2.setImageResource(R.drawable.akai);
                textView3.setText("Odette");
                imageView3.setImageResource(R.drawable.odette);
                //20 Lancelot
            }else if(selectedName.equals("Lancelot")){
                textView.setText("Aurora");
                imageView.setImageResource(R.drawable.aurora);
                textView2.setText("Natalia");
                imageView2.setImageResource(R.drawable.natalia);
                textView3.setText("Layla");
                imageView3.setImageResource(R.drawable.layla);
                //21 Natalia
            }else if(selectedName.equals("Natalia")){
                textView.setText("Saber");
                imageView.setImageResource(R.drawable.saber);
                textView2.setText("Yi Sun-Shin");
                imageView2.setImageResource(R.drawable.yisun);
                textView3.setText("Clint");
                imageView3.setImageResource(R.drawable.clint);
                //22 Hayabusa
            }else if(selectedName.equals("Hayabusa")){
                textView.setText("Zilong");
                imageView.setImageResource(R.drawable.zilong);
                textView2.setText("Aurora");
                imageView2.setImageResource(R.drawable.aurora);
                textView3.setText("Harley");
                imageView3.setImageResource(R.drawable.harley);
                //23 Fanny
            }else if(selectedName.equals("Fanny")){
                textView.setText("Grock");
                imageView.setImageResource(R.drawable.grock);
                textView2.setText("Akai");
                imageView2.setImageResource(R.drawable.akai);
                textView3.setText("Layla");
                imageView3.setImageResource(R.drawable.layla);
                //24 Karina
            }else if(selectedName.equals("Karina")){
                textView.setText("Diggie");
                imageView.setImageResource(R.drawable.diggie);
                textView2.setText("Akai");
                imageView2.setImageResource(R.drawable.akai);
                textView3.setText("Odette");
                imageView3.setImageResource(R.drawable.odette);
                //25 Saber
            }else if(selectedName.equals("Saber")){
                textView.setText("Harley");
                imageView.setImageResource(R.drawable.harley);
                textView2.setText("Diggie");
                imageView2.setImageResource(R.drawable.diggie);
                textView3.setText("Odette");
                imageView3.setImageResource(R.drawable.odette);
            }
            //Set value
        }
    }
}