package com.example.myapplication.desafio_02_android.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.desafio_02_android.R
import com.example.myapplication.desafio_02_android.register.RegisterActivity
import com.example.myapplication.desafio_02_android.home.HomeActivity
import com.example.myapplication.desafio_02_android.menu.MenuActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnRegisterLogin).setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnLogin).setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}