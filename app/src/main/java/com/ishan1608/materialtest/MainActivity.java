package com.ishan1608.materialtest;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Explode;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // inside your activity (if you did not enable transitions in your theme)
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);

        // set an exit transition
        getWindow().setExitTransition(new Explode());
        setContentView(R.layout.activity_main);

        // Getting handle
        ImageView smallImageView1 = (ImageView) findViewById(R.id.small_imageView_1);
        if (smallImageView1 != null) {
            smallImageView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent largeImagesIntent = new Intent(MainActivity.this, LargeImage.class);
                    startActivity(largeImagesIntent, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
                }
            });
        }
    }

}
