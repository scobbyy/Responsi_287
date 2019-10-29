package com.example.responsi_287

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        preview.setOnClickListener {
            val username = name.text.toString()
            val password = pass.text.toString()
            if (username.isEmpty() || password.isEmpty()){
                Toast.makeText(this , "Please insert Username and Password",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (username == "ahmadabdilah10@gmail.com" || password == "5170411287" ){
                val intent = Intent (this , MainActivity::class.java)
                startActivity(intent)
            }
        }

        txt_buat.setOnClickListener(){
            val intent = Intent( this, Register::class.java)
            startActivity(intent)
        }
    }
}
