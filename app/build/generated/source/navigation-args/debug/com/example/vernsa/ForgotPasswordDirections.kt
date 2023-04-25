package com.example.vernsa

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class ForgotPasswordDirections private constructor() {
  public companion object {
    public fun actionForgotPasswordToVerifyPassword(): NavDirections =
        ActionOnlyNavDirections(R.id.action_forgotPassword_to_verifyPassword)
  }
}
