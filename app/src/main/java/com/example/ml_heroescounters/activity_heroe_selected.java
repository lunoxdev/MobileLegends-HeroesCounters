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

                //Role Fighter
                //26 Yu Zhong
            }else if(selectedName.equals("Yu Zhong")){
                textView.setText("Luo Yi");
                imageView.setImageResource(R.drawable.luoyi);
                textView2.setText("Balmond");
                imageView2.setImageResource(R.drawable.balmond);
                textView3.setText("Zilong");
                imageView3.setImageResource(R.drawable.zilong);
                //27 Silvanna
            }else if(selectedName.equals("Silvanna")){
                textView.setText("Tigreal");
                imageView.setImageResource(R.drawable.tigreal);
                textView2.setText("Eudora");
                imageView2.setImageResource(R.drawable.eudora);
                textView3.setText("Moskov");
                imageView3.setImageResource(R.drawable.moskov);
                //28 Masha
            }else if(selectedName.equals("Masha")){
                textView.setText("Angela");
                imageView.setImageResource(R.drawable.angela);
                textView2.setText("Harith");
                imageView2.setImageResource(R.drawable.harith);
                textView3.setText("Jawhead");
                imageView3.setImageResource(R.drawable.jawhead);
                //29 Dyrroth
            }else if(selectedName.equals("Dyrroth")){
                textView.setText("Rafaela");
                imageView.setImageResource(R.drawable.rafaela);
                textView2.setText("Johnson");
                imageView2.setImageResource(R.drawable.johnson);
                textView3.setText("Gord");
                imageView3.setImageResource(R.drawable.gord);
                //30 X-Borg
            }else if(selectedName.equals("X-Borg")){
                textView.setText("Jawhead");
                imageView.setImageResource(R.drawable.jawhead);
                textView2.setText("Minsitthar");
                imageView2.setImageResource(R.drawable.minsitthar);
                textView3.setText("Hylos");
                imageView3.setImageResource(R.drawable.hylos);
                //31 Terizla
            }else if(selectedName.equals("Terizla")){
                textView.setText("Tigreal");
                imageView.setImageResource(R.drawable.tigreal);
                textView2.setText("Granger");
                imageView2.setImageResource(R.drawable.granger);
                textView3.setText("Gord");
                imageView3.setImageResource(R.drawable.gord);
                //32 Guinevere
            }else if(selectedName.equals("Guinevere")){
                textView.setText("Minotaur");
                imageView.setImageResource(R.drawable.minotaur);
                textView2.setText("Diggie");
                imageView2.setImageResource(R.drawable.diggie);
                textView3.setText("Balmond");
                imageView3.setImageResource(R.drawable.balmond);
                //33 Bandang
            }else if(selectedName.equals("Badang")){
                textView.setText("Kadita");
                imageView.setImageResource(R.drawable.kadita);
                textView2.setText("Akai");
                imageView2.setImageResource(R.drawable.akai);
                textView3.setText("Fanny");
                imageView3.setImageResource(R.drawable.fanny);
                //34 Minsitthar
            }else if(selectedName.equals("Minsitthar")){
                textView.setText("Hanabi");
                imageView.setImageResource(R.drawable.hanabi);
                textView2.setText("Lunox");
                imageView2.setImageResource(R.drawable.lunox);
                textView3.setText("Harith");
                imageView3.setImageResource(R.drawable.harith);
                //35 Thamuz
            }else if(selectedName.equals("Thamuz")){
                textView.setText("Angela");
                imageView.setImageResource(R.drawable.angela);
                textView2.setText("Minotaur");
                imageView2.setImageResource(R.drawable.minotaur);
                textView3.setText("Miya");
                imageView3.setImageResource(R.drawable.miya);
                //36 Leomord
            }else if(selectedName.equals("Leomord")){
                textView.setText("Minotaur");
                imageView.setImageResource(R.drawable.minotaur);
                textView2.setText("Kaja");
                imageView2.setImageResource(R.drawable.kaja);
                textView3.setText("Lesley");
                imageView3.setImageResource(R.drawable.lesley);
                //37 Aldous
            }else if(selectedName.equals("Aldous")){
                textView.setText("Angela");
                imageView.setImageResource(R.drawable.angela);
                textView2.setText("Kaja");
                imageView2.setImageResource(R.drawable.kaja);
                textView3.setText("Lesley");
                imageView3.setImageResource(R.drawable.lesley);
                //38 Kaja
            }else if(selectedName.equals("Kaja")){
                textView.setText("Franco");
                imageView.setImageResource(R.drawable.franco);
                textView2.setText("Martis");
                imageView2.setImageResource(R.drawable.martis);
                textView3.setText("Gusion");
                imageView3.setImageResource(R.drawable.gusion);
                //39 Martis
            }else if(selectedName.equals("Martis")){
                textView.setText("Tigreal");
                imageView.setImageResource(R.drawable.tigreal);
                textView2.setText("Diggie");
                imageView2.setImageResource(R.drawable.diggie);
                textView3.setText("Odette");
                imageView3.setImageResource(R.drawable.odette);
                //40 Jawhead
            }else if(selectedName.equals("Jawhead")){
                textView.setText("Tigreal");
                imageView.setImageResource(R.drawable.tigreal);
                textView2.setText("Diggie");
                imageView2.setImageResource(R.drawable.diggie);
                textView3.setText("Gord");
                imageView3.setImageResource(R.drawable.gord);
                //41 Argus
            }else if(selectedName.equals("Argus")){
                textView.setText("Aurora");
                imageView.setImageResource(R.drawable.aurora);
                textView2.setText("Akai");
                imageView2.setImageResource(R.drawable.akai);
                textView3.setText("Odette");
                imageView3.setImageResource(R.drawable.odette);
                //42 Roger
            }else if(selectedName.equals("Roger")){
                textView.setText("Rafaela");
                imageView.setImageResource(R.drawable.rafaela);
                textView2.setText("Saber");
                imageView2.setImageResource(R.drawable.saber);
                textView3.setText("Hayabusa");
                imageView3.setImageResource(R.drawable.hayabusa);
                //43 Lapu-Lapu
            }else if(selectedName.equals("Lapu-Lapu")){
                textView.setText("Tigreal");
                imageView.setImageResource(R.drawable.tigreal);
                textView2.setText("Akai");
                imageView2.setImageResource(R.drawable.akai);
                textView3.setText("Layla");
                imageView3.setImageResource(R.drawable.layla);
                //44 Hilda
            }else if(selectedName.equals("Hilda")){
                textView.setText("Karina");
                imageView.setImageResource(R.drawable.karina);
                textView2.setText("Karrie");
                imageView2.setImageResource(R.drawable.karrie);
                textView3.setText("Layla");
                imageView3.setImageResource(R.drawable.layla);
                //45 Alpha
            }else if(selectedName.equals("Alpha")){
                textView.setText("Irithel");
                imageView.setImageResource(R.drawable.irithel);
                textView2.setText("Layla");
                imageView2.setImageResource(R.drawable.layla);
                textView3.setText("Zilong");
                imageView3.setImageResource(R.drawable.zilong);
                //46 Sun
            }else if(selectedName.equals("Sun")){
                textView.setText("Aurora");
                imageView.setImageResource(R.drawable.aurora);
                textView2.setText("Odette");
                imageView2.setImageResource(R.drawable.odette);
                textView3.setText("Layla");
                imageView3.setImageResource(R.drawable.layla);
                //47 Chou
            }else if(selectedName.equals("Chou")){
                textView.setText("Aurora");
                imageView.setImageResource(R.drawable.aurora);
                textView2.setText("Nana");
                imageView2.setImageResource(R.drawable.nana);
                textView3.setText("Gord");
                imageView3.setImageResource(R.drawable.gord);
                //48 Freya
            }else if(selectedName.equals("Freya")){
                textView.setText("Aurora");
                imageView.setImageResource(R.drawable.aurora);
                textView2.setText("Natalia");
                imageView2.setImageResource(R.drawable.natalia);
                textView3.setText("Alucard");
                imageView3.setImageResource(R.drawable.alucard);
                //49 Zilong
            }else if(selectedName.equals("Zilong")){
                textView.setText("Eudora");
                imageView.setImageResource(R.drawable.eudora);
                textView2.setText("Alucard");
                imageView2.setImageResource(R.drawable.alucard);
                textView3.setText("Yi Sun-Shin");
                imageView3.setImageResource(R.drawable.yisun);
                //50 Bane
            }else if(selectedName.equals("Bane")){
                textView.setText("Zhask");
                imageView.setImageResource(R.drawable.zhask);
                textView2.setText("Zilong");
                imageView2.setImageResource(R.drawable.zilong);
                textView3.setText("Natalia");
                imageView3.setImageResource(R.drawable.natalia);
                //51 Alucard
            }else if(selectedName.equals("Alucard")){
                textView.setText("Aurora");
                imageView.setImageResource(R.drawable.aurora);
                textView2.setText("Karina");
                imageView2.setImageResource(R.drawable.karina);
                textView3.setText("Layla");
                imageView3.setImageResource(R.drawable.layla);
                //52 Balmond
            }else if(selectedName.equals("Balmond")){
                textView.setText("Nana");
                imageView.setImageResource(R.drawable.nana);
                textView2.setText("Chou");
                imageView2.setImageResource(R.drawable.chou);
                textView3.setText("Gord");
                imageView3.setImageResource(R.drawable.gord);

                //Role Mage
                //53 Luo Yi
            }else if(selectedName.equals("Luo Yi")){
                textView.setText("Tigreal");
                imageView.setImageResource(R.drawable.tigreal);
                textView2.setText("Hayabusa");
                imageView2.setImageResource(R.drawable.hayabusa);
                textView3.setText("Valir");
                imageView3.setImageResource(R.drawable.valir);
                //54 Cecilion
            }else if(selectedName.equals("Cecilion")){
                textView.setText("Carmilla");
                imageView.setImageResource(R.drawable.carmilla);
                textView2.setText("Gusion");
                imageView2.setImageResource(R.drawable.gusion);
                textView3.setText("X-Borg");
                imageView3.setImageResource(R.drawable.xborg);
                //55 Lylia
            }else if(selectedName.equals("Lylia")){
                textView.setText("Vale");
                imageView.setImageResource(R.drawable.vale);
                textView2.setText("Saber");
                imageView2.setImageResource(R.drawable.saber);
                textView3.setText("Layla");
                imageView3.setImageResource(R.drawable.layla);
                //56 Esmeralda
            }else if(selectedName.equals("Esmeralda")){
                textView.setText("Tigreal");
                imageView.setImageResource(R.drawable.tigreal);
                textView2.setText("Guinevere");
                imageView2.setImageResource(R.drawable.guinevere);
                textView3.setText("Johnson");
                imageView3.setImageResource(R.drawable.johnson);
                //57 Kadita
            }else if(selectedName.equals("Kadita")){
                textView.setText("Angela");
                imageView.setImageResource(R.drawable.angela);
                textView2.setText("Helcurt");
                imageView2.setImageResource(R.drawable.helcurt);
                textView3.setText("Hanabi");
                imageView3.setImageResource(R.drawable.hanabi);
                //58 Harith
            }else if(selectedName.equals("Harith")){
                textView.setText("GatotKaca");
                imageView.setImageResource(R.drawable.gatotkaca);
                textView2.setText("Kaja");
                imageView2.setImageResource(R.drawable.kaja);
                textView3.setText("Layla");
                imageView3.setImageResource(R.drawable.layla);
                //59 Lunox
            }else if(selectedName.equals("Lunox")){
                textView.setText("Franco");
                imageView.setImageResource(R.drawable.franco);
                textView2.setText("Martis");
                imageView2.setImageResource(R.drawable.martis);
                textView3.setText("Lancelot");
                imageView3.setImageResource(R.drawable.lancelot);
                //60 Vale
            }else if(selectedName.equals("Vale")){
                textView.setText("Tigreal");
                imageView.setImageResource(R.drawable.tigreal);
                textView2.setText("Gusion");
                imageView2.setImageResource(R.drawable.gusion);
                textView3.setText("Hanabi");
                imageView3.setImageResource(R.drawable.hanabi);
                //61 Change
            }else if(selectedName.equals("Change")){
                textView.setText("Tigreal");
                imageView.setImageResource(R.drawable.tigreal);
                textView2.setText("Saber");
                imageView2.setImageResource(R.drawable.saber);
                textView3.setText("Jawhead");
                imageView3.setImageResource(R.drawable.jawhead);
                //62 Valir
            }else if(selectedName.equals("Valir")){
                textView.setText("Aurora");
                imageView.setImageResource(R.drawable.aurora);
                textView2.setText("Karina");
                imageView2.setImageResource(R.drawable.karina);
                textView3.setText("Pharsa");
                imageView3.setImageResource(R.drawable.pharsa);
                //63 Pharsa
            }else if(selectedName.equals("Pharsa")){
                textView.setText("Aurora");
                imageView.setImageResource(R.drawable.aurora);
                textView2.setText("Zhask");
                imageView2.setImageResource(R.drawable.zhask);
                textView3.setText("Odette");
                imageView3.setImageResource(R.drawable.odette);
                //64 Zhask
            }else if(selectedName.equals("Zhask")){
                textView.setText("Lolita");
                imageView.setImageResource(R.drawable.lolita);
                textView2.setText("Gord");
                imageView2.setImageResource(R.drawable.gord);
                textView3.setText("Alucard");
                imageView3.setImageResource(R.drawable.alucard);
                //65 Odette
            }else if(selectedName.equals("Odette")){
                textView.setText("Grock");
                imageView.setImageResource(R.drawable.grock);
                textView2.setText("Aurora");
                imageView2.setImageResource(R.drawable.aurora);
                textView3.setText("Cyclops");
                imageView3.setImageResource(R.drawable.cyclops);
                //66 Harley
            }else if(selectedName.equals("Harley")){
                textView.setText("Zilong");
                imageView.setImageResource(R.drawable.zilong);
                textView2.setText("Diggie");
                imageView2.setImageResource(R.drawable.diggie);
                textView3.setText("Cyclops");
                imageView3.setImageResource(R.drawable.cyclops);
                //67 Vexana
            }else if(selectedName.equals("Vexana")){
                textView.setText("Tigreal");
                imageView.setImageResource(R.drawable.tigreal);
                textView2.setText("Lancelot");
                imageView2.setImageResource(R.drawable.lancelot);
                textView3.setText("Odette");
                imageView3.setImageResource(R.drawable.odette);
                //68 Aurora
            }else if(selectedName.equals("Aurora")){
                textView.setText("Gatotkaca");
                imageView.setImageResource(R.drawable.gatotkaca);
                textView2.setText("Lancelot");
                imageView2.setImageResource(R.drawable.lancelot);
                textView3.setText("Eudora");
                imageView3.setImageResource(R.drawable.eudora);
                //69 Cyclops
            }else if(selectedName.equals("Cyclops")){
                textView.setText("Franco");
                imageView.setImageResource(R.drawable.franco);
                textView2.setText("Harley");
                imageView2.setImageResource(R.drawable.harley);
                textView3.setText("Karina");
                imageView3.setImageResource(R.drawable.karina);
                //70 Kagura
            }else if(selectedName.equals("Kagura")){
                textView.setText("Hayabusa");
                imageView.setImageResource(R.drawable.hayabusa);
                textView2.setText("Harley");
                imageView2.setImageResource(R.drawable.harley);
                textView3.setText("Layla");
                imageView3.setImageResource(R.drawable.layla);
                //71 Gord
            }else if(selectedName.equals("Gord")){
                textView.setText("Grock");
                imageView.setImageResource(R.drawable.grock);
                textView2.setText("Saber");
                imageView2.setImageResource(R.drawable.saber);
                textView3.setText("Miya");
                imageView3.setImageResource(R.drawable.miya);
                //72 Eudora
            }else if(selectedName.equals("Eudora")){
                textView.setText("Zilong");
                imageView.setImageResource(R.drawable.zilong);
                textView2.setText("Aurora");
                imageView2.setImageResource(R.drawable.aurora);
                textView3.setText("Saber");
                imageView3.setImageResource(R.drawable.saber);
                //73 Nana
            }else if(selectedName.equals("Nana")){
                textView.setText("Aurora");
                imageView.setImageResource(R.drawable.aurora);
                textView2.setText("Natalia");
                imageView2.setImageResource(R.drawable.natalia);
                textView3.setText("Fanny");
                imageView3.setImageResource(R.drawable.fanny);
                //74 Alice
            }else if(selectedName.equals("Alice")){
                textView.setText("Aurora");
                imageView.setImageResource(R.drawable.aurora);
                textView2.setText("Nana");
                imageView2.setImageResource(R.drawable.nana);
                textView3.setText("Layla");
                imageView3.setImageResource(R.drawable.layla);



            }
            //Set value
        }
    }
}