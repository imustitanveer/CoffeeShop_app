package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.Intent
import android.view.View
import android.widget.Button

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)


        val loginButton = findViewById<Button>(R.id.btnloginpage)
        loginButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)

            startActivity(intent)

        }

        val signupButton = findViewById<Button>(R.id.btnregisterpage)
        signupButton.setOnClickListener {
            val intent = Intent(this, Signup_Activity::class.java)

            startActivity(intent)

        }

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION

        }

}