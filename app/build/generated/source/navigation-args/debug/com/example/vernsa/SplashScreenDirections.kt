package com.example.vernsa

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class SplashScreenDirections private constructor() {
  public companion object {
    public fun actionSplashScreenToViewpager2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_splashScreen_to_viewpager2)

    public fun actionSplashScreenToLandingPage(): NavDirections =
        ActionOnlyNavDirections(R.id.action_splashScreen_to_landingPage)
  }
}
