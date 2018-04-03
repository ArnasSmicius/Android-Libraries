package com.example.arnassmicius.slideupapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.sothree.slidinguppanel.SlidingUpPanelLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.view_slide_up.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener {
            when (slide_bar.panelState) {
                SlidingUpPanelLayout.PanelState.EXPANDED -> slide_bar.panelState = SlidingUpPanelLayout.PanelState.COLLAPSED
                SlidingUpPanelLayout.PanelState.COLLAPSED -> slide_bar.panelState = SlidingUpPanelLayout.PanelState.EXPANDED
            }

        }
    }

}
