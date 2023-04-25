package com.example.vernsa.onboarding

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.vernsa.R

public class viewpagerDirections private constructor() {
  public companion object {
    public fun actionViewpager2ToLandingPage(): NavDirections =
        ActionOnlyNavDirections(R.id.action_viewpager2_to_landingPage)
  }
}
