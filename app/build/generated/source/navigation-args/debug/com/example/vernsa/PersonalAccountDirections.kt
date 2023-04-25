package com.example.vernsa

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class PersonalAccountDirections private constructor() {
  public companion object {
    public fun actionPersonalAccountToLandingPage(): NavDirections =
        ActionOnlyNavDirections(R.id.action_personalAccount_to_landingPage)

    public fun actionPersonalAccountToLoginPage(): NavDirections =
        ActionOnlyNavDirections(R.id.action_personalAccount_to_loginPage)
  }
}
