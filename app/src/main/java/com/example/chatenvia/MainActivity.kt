package com.example.chatenvia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSend = findViewById<ImageView>(R.id.iconSend)
        btnSend.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Enviando...", Toast.LENGTH_SHORT).show();
        })

        val btnBack = findViewById<View>(R.id.back)
        btnBack.setOnClickListener (View.OnClickListener {
            Toast.makeText(this, "Volviendo...", Toast.LENGTH_SHORT).show();
            finish();
        })
    }
}