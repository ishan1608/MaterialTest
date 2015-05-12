package com.ishan1608.materialtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Getting handle
        ImageView smallImageView1 = (ImageView) findViewById(R.id.small_imageView_1);
        if (smallImageView1 != null) {
            smallImageView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent largeImagesIntent = new Intent(MainActivity.this, LargeImage.class);
                    startActivity(largeImagesIntent);
                }
            });
        }
    }

}
