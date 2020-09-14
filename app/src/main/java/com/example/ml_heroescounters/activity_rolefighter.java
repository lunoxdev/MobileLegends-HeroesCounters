package com.example.ml_heroescounters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class activity_rolefighter extends AppCompatActivity {


    GridView gridView;

    String[] names = {"Yu Zhong","Silvanna","Masha","Dyrroth","X Borg","Terizla","Guinevere","Badang","Minsitthar","Thamuz","Leomord","Aldous","Kaja","Martis","Jawhead","Argus","Roger","Lapu-Lapu","Hilda","Alpha","Sun","Chou","Freya","Zilong","Bane","Alucard","Balmond"};
    int[] images = {R.drawable.yuzhong,R.drawable.silvanna,R.drawable.masha,R.drawable.dyrroth,R.drawable.xborg,R.drawable.terizla,R.drawable.guinevere,R.drawable.badang,R.drawable.minsitthar,R.drawable.thamuz,R.drawable.leomord,R.drawable.aldous,R.drawable.kaja,R.drawable.martis,R.drawable.jawhead,R.drawable.argus,R.drawable.roger,R.drawable.lapulapu,R.drawable.hilda,R.drawable.alpha,R.drawable.sun,R.drawable.chou,R.drawable.freya,R.drawable.zilong,R.drawable.bane,R.drawable.alucard,R.drawable.balmond};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rolefighter);

        //Turn on back button on actionbar before activate in Androidmanifest.xml
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Show activity name
        ((TextView) findViewById(R.id.main_toolbar_title)).setText("\n" +
                "Which Hero do you want to counter?");


        //Call GridView id
        gridView = findViewById(R.id.gridView);

        activity_rolefighter.CustomAdapter customAdapter = new CustomAdapter(names,images,this);

        gridView.setAdapter(customAdapter);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Here is where I change heroe counter information
                String selectedName = names[i];
                int selectedImage = images[i];

                startActivity(new Intent(activity_rolefighter.this,activity_heroe_selected.class).putExtra("name",selectedName).putExtra("image",selectedImage));

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