package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class storyviewer1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_storyviewer1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val click = findViewById<ImageButton>(R.id.nextBtn)
        click.setOnClickListener {
            val intent = Intent(this, homepage::class.java)
            startActivity(intent)
        }
        val cross = findViewById< ImageView>(R.id.back)
        cross.setOnClickListener {
            val intent = Intent(this, takepicture::class.java)
            startActivity(intent)
        }
    }
}