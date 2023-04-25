package com.example.vernsa

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class LandingPageDirections private constructor() {
  public companion object {
    public fun actionLandingPageToLoginPage(): NavDirections =
        ActionOnlyNavDirections(R.id.action_landingPage_to_loginPage)

    public fun actionLandingPageToPersonalAccount(): NavDirections =
        ActionOnlyNavDirections(R.id.action_landingPage_to_personalAccount)
  }
}
