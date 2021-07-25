package com.steve.androidtesting.util


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{
    @Test
    fun `test fail if username is null`(){
        val validateUser=RegistrationUtil.validateUser(
            " ",
            "1234",
            "1234"
        )
        assertThat(validateUser).isFalse()
    }
    @Test
    fun `test fail if password is null`(){
        val validateUser=RegistrationUtil.validateUser(
            "chacha",
            "",
            "1234"
        )
        assertThat(validateUser).isFalse()
    }
    @Test
    fun `test fail if confirmpassword is null`(){
        val validateUser=RegistrationUtil.validateUser(
            "chacha",
            "1234",
            ""
        )
        assertThat(validateUser).isFalse()
    }

    @Test
    fun `test fails if password and confirmpassword are not the same`(){
        val validateUser=RegistrationUtil.validateUser(
            "chacha",
            "1234",
            "123"
        )
        assertThat(validateUser).isFalse()
    }

    @Test
    fun `test fails if user doesn't exists is null`(){
        val validateUser=RegistrationUtil.validateUser(
            "chacha",
            "1234",
            "1234"
        )
        assertThat(validateUser).isFalse()
    }
}