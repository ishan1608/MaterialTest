package com.ishan1608.materialtest;

import android.app.Activity;
import android.os.Bundle;
import android.transition.ChangeImageTransform;
import android.view.Window;


public class SingleImage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // inside your activity (if you did not enable transitions in your theme)
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);

        // set an enter transition
        getWindow().setEnterTransition(new ChangeImageTransform());

        // Start enter transition as soon as possible
        getWindow().setAllowEnterTransitionOverlap(true);

        setContentView(R.layout.activity_single_image);
    }

}
