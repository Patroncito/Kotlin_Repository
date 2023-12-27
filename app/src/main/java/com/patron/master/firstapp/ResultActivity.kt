package com.patron.master.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.patron.master.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

            val tvScreen2 = findViewById<TextView>(R.id.tvScreen2)
            val name : String    = intent.extras?.getString("EXTRA_NAME").orEmpty()

            tvScreen2.text = "Hola $name"

    }
}