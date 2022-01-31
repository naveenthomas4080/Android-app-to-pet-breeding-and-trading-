package com.example.naveenthomas.pets

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginbtn.setOnClickListener {
            val iintent = Intent(this,select::class.java)
            startActivity(iintent)
        }

        signupbtn.setOnClickListener {
            val signupintent=Intent(this,signup::class.java )
            startActivity(signupintent)
        }
    }
}
