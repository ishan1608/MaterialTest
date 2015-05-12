package com.ishan1608.materialtest;

import android.app.Activity;
import android.os.Bundle;
import android.transition.Explode;
import android.view.Window;


public class LargeImage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // inside your activity (if you did not enable transitions in your theme)
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);

        // set an enter transition
        getWindow().setEnterTransition(new Explode());

        // Start enter transition as soon as possible
        getWindow().setAllowEnterTransitionOverlap(true);

        setContentView(R.layout.activity_large_image);
    }

}
