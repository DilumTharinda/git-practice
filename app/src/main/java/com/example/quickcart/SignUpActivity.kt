package com.example.quickcart

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {

    private lateinit var etName: EditText
    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText
    private lateinit var tvNameError: TextView
    private lateinit var tvEmailError: TextView
    private lateinit var tvPasswordError: TextView
    private lateinit var btnCreateAccount: Button
    private lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        etName = findViewById(R.id.etName)
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        tvNameError = findViewById(R.id.tvNameError)
        tvEmailError = findViewById(R.id.tvEmailError)
        tvPasswordError = findViewById(R.id.tvPasswordError)
        btnCreateAccount = findViewById(R.id.btnCreateAccount)
        progressBar = findViewById(R.id.progressBar)

        btnCreateAccount.setOnClickListener {
            val nameValid = etName.text.toString().isNotBlank()
            val emailValid = Patterns.EMAIL_ADDRESS.matcher(etEmail.text.toString()).matches()
            val passwordValid = etPassword.text.toString().length >= 6

            tvNameError.visibility = if (nameValid) View.GONE else View.VISIBLE
            tvEmailError.visibility = if (emailValid) View.GONE else View.VISIBLE
            tvPasswordError.visibility = if (passwordValid) View.GONE else View.VISIBLE

            if (nameValid && emailValid && passwordValid) {
                showLoading(true)
                Handler(Looper.getMainLooper()).postDelayed({
                    showLoading(false)
                    startActivity(Intent(this, SettingsActivity::class.java))
                }, 1000)
            }
        }
    }

    private fun showLoading(loading: Boolean) {
        progressBar.visibility = if (loading) View.VISIBLE else View.GONE
        btnCreateAccount.isEnabled = !loading
        btnCreateAccount.text = if (loading) "Creating..." else "Create Account"
    }
}