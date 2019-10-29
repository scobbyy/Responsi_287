package com.example.responsi_287

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_register.name

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btn_daftar.setOnClickListener {
            val username = name.text.toString()
            val mail = email.text.toString()
            val password = pass.text.toString()
            val alamat = alamatkita.text.toString()
            val hp = nohp.text.toString()

            val intent = Intent (this@Register, Preview::class.java)
            intent.putExtra("Nama", username)
            intent.putExtra("E-mail", mail)
            intent.putExtra("Password",password)
            intent.putExtra("Alamat",alamat)
            intent.putExtra("No.HP",hp)
        }
    }
}
