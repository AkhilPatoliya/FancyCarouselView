package com.akhil.courselview.ui.transformer;

public class LinearViewTransformer extends ParameterizableViewTransformer {
    public LinearViewTransformer() {
        setOffsetXPercent(1);
        setOffsetYPercent(0);
    }

    @Override
    public float getOffsetXPercent() {
        return super.getOffsetXPercent();
    }

    @Override
    public float getOffsetYPercent() {
        return super.getOffsetYPercent();
    }

    @Override
    public void setOffsetXPercent(float offsetXPercent) {
        super.setOffsetXPercent(offsetXPercent);
    }

    @Override
    public void setOffsetYPercent(float offsetYPercent) {
        super.setOffsetYPercent(offsetYPercent);
    }

    @Override
    public float getScaleXFactor() {
        return super.getScaleXFactor();
    }

    @Override
    public void setScaleXFactor(float scaleXFactor) {
        super.setScaleXFactor(scaleXFactor);
    }

    @Override
    public void setScaleYFactor(float scaleYFactor) {
        super.setScaleYFactor(scaleYFactor);
    }

    @Override
    public float getScaleYFactor() {
        return super.getScaleYFactor();
    }

    @Override
    public float getMaxScaleX() {
        return super.getMaxScaleX();
    }

    @Override
    public float getMaxScaleY() {
        return super.getMaxScaleY();
    }

    @Override
    public float getMinScaleX() {
        return super.getMinScaleX();
    }

    @Override
    public float getMinScaleY() {
        return super.getMinScaleY();
    }

    @Override
    public void setMaxScaleX(float maxScaleX) {
        super.setMaxScaleX(maxScaleX);
    }

    @Override
    public void setMaxScaleY(float maxScaleY) {
        super.setMaxScaleY(maxScaleY);
    }

    @Override
    public void setMinScaleX(float minScaleX) {
        super.setMinScaleX(minScaleX);
    }

    @Override
    public void setMinScaleY(float minScaleY) {
        super.setMinScaleY(minScaleY);
    }

    @Override
    public boolean isScaleLargestAtCenter() {
        return super.isScaleLargestAtCenter();
    }

    @Override
    public void setScaleLargestAtCenter(boolean scaleLargestAtCenter) {
        super.setScaleLargestAtCenter(scaleLargestAtCenter);
    }
}
