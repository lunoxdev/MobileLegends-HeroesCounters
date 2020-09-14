package com.example.ml_heroescounters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class activity_rolemage extends AppCompatActivity {


    GridView gridView;

    String[] names = {"Luo Yi","Cecilion","Lylia","Esmeralda","Kadita","Harith","Lunox","Vale","Change","Valir","Pharsa","Zhask","Odette","Harley","Vexana","Aurora","Cyclops","Kagura","Gord","Eudora","Nana","Alice"};
    int[] images = {R.drawable.luoyi,R.drawable.cecilion,R.drawable.lylia,R.drawable.esmeralda,R.drawable.kadita,R.drawable.harith,R.drawable.lunox,R.drawable.vale,R.drawable.change,R.drawable.valir,R.drawable.pharsa,R.drawable.zhask,R.drawable.odette,R.drawable.harley,R.drawable.vexana,R.drawable.aurora,R.drawable.cyclops,R.drawable.kagura,R.drawable.gord,R.drawable.eudora,R.drawable.nana,R.drawable.alice};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rolemage);

        //Turn on back button on actionbar before activate in Androidmanifest.xml
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Show activity name
        ((TextView) findViewById(R.id.main_toolbar_title)).setText("\n" +
                "Which Hero do you want to counter?");


        //Call GridView id
        gridView = findViewById(R.id.gridView);

        activity_rolemage.CustomAdapter customAdapter = new CustomAdapter(names,images,this);

        gridView.setAdapter(customAdapter);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Here is where I change heroe counter information
                String selectedName = names[i];
                int selectedImage = images[i];

                startActivity(new Intent(activity_rolemage.this,activity_heroe_selected.class).putExtra("name",selectedName).putExtra("image",selectedImage));

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