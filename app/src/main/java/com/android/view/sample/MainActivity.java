package com.android.view.sample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private MarqueeView marqueeView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paomadeng);
        marqueeView = (MarqueeView) findViewById(R.id.marquee_view);
        initMarqueeView();
    }

    private void initMarqueeView() {
        ImageView iv1 = new ImageView(this);
        iv1.setImageResource(R.drawable.ic_action_search);
        marqueeView.addViewInQueue(iv1);
        ImageView iv2 = new ImageView(this);
        iv2.setImageResource(R.drawable.ic_launcher);
        marqueeView.addViewInQueue(iv2);
        marqueeView.setScrollSpeed(20);
        marqueeView.setScrollDirection(MarqueeView.RIGHT_TO_LEFT);
        marqueeView.setViewMargin(15);
        marqueeView.startScroll();
    }
}
