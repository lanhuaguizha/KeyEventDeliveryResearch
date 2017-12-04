package com.example.paultao.keyeventresearch;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.FrameLayout;

/**
 * Created by paultao on 2017/11/30.
 */

public class ViewGroupSub extends FrameLayout {

    private static final String TAG = ViewGroupSub.class.getSimpleName();

    public ViewGroupSub(@NonNull Context context) {
        super(context);
    }

    public ViewGroupSub(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewGroupSub(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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

