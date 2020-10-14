package com.example.two_screen


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.two_screen.DataCount.Companion.TOTAL_COUNT
import kotlinx.android.synthetic.main.activity_next.*


class NextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        showCount()
    }

    fun backActivity(view: View) {
        dataCount.count--
        val bundle = Bundle()
        bundle.putInt(TOTAL_COUNT, dataCount.count)
        val intent =
            Intent(view.context, MainActivity::class.java)
                .putExtras(bundle)
        startActivity(intent)
    }

    private fun showCount() {
        val bundle = intent.extras
        count_text_view.text =
            bundle!!.getInt(TOTAL_COUNT, 0)
                .toString()
    }
}
