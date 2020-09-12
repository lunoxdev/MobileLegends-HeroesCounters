package com.example.ml_heroescounters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class activity_role_tank extends AppCompatActivity {


    GridView gridView;

    String[] names = {"Baxia","Khufra","Belerick","Uranus","Hylos","Grock","Gatotkaca","Johnson","Ruby","Minotaur","Franco","Akai","Tigreal","Atlas"};
    int[] images = {R.drawable.baxia,R.drawable.khufra,R.drawable.belerick,R.drawable.uranus,R.drawable.hylos,R.drawable.grock,R.drawable.gatotkaca,R.drawable.johnson,R.drawable.ruby,R.drawable.minotaur,R.drawable.franco,R.drawable.akai,R.drawable.tigreal,R.drawable.atlas};
    //int[] imag = {R.drawable.baxia,R.drawable.atlas,R.drawable.khufra,R.drawable.belerick,R.drawable.uranus,R.drawable.hylos,R.drawable.grock,R.drawable.gatotkaca,R.drawable.johnson,R.drawable.ruby,R.drawable.minotaur,R.drawable.franco,R.drawable.akai,R.drawable.tigreal,R.drawable.atlas};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role_tank);

        //Turn on back button on actionbar before activate in Androidmanifest.xml
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Show activity name
        ((TextView) findViewById(R.id.main_toolbar_title)).setText("\n" +
                "Which Hero do you want to counter?");


        //Call GridView id
        gridView = findViewById(R.id.gridView);

        CustomAdapter customAdapter = new CustomAdapter(names,images,this);

        gridView.setAdapter(customAdapter);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Here is where I change heroe counter information
                String selectedName = names[i];
                int selectedImage = images[i];

                startActivity(new Intent(activity_role_tank.this,activity_heroe_selected.class).putExtra("name",selectedName).putExtra("image",selectedImage));

            }

        });
    }

    public class CustomAdapter extends BaseAdapter {
        private String[] imageNames;
        private int[] imagesPhoto;
        private Context context;
        private LayoutInflater layoutInflater;

        public CustomAdapter(String[] imageNames, int[] imagesPhoto, Context context) {
            this.imageNames = imageNames;
            this.imagesPhoto = imagesPhoto;
            this.context = context;
            this.layoutInflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return imagesPhoto.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            view = layoutInflater.inflate(R.layout.row_items, viewGroup, false);

            TextView tvName = view.findViewById(R.id.tvName);
            ImageView imageView = view.findViewById(R.id.imageView);

            tvName.setText(imageNames[i]);
            imageView.setImageResource(imagesPhoto[i]);

            return view;
        }
    }
}