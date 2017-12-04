package com.example.paultao.keyeventresearch;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/**
 * Created by paultao on 2017/11/30.
 */

public class ViewGroup extends LinearLayout {

    private static final String TAG = ViewGroup.class.getSimpleName();

    public ViewGroup(@NonNull Context context) {
        super(context);
    }

    public ViewGroup(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewGroup(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        Log.i(TAG, "onKeyUp: " + event.getAction());
        return super.onKeyUp(keyCode, event);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.i(TAG, "onKeyDown: " + event.getAction());
        return super.onKeyDown(keyCode, event);
    }
}
