package com.example.two_screen



import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem

import android.view.View
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_about.*


class AboutActivity : AppCompatActivity() {
    private val tag = "LOG"
    private val key = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_about)
    }


    fun onClick(view: View) {
        if (key) Log.d(tag, "по Id определяем нажатую кнопку")
        when (view.id) {
            R.id.about_button_ok -> {
                about_activity_text_view.text = getString(R.string.about_button_ok)
                if (key) Log.d(tag, "Нажата кнопка OK")
                Toast.makeText(this, "Нажата кнопка OK", Toast.LENGTH_SHORT).show()
            }
            R.id.about_button_cancel -> {
                about_activity_text_view.text = getString(R.string.about_button_cancel)
                if (key) Log.d(tag, "Нажата кнопка Cancel")
                Toast.makeText(this, "Нажата кнопка Cancel", Toast.LENGTH_SHORT).show()
            }

        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menu.add("menu1")
        menu.add("menu2")
        menu.add("menu3")
        menu.add("menu4")
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
        return super.onOptionsItemSelected(item)
    }
}


