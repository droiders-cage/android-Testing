package com.steve.androidtesting.util

import android.text.TextUtils

object RegistrationUtil {
    /**
     *Our rules
     * 1. username is not null
     * 2. password is not null
     * 3. password and confirmpassword must be same
     * 4. confirm passowrd is not null
     * 5. username doesn't exist in the database
     */
    val users= listOf<String>("paul","Moha","chacha")
    fun validateUser(
        username: String,
        password: String,
        confirmPassword: String
    ):Boolean{
        if (username.isNullOrBlank() ) {
            return false
        }

        if(password.isNullOrEmpty()){
            return false
        }

        if(confirmPassword.isNullOrEmpty()){
            return false
        }

        if(!password.equals(confirmPassword)){
            return false
        }

        if (users.contains(username)){
            return false
        }


        return true
    }
}