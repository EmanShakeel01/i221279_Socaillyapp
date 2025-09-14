package com.emanshakeel.i221279

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.assignment1.R

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)
        Log.d("ActivityStack", "signup onCreate")

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.signup)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 👇 Handle back icon click
        val backBtn = findViewById<ImageView>(R.id.back)
        backBtn.setOnClickListener {
            onBackPressedDispatcher.onBackPressed() // goes back to MainActivity

        }

        val acc = findViewById<android.widget.Button>(R.id.createacc)
        acc.setOnClickListener {
          //  Toast.makeText(this, "Signup !", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, login2::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()

        }
    }
    override fun onBackPressed() {
        super.onBackPressed() // default behavior
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActivityStack", "signup onDestroy")
    }

}
