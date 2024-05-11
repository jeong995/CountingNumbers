package com.example.countingnumbers

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val plusButton = findViewById<Button>(R.id.plusButton)
        val clearButton = findViewById<Button>(R.id.clearButton)
        val plusTextView = findViewById<TextView>(R.id.plusTextView)

        var number = 0
        plusButton.setOnClickListener {
            plusTextView.text = number.toString()
            number += 1
        }
        clearButton.setOnClickListener {
            plusTextView.text = number.toString()
            number = 0
        }
    }
}