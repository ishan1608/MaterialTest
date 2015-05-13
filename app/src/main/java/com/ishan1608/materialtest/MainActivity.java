package com.ishan1608.materialtest;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.transition.ChangeImageTransform;
import android.transition.Explode;
import android.transition.Fade;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // inside your activity (if you did not enable transitions in your theme)
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);

        setContentView(R.layout.activity_main);

        final Intent largeImagesIntent = new Intent(MainActivity.this, LargeImage.class);

        // Explode transition
        final ImageView smallImageView1 = (ImageView) findViewById(R.id.small_imageView_1);
        if (smallImageView1 != null) {
            smallImageView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // set an exit transition
                    getWindow().setExitTransition(new Explode());

                    startActivity(largeImagesIntent, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
                }
            });
        }

        // Shared element transition
        final ImageView smallImageView2 = (ImageView) findViewById(R.id.small_imageView_2);
        if (smallImageView2 != null) {
            smallImageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // set an exit transition
                    getWindow().setExitTransition(new ChangeImageTransform());

                    Intent singeImageIntent = new Intent(MainActivity.this, SingleImage.class);

                    // create the transition animation - the images in the layouts
                    // of both activities are defined with android:transitionName="image2"
                    ActivityOptions options = ActivityOptions
                            .makeSceneTransitionAnimation(MainActivity.this, smallImageView2, "image2");
                    startActivity(singeImageIntent, options.toBundle());
                }
            });
        }
        
    }

}
