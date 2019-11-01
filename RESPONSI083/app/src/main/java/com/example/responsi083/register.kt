package com.example.responsi083

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.register.*

class register : AppCompatActivity(){
    override fun onCreate (savedIstanceState: Bundle?){
        super.onCreate (savedInstanceState)
        setContentView(R.layout.register)

        val namadepan = findViewById<EditText>(R.id.namadepan)
        val namabelakang = findViewById<EditText>(R.id.namabelakang)
        val email = findViewById<EditText>(R.id.email)
        val username = findViewById<EditText>(R.id.rusername)
        val password = findViewById<EditText>(R.id.rpassword)

        Register.setOnClickListener(){

            val NamaDepan = namadepan.text.toString()
            val NamaBelakang = namabelakang.text.toString()
            val Email = email.text.toString()
            val Username =  rusername.text.toString()
            val Password = rpassword.text.toString()

            val intent = Intent (this, login::class.java)
            intent.putExtra("nama depan", NamaDepan)
            intent.putExtra("nama belakang", NamaBelakang)
            intent.putExtra("email", Email)
            intent.putExtra("username", Username)
            intent.putExtra("password", Password)
        }
    }

}