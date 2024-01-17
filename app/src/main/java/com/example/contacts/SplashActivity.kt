package com.example.contacts

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler(mainLooper).postDelayed({
            startContactsActivity()
        },2000)

    }

    private fun startContactsActivity() {
        startActivity(Intent(this,ContactsActivity::class.java))
        finish()
    }
}