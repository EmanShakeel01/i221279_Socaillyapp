package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import de.hdodenhof.circleimageview.CircleImageView

class homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homepage)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val homeNav = findViewById<ImageView>(R.id.nav_home)
        homeNav.setOnClickListener {
            val intent = Intent(this, homepage::class.java)
            startActivity(intent)
        }

        val likeNav = findViewById<ImageView>(R.id.nav_like)
        likeNav.setOnClickListener {
            val intent = Intent(this, activitypage::class.java)
            startActivity(intent)
        }
        val searchNav = findViewById<ImageView>(R.id.nav_search)
        searchNav.setOnClickListener {
            val intent = Intent(this, searchpage::class.java)
            startActivity(intent)
        }
        val profileNav = findViewById< CircleImageView>(R.id.nav_profile)
        profileNav.setOnClickListener {
            val intent = Intent(this, activityprofile::class.java)
            startActivity(intent)
        }
        val addpic = findViewById< ImageView>(R.id.add)
        addpic.setOnClickListener {
            val intent = Intent(this, selectpicture::class.java)
            startActivity(intent)
        }
        val camera= findViewById< ImageView>(R.id.camera1)
        camera.setOnClickListener {
            val intent = Intent(this, takepicture::class.java)
            startActivity(intent)
        }
        val mystory = findViewById<CircleImageView>(R.id.story1)
        mystory.setOnClickListener {
            val intent = Intent(this, storyviewer2::class.java)
            startActivity(intent)
        }
        val otherstory = findViewById<CircleImageView>(R.id.story2)
        otherstory.setOnClickListener {
            val intent = Intent(this, storyviewer::class.java)
            startActivity(intent)
        }
        val message = findViewById< ImageView>(R.id.message1)
        message.setOnClickListener {
            val intent = Intent(this, chatlist::class.java)
            startActivity(intent)
        }


    }
}