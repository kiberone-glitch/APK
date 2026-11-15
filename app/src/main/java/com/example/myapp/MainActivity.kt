package com.example.myapp

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var count = 0

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
        }

        val textView = TextView(this).apply {
            text = "Привет! Нажатий: 0"
            textSize = 22f
            gravity = Gravity.CENTER
        }

        val button = Button(this).apply {
            text = "Нажми меня"
            setOnClickListener {
                count++
                textView.text = "Привет! Нажатий: $count"
            }
        }

        layout.addView(textView)
        layout.addView(button)
        setContentView(layout)
    }
}
