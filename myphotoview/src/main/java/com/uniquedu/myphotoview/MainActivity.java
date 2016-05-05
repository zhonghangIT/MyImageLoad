package com.uniquedu.myphotoview;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.bm.library.PhotoView;
import com.bumptech.glide.Glide;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.img)
    PhotoView img;
    @InjectView(R.id.button_load)
    Button buttonLoad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        img.enable();
    }

    @OnClick(R.id.button_load)
    public void onClick() {
        Glide.with(this).load(Uri.parse("http://www.52ij.com/uploads/allimg/160317/1110104P8-4.jpg")).into(img);
    }
}
