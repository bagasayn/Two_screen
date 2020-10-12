package com.example.two_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.LogPrinter
import android.view.View
import kotlinx.android.synthetic.main.activity_next.*

class NextActivity : AppCompatActivity() {
    companion object {
        const val TOTAL_COUNT = "total_count"
    }
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        showCount()
    }

    private fun showCount() {
        count = intent.getIntExtra(TOTAL_COUNT, 0)

        count_text_view.text = count.toString()
    }

    fun backActivity(view: View) {
        count--
        val screenIntent = Intent(this,MainActivity::class.java).putExtra(TOTAL_COUNT,count)
        startActivity(screenIntent)

    }

}
