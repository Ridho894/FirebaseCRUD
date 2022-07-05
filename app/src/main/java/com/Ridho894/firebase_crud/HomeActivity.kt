package com.Ridho894.firebase_crud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val btnLogin = findViewById(R.id.addBtn) as Button

        btnLogin.setOnClickListener {
            startActivity(Intent(this, CreateActivity::class.java))
        }
    }
}