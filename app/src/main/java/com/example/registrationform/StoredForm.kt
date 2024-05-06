package com.example.registrationform

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class StoredForm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registered_form)
        val email = intent.getStringExtra("email")
        val phoneNumber = intent.getStringExtra("phoneNumber")
        val named = intent.getStringExtra("Name")
        val name_of_person   = findViewById<TextView>(R.id.name)
        val phoneNo   = findViewById<TextView>(R.id.PhoneNo)
        val emails   = findViewById<TextView>(R.id.Email)
        name_of_person?.let {
            it.text = it.text.toString() + " " +named
        }
        phoneNo?.let {
            it.text = it.text.toString() + " " +phoneNumber
        }
        emails?.let {
            it.text = it.text.toString() + " " +email
        }

    }
}