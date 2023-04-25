package com.example.vernsa

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class VerifyPasswordDirections private constructor() {
  public companion object {
    public fun actionVerifyPasswordToVerified(): NavDirections =
        ActionOnlyNavDirections(R.id.action_verifyPassword_to_verified)
  }
}
