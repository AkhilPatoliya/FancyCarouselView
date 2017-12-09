package com.akhil.courselview.ui.transformer;

import android.view.View;

import com.akhil.courselview.ui.manager.CarouselLayoutManager;
import com.akhil.courselview.ui.widget.CarouselView;


public final class ImmutableTransformer implements CarouselView.ViewTransformer {
    private CarouselView.ViewTransformer mTransformer;

    public ImmutableTransformer(CarouselView.ViewTransformer transformer) {
        mTransformer = transformer;
    }

    @Override
    public final void onAttach(CarouselLayoutManager layoutManager) {
        mTransformer.onAttach(layoutManager);
    }

    @Override
    public final void transform(View view, float position) {
        mTransformer.transform(view, position);
    }
}
