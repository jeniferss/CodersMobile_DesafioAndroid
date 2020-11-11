package com.example.myapplication.desafio_02_android.register

import android.content.Intent
import android.graphics.drawable.Drawable
import android.graphics.drawable.Icon
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.example.myapplication.desafio_02_android.R
import com.example.myapplication.desafio_02_android.home.HomeActivity
import com.example.myapplication.desafio_02_android.login.PROSSEGUIR_L
import com.google.android.material.textfield.TextInputEditText

const val ERRO_VAZIO = "CAMPO VAZIO"
const val ERRO_SENHA = "SENHAS NÃO CONFEREM"
var PROSSEGUIR = false

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        findViewById<Button>(R.id.btnRegister).setOnClickListener {

            val name = findViewById<TextInputEditText>(R.id.etName).text.toString()
            val email = findViewById<TextInputEditText>(R.id.etEmailRegister).text.toString()
            val senha = findViewById<TextInputEditText>(R.id.etPasswordRegister).text.toString()
            val senhaRepetir =
                findViewById<TextInputEditText>(R.id.etPasswordRepeat).text.toString()

            checarCampos(name, email, senha, senhaRepetir)

            if (PROSSEGUIR) {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                PROSSEGUIR = false
                clear()
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    private fun checarCampos(name: String, email: String, senha: String, senhaRepetir: String) {

        if (name.trim().isEmpty()) {
            findViewById<TextInputEditText>(R.id.etName).error = ERRO_VAZIO
            PROSSEGUIR = false
        } else if (email.trim().isEmpty()) {
            findViewById<TextInputEditText>(R.id.etEmailRegister).error = ERRO_VAZIO
            PROSSEGUIR = false
        } else if (senha.trim().isEmpty()) {
            findViewById<TextInputEditText>(R.id.etPasswordRegister).error = ERRO_VAZIO
            PROSSEGUIR = false
        } else if (senhaRepetir.trim().isEmpty()) {
            findViewById<TextInputEditText>(R.id.etPasswordRepeat).error = ERRO_VAZIO
            PROSSEGUIR = false
        } else if (senha != senhaRepetir) {
            Toast.makeText(this@RegisterActivity, ERRO_SENHA, Toast.LENGTH_SHORT).show()
            PROSSEGUIR = false
        } else PROSSEGUIR = true
    }

    private fun clear() {
        findViewById<TextInputEditText>(R.id.etName).text!!.clear()
        findViewById<TextInputEditText>(R.id.etEmailRegister).text!!.clear()
        findViewById<TextInputEditText>(R.id.etPasswordRegister).text!!.clear()
        findViewById<TextInputEditText>(R.id.etPasswordRepeat).text!!.clear()
    }


}

