package com.example.paultao.keyeventresearch;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;

/**
 * Created by paultao on 2017/11/30.
 */

public class View0 extends View {

    private static final String TAG = View0.class.getSimpleName();

    public View0(Context context) {
        super(context);
    }

    public View0(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public View0(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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
