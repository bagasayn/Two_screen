package com.example.two_screen


import android.os.Bundle
import android.view.View

import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_about.*


class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_about)
    }


    fun onClick(view: View) {
        when (view.id) {
            R.id.about_button_ok -> about_activity_text_view.text =
                getString(R.string.about_button_ok)
            R.id.about_button_cancel -> about_activity_text_view.text =
                getString(R.string.about_button_cancel)
        }
    }
}