package com.example.moneybreaker.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moneybreaker.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setupButtons()
    }

    /**
     * this method bind all ui buttons to the functionality methods
     */
    private fun setupButtons() {
        loginButton.setOnClickListener { login() }
    }

    /**
     * this method check if the user access exist and do the login of the user
     */
    private fun login() {
        startActivity(Intent(this@LoginActivity, MainActivity::class.java))

    }
}
