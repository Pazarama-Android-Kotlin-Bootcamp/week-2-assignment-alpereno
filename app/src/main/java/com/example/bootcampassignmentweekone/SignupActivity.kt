package com.example.bootcampassignmentweekone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
    }

    fun previousPage(view: View){
        val intent = Intent(applicationContext, LoginActivity::class.java)
        startActivity(intent)
    }
}