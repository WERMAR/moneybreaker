package com.example.moneybreaker.activities

import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
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
        registrationButton.setOnClickListener { registration() }
    }

    /**
     * this method check if the user access exist and do the login of the user
     */
    private fun login() {
        startActivity(Intent(this@LoginActivity, MainActivity::class.java))

    }

    private fun registration() {
        val vibrator : Vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            vibrator.vibrate(VibrationEffect.createOneShot(150, VibrationEffect.DEFAULT_AMPLITUDE))
        } else {
            vibrator.vibrate(150)
        }
        startActivity(Intent(this@LoginActivity, RegistrationActivity::class.java))
    }
}
