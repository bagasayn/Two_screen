package com.example.two_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_next.*


class MainActivity : AppCompatActivity() {
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun nextActivity(view: View) {
        val screenIntent = Intent(
            this,
            NextActivity::class.java
        )
        count++
        screenIntent.putExtra(NextActivity.TOTAL_COUNT, count)

        startActivity(screenIntent)
    }

}