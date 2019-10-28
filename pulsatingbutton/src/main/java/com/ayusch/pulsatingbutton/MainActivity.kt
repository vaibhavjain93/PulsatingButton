package com.ayusch.pulsatingbutton

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        stop.setOnClickListener {
            pulsating_button.stopAnimation()
        }
        pulsating_button.startAnimation()
    }
}
