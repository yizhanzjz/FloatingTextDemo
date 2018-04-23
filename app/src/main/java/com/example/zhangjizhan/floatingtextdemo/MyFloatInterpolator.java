package com.example.zhangjizhan.floatingtextdemo;

import android.view.animation.Interpolator;

public class MyFloatInterpolator implements Interpolator {
    @Override
    public float getInterpolation(float input) {


//        return (float)(Math.cos((input + 1) * Math.PI) / 2.0f) + 0.5f;
        //(float)(Math.cos((input + 1) * Math.PI) / 2.0f) + 0.5f;
        return (float) (Math.cos((2 * input + 1) * Math.PI) / 2.0f) + 0.5f;
    }
}
