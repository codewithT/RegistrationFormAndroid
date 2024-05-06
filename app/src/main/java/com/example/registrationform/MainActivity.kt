package com.example.registrationform

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val emailInput = findViewById<EditText>(R.id.emailEditText)
        val phoneNumberInput = findViewById<EditText>(R.id.phoneEditText)
        val name = findViewById<EditText>(R.id.nameEditText)
        // Get reference to login button
        val registerButton = findViewById<Button>(R.id.registerButton)

        registerButton.setOnClickListener {
            // Extract email and phone number from inputs
            val email = emailInput.text?.trim().toString()
            val phoneNumber = phoneNumberInput.text?.trim().toString()
            val nam  = name.text?.trim().toString()

            // Create intent to launch HomeActivity
            val intent = Intent(this@MainActivity, StoredForm::class.java)

            // Add email and phone number as extras
            intent.putExtra("email", email)
            intent.putExtra("phoneNumber", phoneNumber)
            intent.putExtra("Name", nam)

            // Start HomeActivity and finish MainActivity
            startActivity(intent)
            finish()
        }

    }
}