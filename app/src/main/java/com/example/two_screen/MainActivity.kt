package com.example.two_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_next.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun nextActivity(view: View){
        val screenIntent = Intent(
            this,
            NextActivity::class.java
        )
        val countString = count_text_view.text.toString()

        val count = Integer.parseInt(countString)

        screenIntent.putExtra(NextActivity.TOTAL_COUNT,count)

        startActivity(screenIntent)
    }
}