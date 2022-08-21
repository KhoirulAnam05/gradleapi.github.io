package com.example.attendanceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        onClick()
    }

    private fun onClick() {
        fabCheckin.setOnClickListener {
            loadScanLocation()
         Handler(Looper.getMainLooper()).postDelayed({
                                  stopScanLocation()
            },4000)
        }
    }

    private fun loadScanLocation() {
        rippleBackground.startRippleAnimation()
        tvScanning.visibility =View.VISIBLE
        tvCheckinsucces.visibility =View.GONE
    }

    private fun stopScanLocation() {
        rippleBackground.stopRippleAnimation()
        tvScanning.visibility =View.GONE
    }

}