package com.example.vernsa

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class LoginPageDirections private constructor() {
  public companion object {
    public fun actionLoginPageToLandingPage(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginPage_to_landingPage)

    public fun actionLoginPageToForgotPassword(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginPage_to_forgotPassword)

    public fun actionLoginPageToPersonalAccount(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginPage_to_personalAccount)
  }
}
