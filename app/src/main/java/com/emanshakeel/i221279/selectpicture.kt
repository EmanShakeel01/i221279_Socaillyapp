package com.emanshakeel.i221279

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.assignment1.R

class selectpicture : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_selectpicture)
        Log.d("ActivityStack", "selectpicture onCreate")

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val nextBtn = findViewById<TextView>(R.id.next)
        nextBtn.setOnClickListener {
            // Finish current activity to go back to the previous one
            finish()
        }
        val cancelBtn = findViewById<TextView>(R.id.cancelText)
        cancelBtn.setOnClickListener {
            finish()
        }

    }

    override fun onBackPressed() {
        super.onBackPressed() // default back behavior
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActivityStack", "selectpicture onDestroy")
    }
}