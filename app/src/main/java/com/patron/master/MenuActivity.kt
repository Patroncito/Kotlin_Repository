package com.patron.master

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.patron.master.firstapp.FirstAppActivity
import com.patron.master.imc.ImcActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val helloAppBtn = findViewById<Button>(R.id.helloApp)
        helloAppBtn.setOnClickListener{
            navigateToHelloApp()
        }

        val imcActivity = findViewById<Button>(R.id.findMy)

        imcActivity.setOnClickListener{

            navigateToIMCActivity()
        }

    }

    private fun navigateToHelloApp(){
        val intentHelloApp = Intent(this, FirstAppActivity::class.java)
        startActivity(intentHelloApp)
    }

    private fun navigateToIMCActivity(){
        val intentimcActivity = Intent(this, ImcActivity::class.java)
        startActivity(intentimcActivity)
    }
}