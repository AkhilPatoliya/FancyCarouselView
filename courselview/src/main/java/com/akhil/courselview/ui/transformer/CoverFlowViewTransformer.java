package com.akhil.courselview.ui.transformer;

import android.support.annotation.FloatRange;
import android.view.View;


public class CoverFlowViewTransformer extends ParameterizableViewTransformer {
    private double mYProjection = 60.0;

    public CoverFlowViewTransformer() {
        setOffsetXPercent(0.8f);
        setScaleYFactor(-0.2f);
    }

    @Override
    public void setOffsetXPercent(float offsetXPercent) {
        super.setOffsetXPercent(offsetXPercent);
    }

    @Override
    public float getOffsetXPercent() {
        return super.getOffsetXPercent();
    }

    @Override
    public float getScaleYFactor() {
        return super.getScaleYFactor();
    }

    @Override
    public void setScaleYFactor(float scaleYFactor) {
        super.setScaleYFactor(scaleYFactor);
    }

    public double getYProjection() {
        return mYProjection;
    }

    public void setYProjection(@FloatRange(from = 0.0, to = 90.0) double yProjectionDegree) {
        mYProjection = yProjectionDegree;
    }

    @Override
    public void transform(View view, float position) {
        int width = view.getMeasuredWidth(), height = view.getMeasuredHeight();
        view.setPivotX(width / 2.0f);
        view.setPivotY(height / 2.0f);
        view.setTranslationX(width * position * mOffsetXPercent);
        view.setRotationY(Math.signum(position) * (float)(Math.log(Math.abs(position) + 1) / Math.log(3) * - mYProjection));
        view.setScaleY(1 + mScaleYFactor * Math.abs(position));
    }
}
