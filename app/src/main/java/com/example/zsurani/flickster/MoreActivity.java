package com.example.zsurani.flickster;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MoreActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);

        String background = getIntent().getStringExtra("backgroundIM");
        ImageView tvBackdrop = (ImageView) findViewById(R.id.backdrop);
        Picasso.with(this).load(background).into(tvBackdrop);

        String overview = getIntent().getStringExtra("summary");
        TextView tvOverview = (TextView) findViewById(R.id.overviewInfo);
        tvOverview.setText(overview);

        String popularity = getIntent().getStringExtra("popularity");
        TextView tvPopularity = (TextView) findViewById(R.id.popularityText);
        tvPopularity.setText(popularity);

        String title = getIntent().getStringExtra("title");
        TextView tvTitle = (TextView) findViewById(R.id.title);
        //Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Chantelli_Antiqua.ttf");
        //tvTitle.setTypeface(font);

        tvTitle.setText(title);
    }
}