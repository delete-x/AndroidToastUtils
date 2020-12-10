package com.zz.toastutils.style;

import android.content.Context;
import android.util.TypedValue;
import android.view.Gravity;

import com.zz.toastutils.IToastStyle;

public abstract class BaseToastStyle implements IToastStyle {

    private Context mContext;

    public BaseToastStyle(Context context) {
        mContext = context;
    }

    @Override
    public int getGravity() {
        return Gravity.CENTER;
    }

    @Override
    public int getXOffset() {
        return 0;
    }

    @Override
    public int getYOffset() {
        return 0;
    }

    @Override
    public int getZ() {
        return 30;
    }

    @Override
    public int getMaxLines() {
        return 5;
    }

    @Override
    public int getPaddingEnd() {
        return getPaddingStart();
    }

    @Override
    public int getPaddingBottom() {
        return getPaddingTop();
    }

    /**
     * dp转px
     */
    protected int dp2px(float dpValue) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpValue, mContext.getResources().getDisplayMetrics());
    }

    /**
     * sp转px
     */
    protected int sp2px(float spValue) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, spValue, mContext.getResources().getDisplayMetrics());
    }
}
