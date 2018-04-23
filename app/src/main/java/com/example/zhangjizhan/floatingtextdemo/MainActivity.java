package com.example.zhangjizhan.floatingtextdemo;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvFloat = findViewById(R.id.tv_float);
        tvFloat.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

//        Log.i("test", "点击了");

        ObjectAnimator animator = ObjectAnimator.ofFloat(v, "translationY", 0f, 200f);
        animator.setDuration(2000);
        animator.setInterpolator(new MyFloatInterpolator());
        animator.setRepeatMode(ValueAnimator.RESTART);
        animator.setRepeatCount(Integer.MAX_VALUE);
        animator.start();

    }
}
