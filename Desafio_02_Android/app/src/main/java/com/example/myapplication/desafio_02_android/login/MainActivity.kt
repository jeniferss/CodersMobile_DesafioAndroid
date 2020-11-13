package com.example.myapplication.desafio_02_android.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.myapplication.desafio_02_android.R
import com.example.myapplication.desafio_02_android.register.RegisterActivity
import com.example.myapplication.desafio_02_android.home.HomeActivity
import com.example.myapplication.desafio_02_android.menu.MenuActivity
import com.example.myapplication.desafio_02_android.register.PROSSEGUIR
import com.google.android.material.textfield.TextInputEditText

const val ERRO_VAZIO = "CAMPO VAZIO"
var PROSSEGUIR_L = false

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnRegisterLogin).setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnLogin).setOnClickListener {

            val email = findViewById<TextInputEditText>(R.id.etEmail).text.toString()
            val senha = findViewById<TextInputEditText>(R.id.etPassword).text.toString()

            checarCampos(email, senha)

            if (PROSSEGUIR_L) {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                PROSSEGUIR_L = false
                clear()
            }
        }

    }

    private fun checarCampos(email: String, senha: String) {

        if (email.trim().isEmpty()) {
            findViewById<TextInputEditText>(R.id.etEmail).error = ERRO_VAZIO
            PROSSEGUIR_L = false
        } else if (senha.trim().isEmpty()) {
            findViewById<TextInputEditText>(R.id.etPassword).error = ERRO_VAZIO
            PROSSEGUIR_L = false
        } else PROSSEGUIR_L = true

    }

    private fun clear() {
        findViewById<TextInputEditText>(R.id.etEmail).text!!.clear()
        findViewById<TextInputEditText>(R.id.etPassword).text!!.clear()

    }

}