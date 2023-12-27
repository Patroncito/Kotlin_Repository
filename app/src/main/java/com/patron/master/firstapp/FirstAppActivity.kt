package com.patron.master.firstapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.patron.master.R
import android.content.Intent

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        val btnOne = findViewById<AppCompatButton>(R.id.buttonOne)
        val editTextName = findViewById<AppCompatEditText>(R.id.etName)

        btnOne.setOnClickListener{
            val name = editTextName.text.toString()

            if (name.isNotEmpty()) {

                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)

            }


        }

    }
}