package com.example.mvvmregistration.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class SignInViewModel : ViewModel() {

    private val _email = MutableStateFlow("")
    val email: StateFlow<String> = _email.asStateFlow() // this will be accessed by UI as read-only variable!

    private val _password = MutableStateFlow("")
    val password: StateFlow<String> = _password.asStateFlow() // this will be accessed by UI as read-only variable!

    private val _errorMessage = MutableStateFlow("")
    val errorMessage: StateFlow<String> = _errorMessage.asStateFlow() // to show the error message in UI


    //called when user type into email field to update _email with user's input
    fun onEmailChanged(newEmail: String) {
        _email.value = newEmail
    }


    //called when user type into password field to update _password with user's input
    fun onPasswordChanged(newPassword: String) {
        _password.value = newPassword
    }

    //Validate Inputs
    fun validateInputs(): Boolean {
        if (_email.value.isEmpty() || _password.value.isEmpty()) {
            _errorMessage.value = "Email and password cannot be empty"
            return false
        }
        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(_email.value).matches()) {
            _errorMessage.value = "Invalid email format"
            return false
        }
        _errorMessage.value = ""
        return true
    }


}