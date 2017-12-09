package com.akhil.courselview.ui.transformer;

import android.view.View;

import com.akhil.courselview.ui.manager.CarouselLayoutManager;
import com.akhil.courselview.ui.widget.CarouselView;


public class InverseTimeMachineViewTransformer implements CarouselView.ViewTransformer {
    protected static final float translationXRate = (1) * 0.5f;

    @Override
    public void onAttach(CarouselLayoutManager layoutManager) {
        layoutManager.setDrawOrder(CarouselView.DrawOrder.FirstFront);
    }

    @Override
    public void transform(View view, float position) {
        int width = view.getMeasuredWidth(), height = view.getMeasuredHeight();
        view.setTranslationX(width * position * translationXRate * (2f / (Math.abs(position) + 2)));
        view.setScaleX(2f / (position + 2));
        view.setScaleY(2f / (position + 2));
        view.setAlpha(position < 0 ? Math.max(1 + position, 0) : 1);
    }
}
