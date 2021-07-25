package com.steve.androidtesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.steve.androidtesting.databinding.ActivityMainBinding
import com.steve.androidtesting.util.RegistrationUtil

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerBtn.setOnClickListener {
            val username = binding.name.text.toString().trim()
            val password = binding.registerEmail.text.toString().trim()
            val confirmPassword = binding.registerPassword.text.toString()

            if (username.isBlank()){
                binding.name.error="enter name"
                return@setOnClickListener
            }
            if (password.isBlank()){
                binding.registerEmail.error="enter your email"
                return@setOnClickListener
            }
            if (confirmPassword.isBlank()){
                binding.registerPassword.error="Enter your password"
                return@setOnClickListener
            }
            val userRegistration = RegistrationUtil.validateUser(username, password, confirmPassword)
            if (userRegistration) {
                username.isNullOrBlank()
                password.isNullOrBlank()
                confirmPassword.isNullOrBlank()
                Toast.makeText(this, "contact be blank", Toast.LENGTH_LONG).show()
            }
        }
    }
}



