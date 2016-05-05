package com.uniquedu.myglide;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.imageview_jpg)
    ImageView imageviewJpg;
    @InjectView(R.id.imageview_webp)
    ImageView imageviewWebp;
    @InjectView(R.id.imageview_gif)
    ImageView imageviewGif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        Glide.with(this)
                .load(Uri.parse("https://www.gstatic.com/webp/gallery/1.sm.jpg"))
                .asBitmap()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.mipmap.ic_launcher)
                .centerCrop()
                .into(imageviewJpg);
        Glide.with(this)
                .load(Uri.parse("https://www.gstatic.com/webp/gallery/2.sm.webp"))
                .centerCrop()
                .placeholder(R.mipmap.ic_launcher)
                .into(imageviewWebp);
        Glide.with(this)
                .load(Uri.parse("https://s3.amazonaws.com/giphygifs/media/4aBQ9oNjgEQ2k/giphy.gif"))
                .asGif()
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .centerCrop()
                .placeholder(R.mipmap.ic_launcher)
                .into(imageviewGif);
    }
}
