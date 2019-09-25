package com.outerspace.peanutactivitytransitions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public static final String logo_animation_name = "logo_animation";
    public static final String text_animation_name = "text_animation";

    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = findViewById(R.id.android_logo);
    }

    public void onClickButtonNext(View view) {
        getWindow().setExitTransition(new android.transition.Slide());

        androidx.core.util.Pair p1 = androidx.core.util.Pair.create(logo, logo_animation_name);
        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, p1);
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent, options.toBundle());
    }
}
