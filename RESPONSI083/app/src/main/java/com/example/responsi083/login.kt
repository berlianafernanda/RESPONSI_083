package com.example.responsi083

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.login.*

class login : AppCompatActivity(){
    override fun onCreate (savedIstanceState: Bundle?){
        super.onCreate (savedInstanceState)
        setContentView(R.layout.login)

        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)

        btnLogin.setOnClickListener(){
        if (username.text.toString()== "berlin" && password.text.toString()=="220299"){
            intent = Intent( this, login:: class.java)
            startActivity(intent)
        }else{
            Toast.makeText(applicationContext, "Username dan Password Anda Salah", Toast.LENGTH_LONG).show()
        }
        }
        btnRegister.setOnClickListener(){
        intent = Intent (this, register:: class.java)
        startActivity(intent)}
    })
}

