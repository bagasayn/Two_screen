package com.example.two_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_next.*

class NextActivity : AppCompatActivity() {
    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        showCount()
    }

    private fun showCount() {
        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        count_text_view.text = count.toString()
    }

    fun backActivity() {
        var count = intent.getIntExtra(TOTAL_COUNT, 0)
        val screenIntent = Intent(
            this,
            NextActivity::class.java
        )
        count--
        screenIntent.putExtra(TOTAL_COUNT, count)

        startActivity(screenIntent)
    }
}
