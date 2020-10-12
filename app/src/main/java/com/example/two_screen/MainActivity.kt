package com.example.two_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import layout.AboutActivity


class MainActivity : AppCompatActivity() {
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showCount()
    }

    fun nextActivity(view: View) {
        val screenIntent = Intent(this, NextActivity::class.java)
            .putExtra(NextActivity.TOTAL_COUNT, count)
        count++
        startActivity(screenIntent)
    }

    private fun showCount() {
        val count = intent.getIntExtra(NextActivity.TOTAL_COUNT, 0)
        count_next_activity_text_view.text = count.toString()
    }

    fun aboutActivity(view: View) {
        val aboutIntent = Intent(this, AboutActivity::class.java)
        startActivity(aboutIntent)

    }

}