package com.example.arnassmicius.lottieapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btLoading.setOnClickListener { setLoadingAnimation() }
        btSuccess.setOnClickListener { setSuccessAnimation() }
        btFail.setOnClickListener { setFailAnimation() }
    }

    private fun setLoadingAnimation() {
        animationView.setMaxFrame(239)
        animationView.loop(true)
        animationView.playAnimation()
    }

    private fun setSuccessAnimation() {
        animationView.setMaxFrame(418)
        animationView.loop(false)
    }

    private fun setFailAnimation() {
        animationView.setMinFrame(500)
    }
}
