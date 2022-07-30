package com.example.ant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
        val message = intent.getStringExtra("com.example.ant.MESSAGE")
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }
    }
}
