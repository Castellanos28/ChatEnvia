package com.example.chatenvia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val nextPag = findViewById<Button>(R.id.textView)
        nextPag.setOnClickListener(View.OnClickListener {
            val intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        })
    }
}