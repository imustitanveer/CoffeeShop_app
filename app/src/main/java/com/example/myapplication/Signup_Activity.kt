package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.facebook.FacebookSdk
import com.facebook.appevents.AppEventsLogger
import com.facebook.login.widget.LoginButton


class Signup_Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Initialize Facebook SDK
        FacebookSdk.sdkInitialize(applicationContext)
        AppEventsLogger.activateApp(this)
        setContentView(R.layout.signup_activity)


        // Find the TextView in your layout
        val fbLoginButtonTextView = findViewById<TextView>(R.id.fbloginbutton)
        val loginpageButton = findViewById<TextView>(R.id.clickhere)

        // Set a click listener on the TextView to initiate Facebook login
        fbLoginButtonTextView.setOnClickListener {
            // Create a Facebook login button click event
            val loginButton = LoginButton(this)
            loginButton.performClick()
        }

        loginpageButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)

            startActivity(intent)

        }
    }
}

private fun AppEventsLogger.Companion.activateApp(application: Signup_Activity) {

}
