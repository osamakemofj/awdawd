package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnA.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        btnQ.setOnClickListener {
            val intent = Intent(this, MainActivityQ::class.java)
            startActivity(intent)
        }

        btnV.setOnClickListener {
            val intent = Intent(this, MainActivityV::class.java)
            startActivity(intent)
        }

    }
}
