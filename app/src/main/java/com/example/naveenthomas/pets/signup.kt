package com.example.naveenthomas.pets

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_signup.*

class signup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        btnnext.setOnClickListener {
            val nextintent = Intent(this,pets::class.java)
            startActivity(nextintent)
        }
    }
}
